def fact(num):
    if(num==0 or num==1):
        return 1
    return num*fact(num-1)
num = int(input('Enter the number:  '))
print('The factorial of the number is ', fact(num))
