public class lab10_5 {
    public static void solve(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }
        solve(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        solve(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int N = 3; // Number of disks
        solve(N, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}