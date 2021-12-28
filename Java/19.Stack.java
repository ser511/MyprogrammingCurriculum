import java.util.Stack;
import java.util.*;

class StackExample {
    public static void main(String[]args)  {
        //creating an instance of Stack class  
        Stack<Integer> stk= new Stack<>();  
        // checking stack is empty or not  
        boolean result = stk.empty();  
        System.out.println("Is the stack empty? " + result);
        // pushing elements into stack  
        stk.push(78);  
        stk.push(113);  
        stk.push(90);  
        stk.push(120);  
        //prints elements of the stack  
        System.out.println("Elements in Stack: " + stk);  
        result = stk.empty();  
        System.out.println("Is the stack empty? " + result);  
    }
}

class StackPushMethod {
    public static void main(String[]args) 
    
    {
        //creating an object of Stack class  

        Stack <Integer> stk = new Stack<>();
        System.out.println("stack: " +stk);

        //pushing elements into the stack  
        pushelmnt(stk, 20);  
        pushelmnt(stk, 13);  
        pushelmnt(stk, 89);  
        pushelmnt(stk, 90);  
        pushelmnt(stk, 11);  
        pushelmnt(stk, 45);  
        pushelmnt(stk, 18);  

        //popping elements from the stack  
        popelmnt(stk);  
        popelmnt(stk);  

        //throws exception if the stack is empty  

    try 
    {
        popelmnt(stk);
    }
    catch (EmptyStackException e)
    {
        System.out.println("empty stack");
    }

    }


static void pushelmnt(Stack stk, int x)
{
//invoking push() method
stk.push(new Integer(x));
//prints modified stack
System.out.println("push->" + x); 
}

//performing pop operation

static void popelmnt(Stack stk)

{
    System.out.print("pop->");
    Integer x = (Integer) stk.pop();
    System.out.println(x);
    System.out.println("stack:" +stk);
}
}

class SearchMethod {
    public static void main(String[]args) {
        Stack<String> stk= new Stack<>();
        //pushing elements into stack 
        stk.push("Mac Book");
        stk.push("HP");
        stk.push("Dell");
        stk.push("Asus");
        System.out.println("Stack:" + stk);
        //Search an element
        int location = stk.search("HP");
        System.out.println("Location of Dell: " + location);

    }
}

class StackPeekMethod {
    public static void main(String[]args) {
        Stack<String> stk= new Stack<>();
        //pushing elements into Stack
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        stk.push("Orange");
        System.out.println("Stack: " +stk);
        //Access elements from the top of the stack
        String fruits =stk.peek();
        //prints stack
        System.out.println("Element at top of the stack: " +fruits);
    }
}

class StackSizeExample { //this wil be to find the stack size() method of the Vector class
    public static void main(String[]args) {
        Stack stk = new Stack();
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.push(55);
        stk.push(66);
        //Checks the Stack is empty or not 
        boolean rslt=stk.empty();
        System.out.println("Is the stack empty or not? " +rslt);
        //Find the size of the Stack
        int x=stk.size();
        System.out.println("The stack size is: "+x);
    }
}