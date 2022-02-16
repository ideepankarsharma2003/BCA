class Add:
    def __init__(self, a, b):
        print('The sum is :',a+b)
class Sub:
    def __init__(self, a, b):
        print('The difference is :', a-b)
class Mul:
    def __init__(self, a, b):
        print('The product is: ', a*b)
class Div:
    def __init__(self, a, b):
        print('The quotient is:' , a//b)
 
a= int(input('Enter the first number: ')) 
b= int(input('Enter the second number: '))
 
x1=Add(a,b)
x1=Sub(a,b)
x1=Mul(a,b)
x1=Div(a,b)