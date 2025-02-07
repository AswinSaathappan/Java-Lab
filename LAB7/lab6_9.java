import java.util.Scanner; 
  
class lab6_9
{     
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine(); 
        String b = scan.nextLine(); 
          
     
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        a = a + b; 
          
 
        b = a.substring(0,a.length()-b.length()); 
         
         
        a = a.substring(b.length()); 
          
 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);         
    }     
} 