import java.util.LinkedList;


class Linkedlist {
    public static void main(String[]args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}

class AddFirstLinkedList {
    public static void main(String[]args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // Use addFirst() to add the item to the beginning
    cars.addFirst("Mazda");
    System.out.println(cars);
    }
}

class AddLastLinkedList {
    public static void main(String[]args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // Use addLast() to add the item to the end
    cars.addLast("Mazda");
    System.out.println(cars);
    }
}

class RemoveFirstLinkedList {
    public static void main(String[]args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Use removeFirst() remove the first item from the list
    cars.removeFirst();
    System.out.println(cars);
    }
}

class RemoveLastLinkedList {
    public static void main(String[]args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Use removeLast() remove the last item from the list
    cars.removeLast();
    System.out.println(cars);
    }
}

class GetFirstLinkedList {
    public static void main(String[]args) {
            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            
            // Use getFirst() to display the first item in the list
            System.out.println(cars.getFirst());
    }
}

class GetLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        // Use getLast() to display the last item in the list
        System.out.println(cars.getLast());
}
}