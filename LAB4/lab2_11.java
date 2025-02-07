import java.util.Scanner;
public class lab2_11
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        int k=1;
        for(int i = 1; i <= n; i++)
        {
            for(int j=1 ; j <= i ;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
