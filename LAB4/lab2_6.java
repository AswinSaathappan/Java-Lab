//6.	Write a program to find the number of and sum of all integers greater than 100 and less than 200 
//that are divisible by 7
import java.util.Scanner;
public class lab2_6
{
  public static void main (String[] args) 
  {
    int num=100;
    int c=0,sum=0;
    while(num>=100 && num<=200)
    {
        if(num%7==0)
        {
            sum=sum+num;
            c++;
        }
        num++;
    }
    System.out.println("Number of integers divisible by 7: " + c);
    System.out.println("Sum of integers divisible by 7: " + sum);
  }
}