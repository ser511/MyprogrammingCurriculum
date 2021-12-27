
/* We will be using Java now to understand Bit today */
/* Bit Operators are used to perform individual bits of a number, they can be used with any 
integral type and performing and updating inbinary index trees */

class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
