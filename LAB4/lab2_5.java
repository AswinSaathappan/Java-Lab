import java.util.Scanner;

public class lab2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input values from the user
        System.out.print("Enter the demand rate (items per unit time): ");
        double demandRate = scan.nextDouble();
        
        System.out.print("Enter the setup costs (per order): ");
        double setupCosts = scan.nextDouble();
        
        System.out.print("Enter the holding cost (per item per unit time): ");
        double holdingCost = scan.nextDouble();
        
        // Compute EOQ and TBO using the given formulas
        double EOQ = Math.sqrt((2 * demandRate * setupCosts) / holdingCost);
        double TBO = Math.sqrt((2 * setupCosts) / (demandRate * holdingCost));

        // Output the results
        System.out.println("Economic Order Quantity (EOQ): " + EOQ);
        System.out.println("Optimal Time Between Orders (TBO): " + TBO);
        
        scan.close();
    }
}