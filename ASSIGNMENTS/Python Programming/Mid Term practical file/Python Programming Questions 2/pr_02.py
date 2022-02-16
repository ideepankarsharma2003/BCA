str = 'I am in second semester'
str = str.replace('second', 'third')
print(str)
# pos1=str.index('third')# returns value error -----> if index not found
# print('position is', pos1)
pos2=str.find('third')# doesn't return value error -----> if index not found
print('position is', pos2)

