l1 =['Ram', 'Hello', 2, 7, 'Ram', 1, 2, 2, '7']
print("The oringinal list is: ", l1)
l2=[]
for item in l1:
    if item not in l2:
        l2.append(item)
print('The list after removing the duplicates: ', l2)
