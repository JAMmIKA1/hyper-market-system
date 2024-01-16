package hypermarketsystem;

import java.util.Scanner;

/**
 * Menus.
 */
public class Menus {
  private static Scanner userInput = new Scanner(System.in);

  /**
   * login as loop menu.
   */
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

  public static void adminMenu(String username) {
    Admin user = Admin.search(username);
    System.out.println("\n--* Welcome " + username + " *--\n");
    System.out.println("""
        1- Add Marketing employee
        2- Add Inventory employee
        3- Add Seller employee
        4- Update Marketing employee
        5- Update Seller employee
        6- Update Inventory employee
        7- Delete Marketing employee
        8- Delete Inventory employee
        9- Delete Seller employee
        8- List all employees
        9- Update My Information
        10-Check Reports
        """);

  }

  public static void inventoryMenu(String username) {
    InventoryEmployee user = InventoryEmployee.search(username);
    System.out.println("\n--* Welcome " + username + " *--\n");
    user.addProduct("meat", 32, 10);
    HyperData.commit_all();
  }

  public static void marktingMenu(String username) {
    MarktingEmployee user = MarktingEmployee.search(username);
    System.out.println("\n--* Welcome " + username + " *--\n");
  }

  public static void sellerMenu(String username) {
    Seller user = Seller.search(username);
    System.out.println("\n--* Welcome " + username + " *--\n");
  }
}
