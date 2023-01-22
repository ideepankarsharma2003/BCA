import paho.mqtt.client as mqtt
import cv2 as cv
import base64
import time



# Publish a message to the topic
# while True:
#     message= input("Bhayi kya publish karna hai?  ")
#     client.publish("topic", message)



# Object to capture the frames
cap = cv.VideoCapture(0)


# Create a new MQTT client
client = mqtt.Client()

# Connect to the broker
client.connect("test.mosquitto.org", 1883)


# # Phao-MQTT Clinet
# client = mqtt.Client()
# # Establishing Connection with the Broker
# client.connect(MQTT_BROKER)

try:
 while True:
  start = time.time()
  # Read Frame
  _, frame = cap.read()
  # Encoding the Frame
  _, buffer = cv.imencode('.jpg', frame)
  # Converting into encoded bytes
  jpg_as_text = base64.b64encode(buffer)
  # Publishig the Frame on the Topic home/server
#   client.publish(MQTT_SEND, jpg_as_text)
  client.publish('livestream', jpg_as_text)
  # client.publish('topic', jpg_as_text)
  end = time.time()
  t = end - start
  fps = 1/t
  time.sleep(2)
  print(fps)
except:
 cap.release()
 client.disconnect()
 print("\nNow you can restart fresh")