/*1. Write a program to create a class that contains two methods add() and sub() that performs 
addition and subtraction of two numbers respectively and print the output. */

import java.util.Scanner;
public class AddSub
{
    private int x;
    private int y;
    public AddSub(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int add()
    {
        return x+y;
    }
    
    public int sub()
    {
        return x-y;
    }
    
    public static void main(String args[])
    {
        AddSub obj = new AddSub(6,5);
        int sum = obj.add();
        int diff = obj.sub();
        System.out.println("SUM:"+sum);
        System.out.println("DIFF:"+diff);
    }
}
