import java.util.*;


class GFG8 {

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
;


    public static void main(String[] args) 
    {
        //Creating a set 
        Set<Gfg> set1;
    
        // Adding the elements 
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,
        Gfg.LEARN, Gfg.CODE);
    
        System.out.println("Set 1: " + set1);
    }
}

class GFG9 {

    public static void main(String[] args)
    { 
        Set<String> lh = new LinkedHashSet<String>();

        // Adding elements into the LinkedHashSet
        //using add()
        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");

        //Adding the duplicate 
        //element
        lh.add("India");

        // Displaying the LinkedHashSet
        System.out.println(lh);

        //Removing items from LinkedHashSet 
        //using remove()
        lh.remove("australia");
        System.out.println("Set after removing "
                            + "Austrailia:" + lh);
        
        // Iterating over linked hash set items
        System.out.println("Iterating over set: ");
        Iterator<String> i = lh.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}


//Java Program Demonstrating Creation of Set object
// Using the TreeSet class 

//Main class 
class GFG10 {

    //Main driver method 
    public static void main(String[] args )
    {
        //Creating a Set object and declaring it of String 
        //type 
        //with reference to TreeSet 
        Set<String> ts = new TreeSet<String>();

        //Adding elements into the TreeSet
        //using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        //Adding the duplicate 
        //element
        ts.add("India");

        //Displaying the TreesSet
        System.out.println(ts);

        //Removing items from TreeSet
        //using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                            + "Australia:" +ts);

        //Iterating over Tree set items 
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();

        while (i.hasNext())
            System.out.println(i.next());

    }
}