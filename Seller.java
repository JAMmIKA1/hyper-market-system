package hypermarketsystem;

/**
 * Seller class.
 */
public class Seller extends Person {
  public static Seller[] data = Employees.SellerMan.query();
  private static int counter = 0;

  public Seller(String username, String password) {
    super(username, password);
    type = "seller";
    counter++;
  }

  public static void updateUsername(String oldUsername, String newUsername) {
    for (Seller employee : data) {
      if (employee == null) {
        continue;
      }
      if (employee.getUsername().equals(oldUsername)) {
        employee.updateUsername(newUsername);
        break;
      }
    }
  }

  public static void updatePassword(String username, String newPassword) {
    for (Seller employee : data) {
      if (employee == null) {
        continue;
      }
      if (employee.getUsername().equals(username)) {
        employee.updatePassword(newPassword);
        break;
      }
    }
  }

  public static int quantity() {
    return counter;
  }
}
