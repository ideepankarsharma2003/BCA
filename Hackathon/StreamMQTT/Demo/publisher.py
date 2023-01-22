import paho.mqtt.client as mqtt

# Create a new MQTT client
client = mqtt.Client()

# Connect to the broker
client.connect("test.mosquitto.org", 1883)

# Publish a message to the topic
while True:
    message= input("Bhayi kya publish karna hai?  ")
    client.publish("topic", message)
