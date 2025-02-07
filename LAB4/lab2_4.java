//4.To find a) area=pi*r*r+2*pi*r*h  b) energy = mas(acceleration *height +velocity2 / 2)

import java.util.Scanner;
public class lab2_4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius:");
        int r = scan.nextInt();
        System.out.print("Enter Height:");
        int h = scan.nextInt();
        System.out.print("Enter mass:");
        int m = scan.nextInt();
        System.out.print("Enter Acceleration:");
        int a = scan.nextInt();
        System.out.print("Enter Velocity:");
        int v = scan.nextInt();
        float area = (float)(Math.PI*r*r + 2 *Math.PI*r*h);
        float energy = (float)(m*((a*h)+(v*v)/2));
        System.out.printf("Area: %.2f",area);
        System.out.printf("\nEnergy: %.2f",energy);
        
        
    }
}