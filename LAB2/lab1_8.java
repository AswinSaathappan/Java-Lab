import java.util.Scanner;

public class lab1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Read the month number from the user
        System.out.print("Enter the number of the month (1-12): ");
        int month = input.nextInt();
        
        // Determine the number of days in the month
        int days;
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                days = 28; // Default to non-leap year
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                input.close();
                return;
        }
        
        // Display the number of days in the month
        System.out.println("Number of days: " + days);
        
        input.close();
    }
}