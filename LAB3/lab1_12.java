import java.util.Scanner;

public class lab1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of rows for Matrix 1:");
        int m = input.nextInt();
        System.out.println("Enter number of columns for Matrix 1:");
        int n = input.nextInt();
        int a[][] = new int[m][n];
        
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Enter number of rows for Matrix 2:");
        int M = input.nextInt();
        System.out.println("Enter number of columns for Matrix 2:");
        int N = input.nextInt();
        int b[][] = new int[M][N];
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = input.nextInt();
            }
        }
        
        /*// Display Matrix 1
        System.out.println("\nMATRIX 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display Matrix 2
        System.out.println("\nMATRIX 2:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }*/

        // Addition
        if (m == M && n == N) {
            System.out.println("\nADDITION:");
            int sum[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Addition not possible. Matrices dimensions do not match.");
        }

        // Subtraction
        if (m == M && n == N) {
            System.out.println("\nSUBTRACTION:");
            int diff[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    diff[i][j] = a[i][j] - b[i][j];
                    System.out.print(diff[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Subtraction not possible. Matrices dimensions do not match.");
        }

        // Multiplication
        if (n == M) {
            System.out.println("\nMULTIPLICATION:");
            int mul[][] = new int[m][N];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < N; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication not possible. Column of Matrix 1 must match the row of Matrix 2.");
        }

        input.close();
    }
}