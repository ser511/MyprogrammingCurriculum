 class Recursion { 
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}



//Halting condition, its important to know that recursive functions 
//can run into infinite recursion
//which is the condition where the function stops calling itself

class Halting {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
        
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end -1);
        } else {
            return end;
        }
    }
}
