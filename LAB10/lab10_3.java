import java.util.Scanner;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class lab10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();  // Get the number of integers to be entered

        int[] numbers = new int[n];  // Array to store the numbers

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  // Input numbers from user
        }

        try {
            // Check for duplicates using a nested loop
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (numbers[i] == numbers[j]) {
                        throw new DuplicateNumberException("Duplicate number found: " + numbers[i]);
                    }
                }
            }
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());  // Display error if duplicates are found
        }
    }
}