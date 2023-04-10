import cv2
import base64
import firebase_admin
from firebase_admin import credentials
from firebase_admin import db

# Initialize the Firebase Admin SDK
cred = credentials.Certificate(
    'vipinsCredss.json')
firebase_admin.initialize_app(cred, {
    'databaseURL': 'https://relaxdaily-530b7.firebaseio.com/'
})
# cred = credentials.Certificate(
#     'aibabyhealthcare-firebase-adminsdk-lplf6-b06ab56852.json')
# firebase_admin.initialize_app(cred, {
#     'databaseURL': 'https://aibabyhealthcare-default-rtdb.firebaseio.com/'
# })

# Open the webcam and retrieve the frame
cap = cv2.VideoCapture(0)
# cap = cv2.VideoCapture('http://192.168.137.114:8080/video')

ret, frame = cap.read()

# Write webcam feed data to the database
ref = db.reference()
while True:
    ret, frame = cap.read()
    frame= cv2.resize(frame, (720, 512))
    # You can add any image processing logic here
    _, buffer = cv2.imencode('.jpg', frame)
    jpg_as_text = base64.b64encode(buffer)
    ref.child('webcam_feed').set({
        'timestamp': '<current_timestamp>',
        'data': jpg_as_text.decode()
    })
    # You can add any delay here


    print("Captured Frame")
    cv2.imshow('Webcam PUSH to firebase', frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
cap.release()
cv2.destroyAllWindows()
