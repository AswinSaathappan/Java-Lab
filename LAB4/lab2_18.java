import java.util.Scanner;

public class lab2_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1, b = 1;

        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        int i = 1;

        do {
            System.out.print(a + " "); // Print the first number
            if (i >= n) break;  // Check if we have reached the number of terms

            System.out.print(b + " "); // Print the second number
            if (i + 1 >= n) break;  // Check again after printing

            a = a + b; // Update a
            b = a + b; // Update b

            i += 2; // Increment by 2 because we print two numbers each time
        } while (i <= n);

        input.close();
    }
}