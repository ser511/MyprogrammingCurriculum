class Arrow {
   public static void main(String[]args) {
    String[] heroes = {"Spiderman", "batman", "daredevil", "Iron Man"};
    heroes[0] = "Superman"; /// changed an array element
    System.out.println(heroes[1]);
   }
}
/* I've learned about arrays and what I know is that now I can have one 
be seen as multiple values within it so long as I use the correct number 
assigned to it. 

*/

class Arraylength {

    public static void main(String[]args) {
        String[] heroes = {"Spiderman", "batman", "daredevil", "Iron Man"};
        System.out.println(heroes.length);
    }
}   /// 

class ArrayLoop {

    public static void main(String[]args) {
        String[] heroes = {"Spiderman", "batman", "daredevil", "Iron Man"};
        for (int i = 0; i < heroes.length; i++) { //I dont really understand this piece 
            System.out.println(heroes[i]);
        }
    }

}

class ArrayForEach { 
    public static void main(String[]args) {
        String[] heroes = {"Spiderman", "batman", "daredevil", "Iron Man"};
        for (String i : heroes) {
            System.out.println(i);
    }// this is a better way to use the loop function
  }
}

class MultiDimensional {

    public static void main(String[]args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
    System.out.println(x);  
    }    
}

class ForLoopForLoop { 
    public static void main(String[]args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
     
            }
        }
    }
}

//loop within a loop and uses incrments of 1
//++ refers to increment by 1 .Now ++i refers to the increment of the value stored inside variable i 