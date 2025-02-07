import java.util.Scanner;
import java.util.Vector;

public class ListMgr {
    private Vector<String> list;

    // Constructor to initialize the list with 5 items
    public ListMgr() {
        list = new Vector<>(5);
    }

    // Method to add an item at a specific location
    public void addAt(String item, int pos) {
        if (pos >= 0 && pos <= list.size()) {
            list.add(pos, item);
            System.out.println("Item added at position " + (pos) + ".");
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Method to add an item at the end of the list
    public void addEnd(String item) {
        list.add(item);
        System.out.println("Item added at the end.");
    }

    // Method to remove an item from the list
    public void remove(String item) {
        if (list.remove(item)) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Method to print the contents of the list
    public void print() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Shopping List:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListMgr mgr = new ListMgr();

        // Initialize the list with 5 items
        System.out.println("Enter 5 items for the list:");
        for (int i = 0; i < 5; i++) {
            mgr.addEnd(sc.nextLine());
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Remove an item");
            System.out.println("2. Add an item at a position");
            System.out.println("3. Add an item at the end");
            System.out.println("4. Print the list");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = sc.nextLine();
                    mgr.remove(itemToRemove);
                    break;
                case 2:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = sc.nextLine();
                    System.out.print("Enter the position (0-based index): ");
                    int pos = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    mgr.addAt(itemToAdd, pos);
                    break;
                case 3:
                    System.out.print("Enter the item to add: ");
                    String itemToAddEnd = sc.nextLine();
                    mgr.addEnd(itemToAddEnd);
                    break;
                case 4:
                    mgr.print();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
