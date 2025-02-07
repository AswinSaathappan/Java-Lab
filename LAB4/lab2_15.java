//15.	Given a number, write a program using while loop to reverse the digits of a number.
//E.g. 12345 as 54321.

import java.util.Scanner;
public class lab2_15{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int rev=0,sum=0;
        int original = num;
        while(num!=0)
        {
            int r = num%10;
            rev = rev*10 + r;
            num/=10;
        }
        System.out.println("Reversed of "+ original+"is "+rev);
    }
}