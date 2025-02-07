import java.util.Scanner;

public class lab1_15 {

    // Function to check if a number is odd or even
    public static String checkOddEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    // Function to find the largest of two numbers
    public static int findLargest(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Function to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Function to calculate the cube of a number
    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Check and display whether each number is odd or even
        System.out.println("First integer is: " + checkOddEven(num1));
        System.out.println("Second integer is: " + checkOddEven(num2));

        // Find and display the largest of the two numbers
        int largest = findLargest(num1, num2);
        System.out.println("The largest of the two numbers is: " + largest);

        // Calculate and display the square and cube of each number
        System.out.println("Square of the first integer: " + square(num1));
        System.out.println("Cube of the first integer: " + cube(num1));
        System.out.println("Square of the second integer: " + square(num2));
        System.out.println("Cube of the second integer: " + cube(num2));

        input.close();
    }
}