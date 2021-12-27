/* Overall hear we broke down and wanted to understand specific common commands like "public"
*/
public class Bytes { //Had to change this to the title of the file previously was "7.Byte.java" now is "Bytes.java" not sure why
                    // Basically where code starts, "public" specifies where and who can access the method  
    public static void main(String[]   //Continuation: "static" is a keyword and when associated with a method becomes class related
args) {                     // Continuation: The main() method is static so that JVM can invoke it without representing the class
                            //"void" means there is a keyword used to specify a keyword doesn't return anything
    byte myNum = 100;       // "main" means name of Java main method. the identifier JVM looks for as the starting point of a java program. It’s not a keyword.
                                    //"String" sotres java command line arguments and is an array of type java.lang.String class
    System.out.println(myNum);  // This prints out my number I put for "myNum"

}

}