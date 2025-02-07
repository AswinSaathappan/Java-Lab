import java.util.Scanner;

public class lab2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input purchase amount and type of item
        System.out.print("Enter the purchase amount: ");
        double amount = input.nextDouble();
        
        System.out.print("Enter item type (1 for Mill cloth, 2 for Handloom items): ");
        int itemType = input.nextInt();

        // Initialize discount variable
        double discount = 0.0;

        // Determine the discount based on purchase amount using if statements
        if (amount >= 0 && amount <= 100) {
            discount = 0.0; // Default to no discount
        } else if (amount >= 101 && amount <= 200) {
            discount = 5.0; // Default discount for Mill cloth
        } else if (amount >= 201 && amount <= 300) {
            discount = 7.5; // Default discount for Mill cloth
        } else if (amount > 300) {
            discount = 10.0; // Default discount for Mill cloth
        }

        // Apply specific discounts based on item type using switch
        switch (itemType) {
            case 1: // Mill cloth
                // No change needed for Mill cloth, already set by default discount
                break;
            case 2: // Handloom items
                if (amount >= 0 && amount <= 100) {
                    discount = 5.0;
                } else if (amount >= 101 && amount <= 200) {
                    discount = 7.5;
                } else if (amount >= 201 && amount <= 300) {
                    discount = 10.0;
                } else if (amount > 300) {
                    discount = 15.0;
                }
                break;
            default:
                System.out.println("Invalid item type entered.");
                return;
        }

        // Calculate the net amount
        double discountAmount = (amount * discount) / 100;
        double netAmount = amount - discountAmount;

        // Print the result
        System.out.printf("Purchase Amount: %.2f\n", amount);
        System.out.printf("Discount: %.2f%%\n", discount);
        System.out.printf("Net Amount to be Paid: %.2f\n", netAmount);
    }
}