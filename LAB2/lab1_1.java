//1.	To read 3 numbers and find the largest of the three.
import java.util.Scanner;
public class lab1_1
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a:");
	    int a = input.nextInt();
	    System.out.print("Enter b:");
	    int b = input.nextInt();
	    System.out.print("Enter c:");
	    int c = input.nextInt();
	    if(a>b && a>c)
	    {
	        System.out.println(a+" is greater");
	    }
	    else if(b>c && b>a)
	    {
	        System.out.println(b+" is greater");
	    }
	    else{
	        System.out.println(c+" is greater");
	    }
	}
}
