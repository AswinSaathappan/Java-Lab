public class lab2_20 {
    public static void main(String[] args) {
        
        System.out.printf("%-10s %-8s %-10s %-10s\n", "Principal", "Rate", "Years", "Value");
        
       
        for (int P = 1000; P <= 10000; P += 1000) {
            
            for (double r = 0.10; r <= 0.20; r += 0.10) {
               
                for (int n = 1; n <= 10; n++) {
                    
                    double v = P * Math.pow(1 + r, n);
                    
                    System.out.printf("%-10d %-8.2f %-10d %-10.2f\n", P, r, n, v);
                }
            }
        }
    }
}
