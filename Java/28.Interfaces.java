//Interface 
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); //  (Does not have a body)
}

//Pig "Implements" the Animal interface 
class Pig implements Animal {
    public void animalSound() {
        //The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
public void sleep() {
    // The body of sleep() is provided here 
    System.out.println("Zzz");
    }
}

class Main4 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}