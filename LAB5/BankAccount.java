/*2. Create a class for bank account that has name of the depositor, type of account, account 
number, and balance amount. The class should have methods that assigns initial values, to 
deposit an amount, to withdraw amount after checking balance and to display the name and 
balance. (Use Constructors also)*/ 

import java.util.Scanner;
class BankAccount
{
    private String depositor;
    private String Accounttype;
    private int AccountNo;
    private int Balance;
    
     
    public BankAccount(String depositor,String Accounttype,int AccountNo)
    {
      this.depositor=depositor;
      this.Accounttype=Accounttype;
      this.AccountNo=AccountNo;
    }
    
    public void deposit(int amount)
    {
        if(amount>0)
        {
        Balance =  Balance + amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    
    public void withdraw(int amount)
    {
        if(amount<=Balance)
        {
        Balance = Balance - amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    } 
     
     public void display()
     {
         System.out.println("Depositor Name: "+depositor);
         System.out.println("AccountType: "+Accounttype);
         System.out.println("AccountNo: "+AccountNo);
         System.out.println("Balance: "+Balance);
     }
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        BankAccount b = new BankAccount("Aswin","SavingsAccount",18801234);
        System.out.print("Enter deposit amount:");
        int am1 = input.nextInt();
        System.out.print("Enter withdraw amount:");
        int am2 = input.nextInt();
        b.deposit(am1);
        b.withdraw(am2);
        b.display();
    }
    
}