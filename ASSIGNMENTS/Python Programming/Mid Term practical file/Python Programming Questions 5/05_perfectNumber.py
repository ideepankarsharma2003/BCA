num = int(input('Enter the number: '))
sum = 0
for i in range(1,int(num/2)+1):
    if (num%i==0):
        sum+=i

if(num==sum):
    print('The number is perfect number.')
else:
    print('The number is not a perfect number.')