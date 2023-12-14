package hypermarketsystem;

/**
 * Main file.
 */
public class Main {
  public static void main(String[] args) {
    Employees.flushData();

    // MarktingEmployee target = MarktingEmployee.search("dd");
    // if (target == null) {
    //   System.out.println("User not found!");
    // } else if (target.updateUsername("axe") == null) {
    //   System.out.println("Username already found!");
    // } else {
    //   System.out.println("Username updated successfully");
    // }

    boolean notvalid = true;
    do {
      Person result = null;
      switch (Menus.loginType()) {
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
      }
      else {
          System.out.println("\nInvalid email or password!\n");
      }
    } while (notvalid);
    System.out.println("Welcome back!");
    Employees.commit_all();
  }
}
