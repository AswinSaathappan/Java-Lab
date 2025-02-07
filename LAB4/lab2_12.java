import java.util.Scanner;
public class lab2_12
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        int p,q;
        for(int i = 1;i <=n; i++)
        {
            if(i%2==0)
            {
                p=1;
                q=0;
            }
            else{
                p=0;
                q=1;
            }
            for(int j = 1; j <=i; j++)
            {
               if(j%2==0)
               {
                   System.out.print(p+" ");
               }
               else{
                   System.out.print(q+" ");
               }
            }
             System.out.println();
        }
    }
}