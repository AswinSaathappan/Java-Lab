import java.util.Scanner;

public class lab2_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the values of the constants
        System.out.print("Enter m: ");
        int m = scan.nextInt();
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();
        System.out.print("Enter d: ");
        int d = scan.nextInt();

        // Compute the denominator
        int denominator = (a * d) - (c * b);

        // Check if the denominator is zero
        if (denominator == 0) {
            System.out.print("No roots found (The denominator is zero, so the equations do not have a unique solution).");
        } else {
            // Compute the values of x1 and x2
            double x1 = (double) ((m * d) - (b * n)) / denominator;
            double x2 = (double) ((n * a) - (m * c)) / denominator;

            System.out.println("Root x1: " + x1);
            System.out.println("Root x2: " + x2);
        }

        scan.close();
    }
}