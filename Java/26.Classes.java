// Create a classs named Main with variable x
class Main2 {
    int x = 5;
    
//Created an object called myObj and print the value of x 
    public static void main(String[] args) {
    Main2 myObj1 = new Main2(); //Object 1 
    Main2 myObj2 = new Main2(); //Object 2 
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    }
}

//Creating second class in the same file 
class Second {
    public static void main(String[] args) {
        Main2 myObj = new Main2();
        System.out.println(myObj.x);
    }
}