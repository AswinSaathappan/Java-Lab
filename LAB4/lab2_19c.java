import java.util.Scanner;
public class lab2_19c
{
public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter n:");
  int n = input.nextInt();
  for(int i=n; i>=1; i--)
  {
      for(int k=1;k<=n-i;k++)
      {
        System.out.print("  ");
      } 
      for(int j=1; j<=i; j++)
      {
          System.out.print("$ ");
      }
      System.out.println();
  }
}
}