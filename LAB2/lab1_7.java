//7.	Generate the first 100 even numbers (0, 2, 4, 6, 8, ….)
class lab1_7{
     public static void main (String[] args) 
    {
        int i=0;
        int n=0;
        while(n<=100)
        {
            System.out.println(i);
            i=i+2;
            n=n+1;
        }
    }
}