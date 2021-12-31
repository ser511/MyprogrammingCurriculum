import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


class QueueExample {
    public static void main(String[]args) {
        Queue<Integer> q = new LinkedList<>();
    
    // Adds elements {0,1,2,3,4} to the queue

    for (int i = 0; i < 5; i++)
    q.add(i);

    //Display contents of the queue.
    System.out.println("Elements of queque " + q);

    // To remove the head of queue
    int head = q.peek();
    System.out.println("head of queue-" +head);

    //Rest all methods of collection
    // interface like size and contains 
    //can be used with this 
    //implementation.
    int size = q. size();
    System.out.println("Size of queue-" + size);
    }
}

class GFG  {

    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println(pq);
    }
}

class GFGRemove {
    public static void main(String args[]) 
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove " +pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }
}

class GFGIterateQueue {
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks") ;
        pq.add("For") ;
        pq.add("Geeks");

        Iterator iterator = pq.iterator();
// not sure about the code but I believe it loops it
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

        }
    }
}

/* It is known that a queue follows First-In-First-Out algorithm, 
but sometimes the elements of the queue are needed 
to be processed according to the priority, 
that’s when the PriorityQueue comes into play.
*/
// Java program to demonstrate the
// creation of queue object using the
// PriorityQueue class
class GFGPriorityQueue {
    public static void main(String args[])
    {
        //Creating empty priority queue
        Queue<Integer> pQueue
        = new PriorityQueue<Integer>();

        //Adding items to the pQueue
        //using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of
        //the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element of 
        //the priorityQueue
        System.out.println(pQueue.poll());

        //Printing the top element again
        System.out.println(pQueue.peek());
    }
}

class GFGPriorityBlockingQueue {

    
}