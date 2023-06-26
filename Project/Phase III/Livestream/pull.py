import base64
import numpy as np
import cv2
import firebase_admin
from firebase_admin import credentials
from firebase_admin import db


# Initialize the Firebase Admin SDK
cred = credentials.Certificate(
    'aibabyhealthcare-firebase-adminsdk-lplf6-b06ab56852.json')
firebase_admin.initialize_app(cred, {
    'databaseURL': 'https://aibabyhealthcare-default-rtdb.firebaseio.com/'
})

# Get a reference to the Realtime Database
ref = db.reference('/webcam_feed')

while True:
    # Get the latest value from the database
    d = ref.get()
    snapshot = d['data']

    # print("started loop")
    # Check if the value is not None
    if snapshot is not None:
        # print("snapshot not none")
        # Decode the base64 encoded string to binary data
        binary_data = base64.b64decode(snapshot)

        # Convert the binary data to a numpy array
        numpy_array = np.frombuffer(binary_data, dtype=np.uint8)

        # Read the numpy array as an image
        img = cv2.imdecode(numpy_array, cv2.IMREAD_UNCHANGED)

        # Display the image
        cv2.imshow('Webcam Feed Pulled', img)

        # Check if the user presses 'q' to exit
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

# Clean up
cv2.destroyAllWindows()
