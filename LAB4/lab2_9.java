/*9.	Admission to a professional course is subject to the following conditions:
Marks in Mathematics >= 60, Marks in physics >= 50, marks in Chemistry >= 40, 
Total in all three subjects >= 200 (or) total in mathematics and physics >= 200.
Given the marks in the 3 subjects, write a program to process the applications to list the 
eligible candidates.*/

import java.util.Scanner;
public class lab2_9
{
public static void main (String[] args) {
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter Mathematics:");
    int math = scan.nextInt();
    System.out.print("Enter Physics:");
    int phy = scan.nextInt();
    System.out.print("Enter Chemsitry:");
    int chem = scan.nextInt();
    int total = math+phy+chem;
    int mp = math + phy;
    if(math>=60 && phy>=50 && chem>=40)
    {
        if(total>=200 && mp>=150)
        {
            System.out.print("Eligible for application process");
        }
        else{
        System.out.print("Not eligible for application process");
    }
    }
    else{
        System.out.print("Not eligible for application process");
    }
}
}