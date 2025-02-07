import java.io.IOException;

public class lab10_2 {
    public static void main(String[] args) {
        int number = -5;  // Example number

        try {
            // Check if the number is negative and throw an exception
            if (number < 0) {
                throw new IOException("Negative number encountered: " + number);
            }
            System.out.println("Number is valid: " + number);
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}