public class StaticExample {

    // Static field
    private static int count = 0;

    // Static method
    public static void incrementCount() {
        count++;
        System.out.println("Count incremented to: " + count);
    }

    // Static nested class
    public static class StaticNestedClass {
        // Static method in nested class
        public static void displayMessage() {
            System.out.println("This is a static method in a static nested class.");
        }
        
        // Non-static method in nested class
        public void showCount() {
            // Can access static members of the outer class
            System.out.println("Current count from static nested class: " + count);
        }
    }

    public static void main(String[] args) {
       
        StaticExample.incrementCount();//incrementCount()

    
        StaticExample.StaticNestedClass.displayMessage();

       
        StaticExample.StaticNestedClass nestedClassInstance = new StaticExample.StaticNestedClass();
        nestedClassInstance.showCount();
    }
}
