ch = int(input('Enter the number of classes held: '))
ca = int(input('Enter the number of classes the student attended: '))
perc = ca/ch
perc = perc*100
if(perc<75):
    print(f'The student is not allowed to sit in exams as his percentage of class attended is {perc}.')
else:
    print(f'The student is allowed to sit in exams as his percentage of class attended is {perc}.')
