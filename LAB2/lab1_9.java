import java.util.Scanner;

public class lab1_9 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        // Input: Read the radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        // Calculate diameter, circumference, and area
        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        
        // Display the results in a table format
        System.out.printf("%-20s %-20s%n", "Property", "Value");
        System.out.printf("%-20s %-20.2f%n", "Diameter:", diameter);
        System.out.printf("%-20s %-20.2f%n", "Circumference:", circumference);
        System.out.printf("%-20s %-20.2f%n", "Area:", area);
        
        input.close();
    }
}