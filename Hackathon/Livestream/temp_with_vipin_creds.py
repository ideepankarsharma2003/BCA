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
ref = db.reference()
print("yaha ssab badiya")