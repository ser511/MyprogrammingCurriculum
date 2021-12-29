import java.util.Stack;
import java.util.*;
import java.util.Iterator; 

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

class StackIterationExample {
    public static void main(String[]args) {
        //creating an object of Stack Class
        Stack stk= new Stack();
        //pushing elements into stack
        stk.push("BMW");
        stk.push("Audi");
        stk.push("Bugatti");
        stk.push("Jaguar");
        //iteration over the stack
        
        Iterator iterator =stk.iterator();
        while(iterator.hasNext()) 
        {
            Object values = iterator.next();
            System.out.println(values);
        }
    }

}

class StackIterationExample2 {
    public static void main(String[]args) {
        //creating an instance of Stack class
        Stack <Integer> stk = new Stack<>();
        stk.push(119);
        stk.push(203);
        stk.push(988);
        System.out.println("Iteration over the stack using forEach() Method:");
        //invoking forEach() method for iteration over the stack
        stk.forEach(n ->
        {
            System.out.println(n);
        });
    }

}

class StackIterationExample3 {
    public static void main(String[]args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(119);
        stk.push(203);
        stk.push(988);
        ListIterator<Integer> ListIterator = stk.listIterator(stk.size());
        System.out.println("Iteration over the Stack from top to bottom");
        while (ListIterator.hasPrevious())
        {
            Integer avg = ListIterator.previous();
            System.out.println(avg);
        }
    }
}