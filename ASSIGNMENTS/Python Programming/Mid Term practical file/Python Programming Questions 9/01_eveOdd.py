class EveOdd:
    def __init__(self):
        self.even()
        self.odd()
    def even(self):
        for i in range(1, 101):
            if i%2==0:
                print(i, end=' ')
        print()
    def odd(self):
        for i in range(1, 101):
            if i%2!=0:
                print(i, end=' ')
        print()
 
x=EveOdd()