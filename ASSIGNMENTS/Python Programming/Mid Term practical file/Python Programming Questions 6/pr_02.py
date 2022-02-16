str = input('Enter a string : ')
if str.startswith('is'):
    print('The string starts with "is"')
else:
    print('It does not start with "is"')
    str=(str+'is')

print(str)