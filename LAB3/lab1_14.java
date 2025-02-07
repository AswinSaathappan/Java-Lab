import java.util.Scanner;
import java.time.Year;

public class lab1_14 {

    // Function to calculate age
    public static int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue(); // Get the current year
        return currentYear - birthYear; // Subtract birth year from current year
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their year of birth
        System.out.print("Enter your year of birth: ");
        int birthYear = input.nextInt();

        // Calculate the age
        int age = calculateAge(birthYear);

        // Display the age
        System.out.println("Your age is: " + age + " years old.");

        input.close();
    }
}