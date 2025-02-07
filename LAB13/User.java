import java.util.Scanner;

class ArrayUser {
    private int n;
    private int[] arr;

    // Default constructor
    public ArrayUser() {
        this.n = 0;
        this.arr = new int[0]; // Initialize with an empty array
    }

    // Parameterized constructor to initialize the array with user input
    public ArrayUser(int n, Scanner input) {
        this.n = n;
        this.arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
    }

    // Static method to add two arrays and return a new ArrayUser object with the result
    public static ArrayUser add(ArrayUser arr1, ArrayUser arr2) {
        if (arr1.n != arr2.n) {
            System.out.println("Arrays must be of the same length");
            return new ArrayUser(); // Return an empty ArrayUser object if lengths differ
        }

        ArrayUser result = new ArrayUser(arr1.n); // Initialize with the same size
        for (int i = 0; i < arr1.n; i++) {
            result.arr[i] = arr1.arr[i] + arr2.arr[i];
        }
        return result;
    }

    // Constructor for initializing an array with a given size (used in add method)
    private ArrayUser(int n) {
        this.n = n;
        this.arr = new int[n];
    }

    // Static method to display the array elements
    public static void display(ArrayUser arrayUser) {
        if (arrayUser.n == 0) {
            System.out.println("Array is empty.");
            return;
        }
        for (int i = 0; i < arrayUser.n; i++) {
            System.out.print(arrayUser.arr[i] + " ");
        }
        System.out.println(); // New line for better readability
    }

    // Static method to calculate the average of the array elements
    public static float average(ArrayUser arrayUser) {
        if (arrayUser.n == 0) return 0; // Prevent division by zero

        int sum = 0;
        for (int i = 0; i < arrayUser.n; i++) {
            sum += arrayUser.arr[i];
        }
        return (float) sum / arrayUser.n; // Convert to float for accurate average
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a single Scanner instance
        System.out.print("Enter the number of elements for the arrays(Static):");
        int n = input.nextInt();

        // Initialize two ArrayUser objects with user input
        ArrayUser arr1 = new ArrayUser(n, input);
        System.out.println("ARRAY 1:");
        ArrayUser.display(arr1);

        ArrayUser arr2 = new ArrayUser(n, input);
        System.out.println("ARRAY 2:");
        ArrayUser.display(arr2);

        // Use the static add method to get the sum of arr1 and arr2
        ArrayUser arr3 = ArrayUser.add(arr1, arr2);
        System.out.println("ARRAY 3 (Sum of ARRAY 1 and ARRAY 2):");
        ArrayUser.display(arr3);

        // Display the averages of each array
        System.out.println("Average of ARRAY 1: " + ArrayUser.average(arr1));
        System.out.println("Average of ARRAY 2: " + ArrayUser.average(arr2));
        System.out.println("Average of ARRAY 3: " + ArrayUser.average(arr3));

        input.close(); // Close the scanner to free up resources
    }
}
