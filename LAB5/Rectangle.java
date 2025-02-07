/*5. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
by creating a class named 'Rectangle' with a function named 'Area' which returns the area.
Length and breadth are passed as parameters to its constructor*/

import java.util.Scanner;
class Rectangle{
    private int s1;
    private int s2;
    
    Rectangle(int s1,int s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    public int Area()
    {
        return s1*s2;
    }
    
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        System.out.println("Area of rectangle1: "+r1.Area());
        System.out.println("Area of rectangle2: "+r2.Area());
    }
}