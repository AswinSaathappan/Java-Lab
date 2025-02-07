import java.util.Scanner;

public class lab6_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scan.nextLine(); 
        System.out.print("Enter the character you want to remove: ");
       a
        StringBuilder result = new StringBuilder();  
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                result.append(str.charAt(i)); 
            }
        }
        
        System.out.println("String after removal: " + result.toString());
        
        scan.close();  
    }
}