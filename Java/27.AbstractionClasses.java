//Abstract class
abstract class Animal  { 
    //Abstract method (does not have a body)
    public abstract void animalSound();
    //regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal )
class Pig extends Animal  {
    public void animalSound() {
        // The body of animalSound() is provided here 
        System.out.println("The pig says: wee wee");
    }
}
//Remeber when using Main if already use then add a number 
//since there all in one folder
class Main3 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}