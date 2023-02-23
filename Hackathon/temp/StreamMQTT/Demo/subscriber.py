import paho.mqtt.client as mqtt

# Callback function when a message is received on the subscribed topic
def on_message(client, userdata, msg):
    print("Received message: " + str(msg.payload))

# Create a new MQTT client
client = mqtt.Client()

# Set the callback function
client.on_message = on_message

# Connect to the broker
client.connect("test.mosquitto.org", 1883)

# Subscribe to the topic
client.subscribe("topic")

# Run the client loop
client.loop_forever()
