//classes and objects
// Structure of a Class
// class <<class name>>{
//data members with or without access specifiers
//methods
// new() method to create an object
//obj.method()   to call a function

class A

{

void displayA()   // Methods 
{
System.out.println("Inside class A -Java Programming");
}
}

class B

{
void displayB() 
{
System.out.println("Inside class B -Java Programming");
}
}

class C
{

void displayC() 
{
System.out.println("Inside class C -Java Programming");
}

public static void main(String args[])
{
 A  a1= new A();

 B  b1= new B();

 C  c1 = new C();

System.out.println("Inside class C -main program-Java Programming");
a1.displayA();
b1.displayB();
c1.displayC();

 //A a2;     // object not initialized 
 //a2.displayA();
 A a2=new A(); a2.displayA();


}
}
