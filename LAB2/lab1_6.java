//6.	Generate the first 100 odd numbers (1, 3, 5, 7, 9, ….) 
class lab1_6{
     public static void main (String[] args) 
    {
        int i=1;
        int n=1;
        while(n<=100)
        {
            System.out.println(i);
            i=i+2;
            n=n+1;
        }
    }
}