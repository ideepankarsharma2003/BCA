alpha=0
lett=0
symb=0
str = input('Enter some string:  ')
for i in str:
    if i.isalpha():
        alpha+=1
    elif i.isdigit():
        lett+=1
    else:
        symb+=1
print('Number of alphabets in the string is ', alpha)
print('Number of digits in the string is ', lett)
print('Number of symbols in the string is ', symb)
