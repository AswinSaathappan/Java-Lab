import java.util.Scanner;
public class lab2_19b
{
public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter n:");
  int n = input.nextInt();
  for(int i=1; i<=n; i++)
  {
      for(int k=1; k<=n-i; k++)
      {
          System.out.print("  ");
      }
      for(int j=1; j<=i; j++)
      {
          System.out.print(i+" ");
      }
      System.out.println();
  }
}
}