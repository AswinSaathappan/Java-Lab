
abstract class Employee {
    
    public abstract double calculateSalary();
    public abstract void displayInfo();

class Manager extends Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    
    public Manager(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

   
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private String name;
    private double baseSalary;
    private int overtimeHours;
    private double overtimeRate;

   
    public Programmer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class lab7_2 {
    public static void main(String[] args) {
       
        Employee manager = new Manager("Alice", 60000, 5000);
        manager.displayInfo();

        
        Employee programmer = new Programmer("Bob", 50000, 10, 20);
        programmer.displayInfo();
    }
}
