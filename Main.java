package hypermarketsystem;

/**
 * Main file.
 */
public class Main {
  public static void main(String[] args) {
    Employees.flushData();
    HyperData.flushData();

    // MarktingEmployee target = MarktingEmployee.search("dd");
    // if (target == null) {
    //   System.out.println("User not found!");
    // } else if (target.updateUsername("axe") == null) {
    //   System.out.println("Username already found!");
    // } else {
    //   System.out.println("Username updated successfully");
    // }

    boolean notvalid = true;
    char choice;
    Person result;
    do {
      result = null;
      choice = Menus.loginType();
      switch (choice) {
        case '1':
          result = Menus.adminLogin();
          break;

        case '2':
          result = Menus.inventoryLogin();
          break;

        case '3':
          result = Menus.marktingLogin();
          break;
        
        case '4':
          result = Menus.sellerLogin();
          break;

        default:
          System.out.println("\nInvalid choice!\n");
          break;
      }
      if (result != null) {
        notvalid = false;
      } else {
        System.out.println("\nInvalid email or password!\n");
      }
    } while (notvalid);

    switch (choice) {
      case '1':
        Menus.adminMenu(result.getUsername());
        break;
      case '2':
        Menus.inventoryMenu(result.getUsername());
        break;
      case '3':
        Menus.marktingMenu(result.getUsername());
        break;
      case '4':
        Menus.sellerMenu(result.getUsername());
        break;
      default:
        System.exit(0);
    }
    Employees.commit_all();
  }
}
