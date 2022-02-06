// Java Program for Method Overloading 
// By using Different Types of Arguments 

// Class 1 
//Helper class
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {

        //Returns product of integer numbers 
        return a * b;
    }

    //Method 2 
    //With same name but 2 double parameters
    static double Multiply(double a, double b)
    {

        //Returns product of double numbers 
        return a * b;
    }
}

//Class 2 
// Main class
class GFG21 { 

    // Main driver method 
    public static void main(String[] args)
    {

        // Calling method by passing 
        // input as in arguments 
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}

// Real world example of polymorphism which is by definition is tohave many forms
// A man can be a Father, A Husband and an employee

// Polymorphisim is divided into two parts 
// Compile time and Runtime Polymorphism

//Compile Time Polymorphism is also known as Static polymorphism
// and is achieved by function overloading or operator overloading 
//!! Java doesnt support the operator overloading


//Runtime polymorphism
// Alos known as Dynamic Method Dispatch a process in were a function call to the overridden method is resolved at Runtime
//This is achieved by Method overriding 
