class HistPlot:
    def __init__(self, l):
        for i in l:
            print('* '*i)
 
l1=[]
x=int(input('Enter number of elements in the list: '))
for i in range(x):
    l1.append(int(input(f'Enter the element at {i}th index: ')))
x=HistPlot(l1)