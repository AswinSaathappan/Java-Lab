import java.util.Scanner;

public class lab2_14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input value
        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        // Using nested if statements
        int YNestedIf;
        if (x > 0) {
            YNestedIf = 1;
        } else {
            if (x == 0) {
                YNestedIf = 0;
            } else {
                YNestedIf = -1;
            }
        }
        System.out.println("Using nested if statements: Y = " + YNestedIf);

        // Using else if statements
        int YElseIf;
        if (x > 0) {
            YElseIf = 1;
        } else if (x == 0) {
            YElseIf = 0;
        } else {
            YElseIf = -1;
        }
        System.out.println("Using else if statements: Y = " + YElseIf);

        // Using conditional (ternary) operator
        int YTernary = (x > 0) ? 1 : (x == 0) ? 0 : -1;
        System.out.println("Using conditional (ternary) operator: Y = " + YTernary);
    }
}