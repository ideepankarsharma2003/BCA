import base64
import cv2 as cv
import numpy as np
import paho.mqtt.client as mqtt


frame = np.zeros((240, 320, 3), np.uint8)

# The callback for when a PUBLISH message is received from the server.
def on_message(client, userdata, msg):
    global frame
    # Decoding the message
    img = base64.b64decode(msg.payload)
    print(f'image frame received')
    # converting into numpy array from buffer
    npimg = np.frombuffer(img, dtype=np.uint8)
    # Decode to Original Frame
    frame = cv.imdecode(npimg, 1)
  


# Create a new MQTT client
client = mqtt.Client()

# Set the callback function
client.on_message = on_message

# Connect to the broker
client.connect("test.mosquitto.org", 1883)

# Subscribe to the topic
client.subscribe("livestream")

# Run the client loop
# client.loop_forever()


# Starting thread which will receive the frames
client.loop_start()

while True:
    cv.imshow("Stream", frame)
    if cv.waitKey(1) & 0xFF == ord('q'):
        break

# Stop the Thread
client.loop_stop()
