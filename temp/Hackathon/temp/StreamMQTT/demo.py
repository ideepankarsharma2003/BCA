import paho.mqtt.client as mqtt

# Callback function when the client connects to the broker
def on_connect(client, userdata, flags, rc):
    print("Connected with result code " + str(rc))
    # Subscribe to the topic
    client.subscribe("test_topic")

# Callback function when a message is received on the subscribed topic
def on_message(client, userdata, msg):
    print("Received message: " + str(msg.payload))

# Create a new MQTT client
client = mqtt.Client()

# Set the callback functions
client.on_connect = on_connect
client.on_message = on_message

# Connect to the broker
client.connect("test.mosquitto.org", 1883)

# Publish a message to the topic
client.publish("test_topic", "Hello World!")

# Run the client loop
client.loop_forever()
