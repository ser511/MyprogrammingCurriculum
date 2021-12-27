import java.util.ArrayList; // import the ArrayList class
import java.util.Collections; //import for Collections Class

class ArrayLists { //add an item
    public static void main(String[]args){
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}

class AccessItem { //access items
    public static void main(String[]args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(0)); //this is the difference and it is specifying which element you would like to add
    }
}

class ChangeAnItem { //change an item
    public static void main(String[]args) {
        ArrayList<String> cars = new ArrayList<String>();//still not sure what this means
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.set(0, "Opel"); // This changes it from being last to switching with Volvo
    System.out.println(cars);
    }
}

class RemoveItem { //remove an item
    public static void main(String[]args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);
    }
}

class ArraylistSize { //I can use the "size" method to see how many elements an Array list have 
    public static void main(String[]arg) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
            System.out.println(cars.size()); // within the brackets you can see size being used 
        }

    }


class LoopThroughArraylist {
    public static void  main(String[]args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }

}/* were specifying looping the elements of an arraylist 
and how many time a loop should run */


class Sortarraylist {
    public static void main(String[]args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);

    } 

}
}
