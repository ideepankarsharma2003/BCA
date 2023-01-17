import cv2
import streamlit as st


def webcam():
    # Start the webcam
    cap = cv2.VideoCapture(0)
    while True:
        # Get a frame from the webcam
        ret, frame = cap.read()
        ret, frame = cap.read()
        if ret:
            # Convert the frame to a format that Streamlit can display
            frame = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
            # Display the frame in the app
            st.pyplot(frame)
        # Check if the user wants to stop the live feed
        if st.button("Stop live input feed"):
            break
    # Release the webcam
    cap.release()


if st.button("Start live input feed"):
    webcam()
