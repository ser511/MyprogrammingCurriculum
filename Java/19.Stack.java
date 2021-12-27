import java.util.Stack;

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
}

static void pushelmnt(Stack stk, int x)
{
//invoking push() method
stk.push(new Int(x));
//prints modified stack
System.out.println("push->" + x); 
}

//performing pop
