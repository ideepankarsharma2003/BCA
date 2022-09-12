import sys

with open(sys.argv[1], 'r') as my_file:
    # print(my_file.readline())
    t= int(my_file.readline()) # number of test cases
    count= 0
    # print(f't= {t}')

    for i in range(t):
        s= my_file.readline()
        l= s.split()
        if int(l[0])>1 and int(l[1])>2:
            count+=1
            # print(l)

    print(count)

