// using final keyword allows for other classes 
//to not inherit from a class

final class Vehicle {
    protected String brand =
    "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Main17 extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Main17 myFastCar = new Main17();
        myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}

// If you try to access a final class, Java will generate an error: