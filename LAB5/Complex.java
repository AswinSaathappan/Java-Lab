/*6. Print the sum of two complex numbers by creating a class named 'Complex' with separate
functions for sum and print whose real and imaginary parts are entered by the user. Initialize
the objects using a constructor*/

class Complex{
    private int real;
    private int imag;
    
    public Complex()
    {
        real = 0;
        imag = 0;
    }
    public Complex(int real , int imag)
    {
        this.real = real;
        this.imag = imag;
    }
    
    public void Add(Complex c1 , Complex c2)
    {
        this.real = c1.real + c2.real;
        this.imag = c2.imag + c2.imag;
    }
    public void display()
    {
        if(imag>=0)
        {
        System.out.print(real+"+"+imag+"i");
        }
        else{
        System.out.print(real+""+imag+"i");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Complex c1 = new Complex(4,5);
        Complex c2 = new Complex(4,-5);
        Complex c3 = new Complex();
        c3.Add(c1,c2);
        c1.display();
        c2.display();
        c3.display();
    }
}