package hypermarketsystem;

import java.util.Scanner;

/**
 * Menus.
 */
public class Menus {
  /**
   * login as loop menu.
   */
  public static char loginType() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("--* Login as *--");
    System.out.println("\n1. Admin\n2. Inventory employee\n3. Markting employee\n4. Seller\n");

    System.out.print("> ");
    char choice = userInput.next().charAt(0);

    if (choice == 'q' || choice == 'Q') {
      System.exit(0);
    }

    userInput.close();
    return choice;
  }
}
