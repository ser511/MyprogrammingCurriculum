//Java program Illustrating Set Interface

//Importing utility classes 
import java.util.*;

//Main class 
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        //Demonstrating  Set using Hashset
        //Declaring object of type String 
        Set<String> hash_Set = new HashSet<String>();

        //Adding elements to the Set 
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object 
        System.out.println(hash_Set);
    }
}



//Java program demonstrating Operations on the set 
//such as Union, Intersection and Difference operations

//Main class 
class SetExample {

    //Main driver method 
    public static void main(String args[])
    {
        // Creating an object of Set class 
        //Declaring object of integer type 
        Set<Integer> a = new HashSet<Integer>();

        //Adding all elements to List
        a.addAll (Arrays.asList(
            new Integer[] {1, 3, 2, 4, 8, 9, 0 }));
        
        //Again declaring object of Set class 
        //with reference to HashSet
            Set<Integer> b = new HashSet<Integer>();
        
        b.addAll(Arrays.asList(
            new Integer[]{ 1, 3, 7, 5, 4, 0, 7, 5 }));
        
        //To find union 
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        //To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

    }
}


//Java Program Demonstrating working of Set by 
//Adding elements using add() method 
class GFG2 {

    //Main dirver method
    public static void main(String [] args)
    {
        //Creating an object of Set and
        //declaring object of type string 
        Set<String> hs = new HashSet<String>();

        //Adding elements to above object 
        //using add() method 
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");

        // Printing the elements inside the Set object 
        System.out.println(hs);
    }
}


//Java code to demonstrate Working of Set by 
//Accessing the Elements of the set object

class GFG3 {
    //Main Drive method 
    public static void main(String[] args)
    {
        //Creating an object of Set and 
        //declaring object of type String 
        Set<String> hs = new HashSet<String>();

        // Elements are added using add() method
        // Later onwards we will show accessing the same 

        // Custom input elements 
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");

        // Print the Set object elements
        System.out.println("Set is " + hs); 

        //Declaring a string 
        String check = "D";

        //Check if the above string exists in 
        // the SortedSet or not
        // using contains () method
        System.out.println("Contains " + check + " "
                            + hs.contains (check));
    }
}



//Java Program Demonstrating Working of Set by 
//Removing Elements from the Set

//Main class
class GFG4 {

    //Main Driver method 
    public static void main(String[] args)
    {
        //Declaring object Set of type String
        Set<String> hs = new HashSet<String>();

        //Elements are added 
        //using add() method

        //Custom input elements 
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");

        // Printing initial Set elements 
        System.out.println("Initial HashSet " + hs);

        // Removing custom element
        //using remove() method 
        hs.remove("B");

        //Printing Set Elements after removing an element
        //and printing updated Set elements 
        System.out.println("After removing element " + hs);
    }
}

// Java Program to Demonstrate Working of Set by 
// Iterating through the Elements

//Importing utility classes 

//Main Class
class GFG5 {
    
    //Main Driver method 
    public static void main(String[] args)
    {
        // Creating object of Set and Declaring String type 
        Set<String> hs = new HashSet<String> ();

        //Adding elements to Set 
        //using add() metho 

        //Custom input elements 
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");

        // Iterating through the Set 
        //via for-each loop
        for (String value : hs)

            // Printing all the values inside the object 
            System.out.print (value + ", ");

        System.out.println();

    }
}

//Java program Demonstrating Creation of Set object 
//Using the Hashset class

//Main class 
class GFG6 {

    //Main driver ethod 
    public static void main(String [] args)
    {
        // Creating object of Set of type String 
        Set<String>  h = new HashSet<String>();

        //Adding elements into the HashSet 
        //using add() method 

        //Custom input elements 
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding the duplicat element
        h.add("India");


        // Displaying the HashSet
        System.out.println(h);

        //Removing items from HashSet 
        //using remove() method 
        h.remove("Austrailia");
        System.out.println("Set after removing "
                            + "Austrailia:" + h);

        // Iterating over hash set items 
        System.out.println("Iterating over set:");

        //Iterating through iterators 
        Iterator<String> i = h.iterator();

        //It holds true till there is a single element
        // remaining in the object 
        while (i.hasNext())

            System.out.println(i.next());
    }
}

// Java program to demonstrate the 
//creation of the set object
// using the enumSet class 


