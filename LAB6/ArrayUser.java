import java.util.Scanner;

class ArrayUser {
    private int n;
    private int arr[];

    // Default constructor
    public ArrayUser() {
        this.n = 0;
        this.arr = new int[0]; // Initialize with an empty array to avoid null issues
    }

    // Parameterized constructor to initialize the array with user input
    public ArrayUser(int n, Scanner input) {
        this.n = n;
        this.arr = new int[n];
        System.out.println("\nEnter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }

    // Method to add two arrays and store the result in the current object
    public void add(ArrayUser arr1, ArrayUser arr2) {
        // Ensure both arrays are of the same length
            this.n=arr1.n;
            this.arr = new int[this.n]; // Initialize arr with the correct size
            for (int i = 0; i < this.n; i++) {
                this.arr[i] = arr1.arr[i] + arr2.arr[i];
            }
    }

    // Method to display the array elements
    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for better readability
    }

    // Method to calculate the average of the array elements
    public float average() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return (n > 0) ? (float) sum / n : 0; // Convert to float for accurate average
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);  // Create a single Scanner instance
        System.out.print("Enter the number of elements for the arrays: ");
        int n = input.nextInt();

        // Initialize two ArrayUser objects with user input
        ArrayUser arr1 = new ArrayUser(n, input);
        System.out.println("ARRAY 1:");
        arr1.display();

        ArrayUser arr2 = new ArrayUser(n, input);
        System.out.println("ARRAY 2:");
        arr2.display();

        // Create a third ArrayUser object to store the sum of arr1 and arr2
        ArrayUser arr3 = new ArrayUser(); // Initialize arr3 with default constructor
        arr3.add(arr1, arr2); // Use the add method to calculate the sum
        System.out.println("ARRAY 3 (Sum of ARRAY 1 and ARRAY 2):");
        arr3.display();

        // Display the averages of each array
        System.out.println("Average of ARRAY 1: " + arr1.average());
        System.out.println("Average of ARRAY 2: " + arr2.average());
        System.out.println("Average of ARRAY 3: " + arr3.average());

        input.close(); // Close the scanner to free up resources
    }
}
