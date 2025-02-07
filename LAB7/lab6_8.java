import java.util.Scanner;

public class lab6_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        
        System.out.print("Enter the starting position (n): ");
        int n = scan.nextInt();
        
        System.out.print("Enter the number of characters to extract (m): ");
        int m = scan.nextInt();
    
        if (n < 0 || n >= str.length() || m < 0 || n + m > str.length()) 
        {
            System.out.println("Invalid input. Please ensure n and m are within valid ranges.");
        }
        else{
        String ex = str.substring(n, n + m);
        System.out.println("Extracted string: " + ex);
        }        
        
        scan.close(); 
    }
}
