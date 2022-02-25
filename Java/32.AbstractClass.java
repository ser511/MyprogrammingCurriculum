//Java porgram to illustrate that an instance of Abstract
// Class can not be created

//Class 1 
//Abstract class

abstract class Base {
    abstract void fun();
}

// Class 2 
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}

// Class 3 
// Main Class
class Main32 {

    //Main driver method 
    public static void main(String args [])
    {

        // Uncommenting the following line will cause 
        //compiler error as the line tries to create an 
        // instance of abstract class. Base b  = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        b.fun();
    }
}

// Similar to C++ abstract class can contain constructors in Java
//
