import java.util.Scanner;

class Main {  
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // Read the input as a String
        String str = input.nextLine();
        
        // Create a StringBuilder from the input String
        StringBuilder sb = new StringBuilder(str);
        
        // Reverse the StringBuilder and compare it with the original input
        String revstr = sb.reverse().toString();
        
        if (str.equals(revstr)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both are not equal");
        }
        
        // Close the scanner
        input.close();
    }  
}
