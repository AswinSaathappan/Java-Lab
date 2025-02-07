//11.	Write a Java program to read and display a matrix.
import java.util.Scanner;
class lab1_11
{
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter rows:");
    int m=input.nextInt();
    System.out.println("Enter column:");
    int n=input.nextInt();
    int a[][]=new int[m][n];
    System.out.println("Enter array elements:");
    for(int i=0; i<m; i++)
    {
        for(int j = 0;j < n;j++)
        {
            a[i][j]=input.nextInt();
        }
    }
    
    System.out.println("\nMATRIX\n:");
    for(int i=0;i<m;i++)
    {
        for(int j = 0; j < n;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        }
}
}
