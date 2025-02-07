public class OverloadingExample {

    // Method with two integer parameters
    public int multiply(int a, int b) {
        return a * b; // Returns the product of two integers
    }

    // Method with two double parameters
    public double multiply(double a, double b) {
        return a * b; // Returns the product of two doubles
    }

    // Method with an integer and a double parameter (order matters)
    public double multiply(int a, double b) {
        return a * b; // Returns the product of an integer and a double
    }

    // Method with a double and an integer parameter (order matters)
    public double multiply(double a, int b) {
        return a * b; // Returns the product of a double and an integer
    }
}

class lab7_4
{   
        public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        
        // Calling the method with two integers
        System.out.println("Multiply two integers: " + example.multiply(5, 10)); // Output: 50
        
        // Calling the method with two doubles
        System.out.println("Multiply two doubles: " + example.multiply(5.5, 2.0)); // Output: 11.0
        
        // Calling the method with an integer and a double
        System.out.println("Multiply integer and double: " + example.multiply(5, 2.0)); // Output: 10.0
        
        // Calling the method with a double and an integer
        System.out.println("Multiply double and integer: " + example.multiply(5.5, 2)); // Output: 11.0
}
