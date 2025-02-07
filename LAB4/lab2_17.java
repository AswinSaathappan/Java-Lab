
//17.	Write a program that compute sum of digits of a given integer number

import java.util.Scanner;
public class lab2_17
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int digit,original = num;
        int sum = 0;
        while(num!=0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Reverse of "+original+" is "+sum);
    }
}