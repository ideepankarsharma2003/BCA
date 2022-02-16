class rectangle():
    def __init__(self, l, b):
        self.l = l
        self.b = b
        print("length and breadth of rectangle:", self.l, self.b)

    def area(self):
        return self.b*self.l


x = int(input("enter the length number: "))
y = int(input("enter the breadth number: "))
if(x == y):
    print("it is a square")
else:
    lb = rectangle(x, y)
    print("area of rectangle: ", lb.area())
    print("it is not a square")
