class EqTriangle:
    def __init__(self, x1, x2, x3):
        self.x1 = x1
        self.x2 = x2
        self.x3 = x3
        if x1 == x2 and x2==x3:
            print('It is a Equilateral Triangle !!')
        else:
            print('It is not a Equilateral Triangle !!')
  
  
x1 = int(input('Enter the side1: '))
x2 = int(input('Enter the side2: '))
x3 = int(input('Enter the side3: '))
  
sq1 = EqTriangle(x1, x2, x3)
