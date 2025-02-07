//1.	To determine the sum of the following harmonic series for a given value of n:
//1+1/2+1/3+…+ 1/n

import java.util.Scanner;
public class lab2_1{

public static void main(String args[])
{
  Scanner input = new Scanner(System.in);
  System.out.print("Enter n:");
  int n = input.nextInt();
  double sum  = 0;
  for(int i = 1; i <= n; i++)
  {
     sum = sum + (1.0/i);
  }
  System.out.println("Sum upto "+ n +" terms: "+sum);
} 
}
