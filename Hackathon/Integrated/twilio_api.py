from twilio.rest import Client

# Read text from the credentials file and store in data variable
with open('credentials.txt', 'r') as myfile:
  data = myfile.read()

# Convert data variable into dictionary
info_dict = eval(data)


account_sid = 'AC0436791453c88f23bb818240cbd471a2'
# auth_token = '[Redacted]'

# Your Auth Token from twilio.com/console
auth_token = info_dict['auth_token']
client = Client(account_sid, auth_token)

message = client.messages.create(
    from_='whatsapp:+14155238886',
    body='Bade achhe lagte hai\n ye dharti\nye nadiya\nye raina\naur tum...',
    # to='whatsapp:+919639102301'
    to='whatsapp:+918532941430'
)

print(message.sid)
