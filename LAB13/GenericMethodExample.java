// Generic Method to Print Elements of an Array
public class GenericMethodExample {

    // A generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer Array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String Array
        String[] stringArray = {"Hello", "World", "Generics"};

        // Calling the generic method with Integer array
        System.out.println("Integer Array:");
        printArray(intArray);

        // Calling the generic method with String array
        System.out.println("String Array:");
        printArray(stringArray);
    }
}
