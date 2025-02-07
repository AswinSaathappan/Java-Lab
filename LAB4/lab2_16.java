import java.util.Scanner;
public class lab2_16
{
 public static void main(String s[])
 {
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the number of terms:");
    int num=scan.nextInt();
    int fact=1,i;
    System.out.printf("%15s %15s\n","Number","Factorial");
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
        System.out.printf("%15s %15s\n",i,fact);
    }
    
 }
}