import cv2
import streamlit as st


import os
import numpy as np
from keras.preprocessing import image
import warnings
warnings.filterwarnings("ignore")
from keras.utils import load_img, img_to_array 
from keras.preprocessing import image 
from keras.models import  load_model
import matplotlib.pyplot as plt
from fer import FER

emotion_detector= FER()
face_haar_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
st.title("Face Emotion Recognition System")
col1, col2= st.columns((5,5))
with col1:
    start= st.button("Start live input feed")
with col2:
    stop= st.button("Stop live input feed")
FRAME_WINDOW = st.image([])

if start:
    camera = cv2.VideoCapture(0)
    while True:
        _, frame = camera.read()
        rgb_img = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

        faces_detected = face_haar_cascade.detectMultiScale(rgb_img, 1.32, 5)

        for (x, y, w, h) in faces_detected:
            cv2.rectangle(frame, (x, y), (x + w, y + h), (255, 0, 0), thickness=7)
            roi_rgb = rgb_img[y:y + w, x:x + h]  # cropping region of interest i.e. face area from  image
            roi_rgb = cv2.resize(roi_rgb, (224, 224))
            img_pixels = img_to_array(roi_rgb)
            img_pixels = np.expand_dims(img_pixels, axis=0)
            img_pixels /= 255
            predictions= emotion_detector.detect_emotions(rgb_img)
            
            predicted_emotion, score= emotion_detector.top_emotion(rgb_img)
            emotion_score = "You look {}: ({})".format(predicted_emotion, "{:.2f}".format(score))
            cv2.putText(frame, emotion_score, (int(x), int(y)), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)


        frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        FRAME_WINDOW.image(frame)
        if stop:
            break