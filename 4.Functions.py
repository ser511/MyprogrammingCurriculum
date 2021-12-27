## We will be doing functions, a function is defined using 'def' as the keyword, also learn about Arguments

#this is creating a function

def my_function():    ## this defines the function
    print("Hello from a function")

my_function() ## this one calls it 

## Information can be passed by Arguments

def my_function(fname):
    print(fname + " Refsnes")

my_function("Emil")
my_function("Tobias")
my_function("Linus")

## try it yourself make your own. 
def my_function(finished):  
    print(finished + " Congratulations you've passed!!!")

my_function("Sergio")

## remember functions must be called with the correct amount of arguments