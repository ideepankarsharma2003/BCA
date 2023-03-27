from keras.utils import load_img, img_to_array
from fer import FER
import matplotlib.pyplot as plt
from keras.models import load_model
import cv2
import streamlit as st
import os
import numpy as np
from keras.preprocessing import image
import warnings
import time
import datetime
from collections import deque
from twilio.rest import Client
warnings.filterwarnings("ignore")


def send_message(info_dict, body):

    # Your Account SID from twilio.com/console
    account_sid = 'AC0436791453c88f23bb818240cbd471a2'

    # Your Auth Token from twilio.com/console
    auth_token = info_dict['auth_token']
    client = Client(account_sid, auth_token)
    try:
        message = client.messages.create(
            from_='whatsapp:+14155238886',
            body=body,
            # to='whatsapp:+919639102301'
            to='whatsapp:+918532941430'
            
        )
        print("message sent on whatsapp !!!")
    except:
        print('Error sending message on whatsapp !!!')



with open('credentials.txt', 'r') as myfile:
  data = myfile.read()

info_dict = eval(data)


st.title(" :blue[Smart AI automated Baby Healthcare System :baby:] ")





# Emotion Recognition

emo_dict = {
    'happy': 'current mood :laughing:',
    'sad': 'current mood :disappointed:',
    'angry': 'current mood :angry:',
    'neutral': 'current mood :unamused:',
    'surprise': 'current mood :flushed:',
    'fear': 'current mood :grimacing:',
}

emotion_detector = FER()
face_haar_cascade = cv2.CascadeClassifier(
    cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
st.subheader("Mood Detection Feed: Cam1(Laptop cam)")
col1, col2 = st.columns((2, 5))
with col1:
    start = st.button("Start live input feed")
    stop = st.button("Stop live input feed")
with col2:
    FRAME_WINDOW = st.image([])
    FRAME_TEXT= st.header('')

if start:
    camera = cv2.VideoCapture(0)
    while True:
        _, frame = camera.read()
        rgb_img = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

        # faces_detected = face_haar_cascade.detectMultiScale(rgb_img, 1.32, 5)

        faces_detected = face_haar_cascade.detectMultiScale(rgb_img,
                                                            scaleFactor=1.3,
                                                            minNeighbors=4,
                                                            # minSize=(30, 30),
                                                            flags=cv2.CASCADE_SCALE_IMAGE)

        for (x, y, w, h) in faces_detected:
            cv2.rectangle(frame, (x, y), (x + w, y + h),
                          (255, 0, 0), thickness=7)
            # cropping region of interest i.e. face area from  image
            roi_rgb = rgb_img[y:y + w, x:x + h]
            roi_rgb = cv2.resize(roi_rgb, (224, 224))
            img_pixels = img_to_array(roi_rgb)
            img_pixels = np.expand_dims(img_pixels, axis=0)
            img_pixels /= 255
            predictions = emotion_detector.detect_emotions(rgb_img)

            predicted_emotion, score = emotion_detector.top_emotion(rgb_img)
            # emotion_score = "You look {}: ({})".format(
            #     predicted_emotion, "{:.2f}".format(score))
            # cv2.putText(frame, emotion_score, (int(x), int(y)),
            #             cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)
            cv2.putText(frame, predicted_emotion, (int(x), int(y)),
                        cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)

            FRAME_TEXT.header(emo_dict[predicted_emotion])
        frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        FRAME_WINDOW.image(frame)
        if stop:
            break




    # Motion Tracking and Surveillance


def is_person_present(frame, thresh=1100):
    global foog
    fgmask = foog.apply(frame)
    ret, fgmask = cv2.threshold(fgmask, 250, 255, cv2.THRESH_BINARY)
    fgmask = cv2.dilate(fgmask, kernel=None, iterations=4)
    contours, hierarchy = cv2.findContours(
        fgmask, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    if contours and cv2.contourArea(max(contours, key=cv2.contourArea)) > thresh:
        cnt_max = max(contours, key=cv2.contourArea)
        x, y, w, h = cv2.boundingRect(cnt_max)
        for cnt in contours:
            # print(cnt)
            if cv2.contourArea(cnt) > thresh:
                x_d, y_d, w_d, h_d = cv2.boundingRect(cnt)
                if x_d < x:
                    w += x-x_d
                    x = x_d
                if y_d < y:
                    h += y-y_d
                    y = y_d
        cv2.rectangle(frame, (x, y), (x+w, y+h), (0, 245, 255), 3)
        cv2.putText(frame, 'Motion Detected', (x, y-10),
                        cv2.FONT_HERSHEY_SIMPLEX, 0.3, (0, 255, 0), 1, cv2.LINE_AA)
        fgmask_3 = cv2.cvtColor(fgmask, cv2.COLOR_GRAY2BGR)
        stacked = np.hstack((fgmask_3, frame))
        # return True, frame
        return True, stacked
        # return True, cv2.resize(stacked, None, fx=0.65, fy=0.65)
    # Otherwise report there was no one present
    else:
        fgmask_3 = cv2.cvtColor(fgmask, cv2.COLOR_GRAY2BGR)
        stacked = np.hstack((fgmask_3, frame))
        # return False, frame
        return False, stacked


# Initialize the background Subtractor
# foog = cv2.createBackgroundSubtractorMOG2(
#     detectShadows=True, varThreshold=100, history=2000)
foog = cv2.createBackgroundSubtractorMOG2(
    detectShadows=True, varThreshold=250, history=700)

# Status is True when person is present and False when the person is not present.
status = False

# After the person disapears from view, wait atleast 7 seconds before making the status False
patience = 7

# We don't consider an initial detection unless its detected 15 times, this gets rid of false positives
detection_thresh = 15

# Initial time for calculating if patience time is up
initial_time = None

# We are creating a deque object of length detection_thresh and will store individual detection statuses here
de = deque([False] * detection_thresh, maxlen=detection_thresh)

# Initialize these variables for calculating FPS
fps = 0
frame_counter = 0
start_time = time.time()



st.subheader("Motion Tracking and Surveillance: Cam2(IP cam)")
col3, col4 = st.columns((2, 5))
with col3:
    start1 = st.button("Start Surveillance feed")
    stop1 = st.button("Stop Surveillance feed")
with col4:
    FRAME_WINDOW1 = st.image([])
    FPS = st.header('')
    Time= st.header('')
    Room_Occupied= st.header('')


if start1:
    # cam1 = cv2.VideoCapture(0)
    cam1 = cv2.VideoCapture('http://192.168.205.234:8080/video')
    # cam1 = cv2.VideoCapture('http://192.168.137.110:8080/video')
    while True:
        ret, frame = cam1.read()
        dim = (1024, 720)
        frame = cv2.resize(frame, dim, interpolation=cv2.INTER_AREA)
        if not ret:
            break

        detected, annotated_image = is_person_present(frame, 1500)

        # Register the current detection status on our deque object
        de.appendleft(detected)
        if sum(de) == detection_thresh and not status:
            status = True
            entry_time = datetime.datetime.now().strftime("%A, %I-%M-%S %p %d %B %Y")
            body = f'Alert: I think someone just entered the room at {entry_time}, you should check the livestream !!!'
            send_message(info_dict, body)

        if status and not detected:

                # Restart the patience timer only if the person has not been detected for a few frames so we are sure it was'nt a
                # False positive
            if sum(de) > (detection_thresh/2):

                if initial_time is None:
                    initial_time = time.time()

            elif initial_time is not None:

                # If the patience has run out and the person is still not detected then set the status to False
                # Also save the video by releasing the video writer and send a text message.
                if (time.time() - initial_time) >= patience:
                    status = False
                    exit_time = datetime.datetime.now().strftime("%A, %I:%M:%S %p %d %B %Y")
                    # out.release()
                    initial_time = None

                    body = f'Alert: The room is too silent, Maybe your kid went out at time {exit_time}, you should check the livestream !!!'

                    print(body)
                    send_message(info_dict, body)

        # If significant amount of detections (more than half of detection_thresh) has occured then we reset the Initial Time.
        elif status and sum(de) > (detection_thresh/2):
            initial_time = None

        fps= cam1.get(cv2.CAP_PROP_FPS)

        # Get the current time in the required format
        current_time = datetime.datetime.now().strftime("%A, %I:%M:%S %p %d %B %Y")

        # Display the FPS
        cv2.putText(annotated_image, 'FPS: {:.2f}'.format(
            fps), (510, 450), cv2.FONT_HERSHEY_COMPLEX, 0.6, (255, 40, 155), 2)
        
        FPS.text('FPS: {:.2f}'.format(
            fps))

        # Display Time
        cv2.putText(annotated_image, current_time, (310, 20),
                    cv2.FONT_HERSHEY_COMPLEX, 0.5, (0, 0, 255), 1)
        Time.text(current_time)

        # Display the Room Status
        cv2.putText(annotated_image, 'Room Occupied: {}'.format(str(status)), (10, 20), cv2.FONT_HERSHEY_SIMPLEX, 0.6,
                    (200, 10, 150), 2)
        Room_Occupied.text('Room Occupied: {}'.format(str(status)))

        # Show the patience Value
        if initial_time is None:
            text = 'Patience: {}'.format(patience)
        else:
            text = 'Patience: {:.2f}'.format(
                max(0, patience - (time.time() - initial_time)))

        cv2.putText(annotated_image, text, (10, 450),
                    cv2.FONT_HERSHEY_COMPLEX, 0.6, (255, 40, 155), 2)

        # If status is true save the frame
        # if status:
        #     out.write(annotated_image)
        frame = cv2.cvtColor(annotated_image, cv2.COLOR_BGR2RGB)
        FRAME_WINDOW1.image(frame,  caption="realtime surveillance", width=780)
        if stop1:
            break

b1= st.button("Push stream")
# b2= st.button("Stop pushing the stream")

def run(runfile):
  with open(runfile, "r") as rnf:
    exec(rnf.read())
if b1:
    run('push _with_vipin_creds.py')
# with st.sidebar:
#     v= st.video()
