class OverloadingExample {

    // Method with one parameter
    public int add(int a) {
        return a + 10; // Adds 10 to the provided number
    }

    // Method with two parameters
    public int add(int a, int b) {
        return a + b; // Returns the sum of two numbers
    }

    // Method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c; // Returns the sum of three numbers
    }
}
class lab7_3
{
    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        
        // Calling the method with one argument
        System.out.println("Sum with one argument: " + example.add(5)); // Output: 15
        
        // Calling the method with two arguments
        System.out.println("Sum with two arguments: " + example.add(5, 10)); // Output: 15
        
        // Calling the method with three arguments
        System.out.println("Sum with three arguments: " + example.add(5, 10, 15)); // Output: 30
}

