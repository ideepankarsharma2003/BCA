def bonus(salary, yos):
    bonus=0
    if yos>5:
        bonus=0.05*salary
    return bonus

salary = float(input('Enter the salary of the employee: '))
yos = int(input('Enter the year of service of the employee: '))
print(f'The net bonus of the employee is {bonus(salary,yos)} as his/her year of service is {yos} years')