// This is an example of a hash table from geeksforgeeks link is here https://www.geeksforgeeks.org/hashtable-in-java/
// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class AddElementsToHashtable {
    public static void main(String args[])
    {
        // No need to mention the 
        //Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        //Initialization of a Hashtable
        //using generics
        Hashtable<Integer, String> ht2
        = new Hashtable<Integer, String>();

        //Inserting the elements 
        //using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console 
        System.out.println("Mappings of the ht1 :  " + ht1);
        System.out.println("Mappings of the ht2 :  " + ht2);
    }
}



//Creates a Hashtable which has an initial size specified by fill ratio
//Determines how full a hash table can be before resized upward and its value lies between 0.0 to 1.0
class HashtableIntSizeFloat {
    public static void main(String args []) 
    {
        // No need to mention the 
        // Generic type twice
        Hashtable<Integer, String> ht1
            = new Hashtable<Integer, String> (4, 0.75f);

        //Initialization of a hashtable
        //using generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String> (3, 0.5f);
        
        // Inserting the elements 
        // Using put () method

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        //Printing mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

    }
}


//Creates a hash table that is initialized with the elements in m. 

class HashtableMap {
    public static void main(String args[])
    {
        // No need to mention the 
        //Generic type twice
        Map<Integer, String> hm = new HashMap<>();

        // Inserting the Elements
        //using put() method

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
         
        // Initialization of a Hashtabel
        // using generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>(hm);

        System.out.println("Mappings of ht2 : " + ht2);
    }
}

class HashtableMap2 
{
    public static void main(String[] args)
    {
        // Create an empty Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Add elements to the hashtable 
        ht.put("vishal", 10);
        ht.put("sachin", 30);
        ht.put("vaibhav", 20);

        // Print size of content
        System.out.println("Size of map is: - " + ht.size());
        System.out.println(ht) ;

        //Check if a key is present and if
        // present, print value 
        if (ht.containsKey("vishal")) {
            Integer a = ht.get("vishal");
            System.out.println("value for key"
                                + " \"vishal\"  is:- " + a);
        }
    }
}


//Add an element in Hashtable you use put() method, but the insertion is not retained in the hashtable
//for every element a new hash is generated and elements are indexed based on this hash to make things more efficient

class HashtableAddingElements{
    public static void main(String args [])
    {
        //no need to mention the 
        //Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        //Initialization of a Hashtable
        // using generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();

        // Inserting the Elements 
            // using put()method
        ht1.put(1, "Geeks");
        ht1.put(2, "For");
        ht1.put(3, "Geeks");

        ht2.put(1, "Geeks");
        ht2.put(2, "For");
        ht2.put(3, "Geeks");

            // Print mappings to the console 
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mapping of ht2 : " +ht2);
    }
}

//Java program to demonstrate
// updating hashtable 

class UpdatesOnHashTable {
    public static void main(String args[])
    {

        // Initialization of a Hashtable 
        Hashtable<Integer, String> ht
            = new Hashtable<Integer, String>();
        
        //Inserting the Elements
            //using put method 
        ht.put(1, "Greeks");
        ht.put(2, "Geeks");
        ht.put(3, "Geeks");

            // print initial map to the console 
        System.out.println("Initial Map " +ht);

            //Update the value at key 2 
        ht.put(2, "For");

            // print the updated map
        System.out.println("Updated Map " + ht);
    }
}

//Java program to demonstrate 
// the removing mappings from Hashtable

class RemovingMappingsFromHashtable {

    public static void main(String args[]) 
    {
        // Initialization of a Hashtable 
        Map<Integer, String> ht
            = new Hashtable<Integer, String>();
        
        // Inserting the Elements 
            // using put method 
        ht.put(1, "Geeks");
        ht.put(2, "For");
        ht.put(3, "Geeks");
        ht.put(4, "For");

        // Initial HashMap
        System.out.println("Initial map : " + ht);

            // Remove the map entry with key 4 
           ht.remove(4);
        
        // Final Hashtable
        System.out.println("Updated map : " + ht);
    }
}

class IteratingHashtable {
    public static void main(String[] args)
    {
        // Create an instance of Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements using put method 
        ht.put("vishal", 10);
        ht.put("sachin", 30);
        ht.put("vaibhav", 20);

        //Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " "
                                + e.getValue());
    }
}

