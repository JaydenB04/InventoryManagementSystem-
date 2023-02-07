import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagementSystem {
  public static void main(String[] args) {
    // Create a HashMap to store the inventory
    HashMap<String, Integer> inventory = new HashMap<>();

    // Add some initial items to the inventory
    inventory.put("Apple", 10);
    inventory.put("Banana", 5);
    inventory.put("Carrot", 20);
    inventory.put("Dragonfruit", 15);

    Scanner scanner = new Scanner(System.in);

    // Start the inventory management loop
    while (true) {
      // Display the current inventory
      System.out.println("Inventory:");
      for (String item : inventory.keySet()) {
        System.out.println(item + ": " + inventory.get(item));
      }

      // Prompt the user for an action
      System.out.println("What would you like to do?");
      System.out.println("1. Add item");
      System.out.println("2. Remove item");
      System.out.println("3. Update item quantity");
      System.out.println("4. Quit");

      int action = scanner.nextInt();

      // Add item
      if (action == 1) {
        System.out.println("Enter the item name:");
        String item = scanner.next();
        System.out.println("Enter the item quantity:");
        int quantity = scanner.nextInt();
        inventory.put(item, quantity);
      }

      // Remove item
      else if (action == 2) {
        System.out.println("Enter the item name:");
        String item = scanner.next();
        inventory.remove(item);
      }

      // Update item quantity
      else if (action == 3) {
        System.out.println("Enter the item name:");
        String item = scanner.next();
        System.out.println("Enter the new quantity:");
        int quantity = scanner.nextInt();
        inventory.put(item, quantity);
      }

      // Quit
      else if (action == 4) {
        break;
      }
    }

    // Close the scanner
    scanner.close();
  }
}
