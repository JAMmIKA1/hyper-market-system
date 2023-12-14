package hypermarketsystem;

import java.util.Scanner;

/**
 * Menus.
 */
public class Menus {
  /**
   * login as loop menu.
   */
  private static Scanner userInput = new Scanner(System.in);
  public static char loginType() {

    System.out.println("--* Login as *--");
    System.out.println("\n1. Admin\n2. Inventory employee\n3. Markting employee\n4. Seller\n");

    System.out.print("> ");
    char choice = userInput.next().charAt(0);

    if (choice == 'q' || choice == 'Q') {
      System.exit(0);
    }

    return choice;
  }
  
  public static Admin adminLogin() {
    System.out.print("Username: ");
    String username = userInput.next();
    System.out.print("Password: ");
    String password = userInput.next();
    return Session.authenticateAdmin(username, password);
  }

  public static MarktingEmployee marktingLogin() {
    System.out.print("Username: ");
    String username = userInput.next();
    System.out.print("Password: ");
    String password = userInput.next();
    return Session.authenticateMarkting(username, password);
  }
  
  public static InventoryEmployee inventoryLogin() {
    System.out.print("Username: ");
    String username = userInput.next();
    System.out.print("Password: ");
    String password = userInput.next();
    return Session.authenticateInventory(username, password);
  }
  
  public static Seller sellerLogin() {
    System.out.print("Username: ");
    String username = userInput.next();
    System.out.print("Password: ");
    String password = userInput.next();
    return Session.authenticateSeller(username, password);
  }
}
