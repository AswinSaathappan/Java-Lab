/*8.	Given the list of marks ranging from 0 to 100. Write a program to compute and print the number of 
students who have obtained marks in the range 81 to 100, 61 to 80, 41 to 60 and 0 to 40. The program
should use a minimum number of if statements.*/

import java.util.Scanner;
public class lab2_8
{
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n = scan.nextInt();
    int a[]=new int[n];
    int b,c,d,e;
    b=c=d=e=0;
    for(int i=0; i<n ;i++)
    {
        System.out.print("Student"+ (i+1) +": ");
        a[i] = scan.nextInt();
    }
    for(int i=0; i<n; i++)
    {
        if(a[i]>=81 && a[i]<=100)
        {
            b++;
        }
        if(a[i]>=61 && a[i]<=80)
        {
            c++;
        }
        if(a[i]>=41 && a[i]<=60)
        {
            d++;
        }
        if(a[i]>=0 && a[i]<=40)
        {
            e++;
        }
    }
    System.out.println("0-40: "+e);
    System.out.println("41-60: "+d);
    System.out.println("61-80: "+c);
    System.out.println("81-100: "+b);
    } 
}