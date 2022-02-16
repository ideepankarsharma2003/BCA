num = int(input('Enter the number:  '))

temp = num
sum = 0
while(temp>0):
    r = temp%10
    sum+=(r*r*r)
    temp//=10


if(num==sum):
    print('The number is a armstrong number')
else:
    print('The number is not a armstrong number')
