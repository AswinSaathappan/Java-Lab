public class lab10_1a{
    public static void main(String[] args) {
        int number = -5;  // Example number

        // Assertion to check if number is positive
        assert number > 0 : "Number is not positive!";  // This will throw an AssertionError if the condition is false

        System.out.println("Number is positive: " + number);
    }
}
