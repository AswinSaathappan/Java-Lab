import java.util.Scanner;

public class lab6_2 {

	public static void main(String[] args) {
		String str;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		str = sc.nextLine();
		
		for(i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}