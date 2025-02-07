import java.util.Scanner;
//import java.util.Formatter;
 class lab2_3
{
  public static void main(String arg[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the temp in fahrenheit:");
    float f= obj.nextFloat();
    
    double c=(f-32)/1.8;
   
    System.out.printf("%15s%15s\n","FAHRENHEIT","CELSIUS");
    System.out.printf("%15.2f%15.2f\n",f,c);
   

  System.out.println();
   }
}