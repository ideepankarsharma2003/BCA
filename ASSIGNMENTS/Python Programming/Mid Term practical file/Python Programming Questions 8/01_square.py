class Square:
    def __init__(self, length, breadth):
        self.length=length
        self.breadth= breadth
        if length==breadth:
            print('It is a Square !!')
        else:
            print('It is not a Square !!')
   
length = int(input('Enter the length: '))
breadth = int(input('Enter the breadth: '))
    
sq1 = Square(length, breadth)
