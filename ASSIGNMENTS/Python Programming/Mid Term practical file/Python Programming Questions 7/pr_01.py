def vowels(str):
    count =0
    for i in str:
        if i=='a' or i=='e' or i=='i' or i=='o' or i=='u':
            count+=1
    return count

str = input('Enter some string: ')
print('Number of vowels in the string is ', vowels(str))
