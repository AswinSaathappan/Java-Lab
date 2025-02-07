public class lab2_10{
    public static void main(String[] args) {
        double rowStart = 0.0;
        double rowEnd = 9.0;
        double rowStep = 1.0;
        double colStart = 0.0;
        double colEnd = 0.9;
        double colStep = 0.1;

        // Print the header row
        System.out.print("Number\t");
        for (double j = colStart; j <= colEnd; j += colStep) {
            System.out.printf("%.1f\t", j);
        }
        System.out.println();

        // Print the table with row labels
        for (double i = rowStart; i <= rowEnd; i += rowStep) {
            System.out.printf("%.1f\t", i);  // Print row label
            for (double j = colStart; j <= colEnd; j += colStep) {
                double value = i + j;
                System.out.printf("%.2f\t", Math.sqrt(value));
            }
            System.out.println();
        }
    }
}