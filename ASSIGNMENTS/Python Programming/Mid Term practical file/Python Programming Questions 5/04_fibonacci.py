num = int(input('Enter the range for the series: '))
f1, f2 = 0, 1

for i in range(1,num+1):
    if i==1:
        print(f1)
    else:
        fn = f1+f2
        print(fn)
        f1 = f2
        f2 = fn
