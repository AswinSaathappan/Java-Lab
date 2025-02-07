import java.util.Scanner;

public class lab6_4 {

	public static void main(String[] args) {
		String str;
		int i, digi;
		digi = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		str = sc.nextLine();
		
		for(i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				digi++;
			}
		    else{
		        digi = 0;
		        break;
		    }
		}		
	    if(digi == 0)
	    {
	        System.out.println("It is not digit string");
	    }
	    else{
	        System.out.println("It is a digit string");
	    }
	}
}