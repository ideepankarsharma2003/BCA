d1 = input('Enter some date (dd/mm/yy): ')
d2 = input('Enter some date of same month and year (dd/mm/yy): ')
m1 = int(d1[:2])
m2 = int(d2[:2])
if m1>m2:
    print(f'The date {d2} comes first and the difference between two dates is of {m1-m2} days.')
else:
    print(f'The date {d1} comes first and the difference between two dates is of {m2-m1} days.')



