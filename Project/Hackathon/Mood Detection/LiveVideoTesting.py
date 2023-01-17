import os
import cv2
import numpy as np
from keras.preprocessing import image
import warnings
warnings.filterwarnings("ignore")
# from keras.preprocessing.image import load_img, img_to_array 
from keras.utils import load_img, img_to_array 
from keras.preprocessing import image 
from keras.models import  load_model
import matplotlib.pyplot as plt
import numpy as np
from fer import FER


# load model
# model = load_model("best_model.h5")

emotion_detector= FER()


face_haar_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')


cap = cv2.VideoCapture(0)

while True:
    ret, test_img = cap.read()  # captures frame and returns boolean value and captured image
    if not ret:
        continue
    rgb_img = cv2.cvtColor(test_img, cv2.COLOR_BGR2RGB)

    faces_detected = face_haar_cascade.detectMultiScale(rgb_img, 1.32, 5)

    for (x, y, w, h) in faces_detected:
        cv2.rectangle(test_img, (x, y), (x + w, y + h), (255, 0, 0), thickness=7)
        roi_rgb = rgb_img[y:y + w, x:x + h]  # cropping region of interest i.e. face area from  image
        roi_rgb = cv2.resize(roi_rgb, (224, 224))
        img_pixels = img_to_array(roi_rgb)
        img_pixels = np.expand_dims(img_pixels, axis=0)
        img_pixels /= 255

        # predictions = model.predict(img_pixels)
        predictions= emotion_detector.detect_emotions(rgb_img)

        # find max indexed array
        # max_index = np.argmax(predictions[0])

        # emotions = ('angry', 'disgust', 'fear', 'happy', 'sad', 'surprise', 'neutral')
        # predicted_emotion = emotions[max_index]
        predicted_emotion, score= emotion_detector.top_emotion(rgb_img)
        emotion_score = "You look {}: ({})".format(predicted_emotion, "{:.2f}".format(score))


        cv2.putText(test_img, emotion_score, (int(x), int(y)), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)

    resized_img = cv2.resize(test_img, (1000, 700))
    cv2.imshow('Facial emotion analysis ', resized_img)

    if cv2.waitKey(10) == ord('q'):  # wait until 'q' key is pressed
        break

cap.release()
cv2.destroyAllWindows