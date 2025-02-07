//2.To read the price of an item in decimal form like 75.95 and print the output in paise (like 7595 paise)

import java.util.Scanner;
public class lab2_2
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter amount:");
  double amount = input.nextDouble();
  //Converting paise to rupees;
  System.out.println("Amount in paise: " + (int)(amount*100));
  }
}