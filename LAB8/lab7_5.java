class lab7_5 {

    public static void main(String[] args) {
        System.out.println("Main method with String array called.");
        // Calling overloaded main methods
        main(10);            
        main(10, 20);         
        main("Hello", "World"); 
    }

   
    public static void main(int a) {
        System.out.println("Overloaded main method with one integer: " + a);
    }

   
    public static void main(int a, int b) {
        System.out.println("Overloaded main method with two integers: " + a + " and " + b);
    }

   
    public static void main(String str1, String str2) {
        System.out.println("Overloaded main method with two strings: " + str1 + " and " + str2);
    }
}
