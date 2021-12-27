##Statements will use the most common statements IF, FOR, ELSE
x = int(input("Please enter an integer: "))

if x < 0: 
    x = 0
    print('Negative changed to Zero')
elif x == 0:
    print('Zero')
elif x == 1:
    print('single')
else:
    print('more')


