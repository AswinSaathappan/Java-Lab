//2.	Given three numbers a, b, and c, find the smallest number
import java.util.Scanner;
public class lab1_2
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a:");
	    int a = input.nextInt();
	    System.out.print("Enter b:");
	    int b = input.nextInt();
	    System.out.print("Enter c:");
	    int c = input.nextInt();
	    if(a<b && a<c)
	    {
	        System.out.println(a+" is smaller");
	    }
	    else if(b<c && b<a)
	    {
	        System.out.println(b+" is smaller");
	    }
	    else{
	        System.out.println(c+" is smaller");
	    }
	}
}