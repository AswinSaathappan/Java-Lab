//4.	To find if a give number is odd or even.

import java.util.Scanner;
class lab1_4
{
   public static void main (String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number:");
       int a = input.nextInt();
       if(a%2==0)
       {
           System.out.println(a+" is even");
       }
       else{
           System.out.println(a+" is odd");
       }
   }
}