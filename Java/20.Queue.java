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
