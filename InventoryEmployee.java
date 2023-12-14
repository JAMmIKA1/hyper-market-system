package hypermarketsystem;

/**
 * InventoryEmployee class.
 */
public class InventoryEmployee extends Person {
  public static InventoryEmployee[] data = Employees.Inventory.query();
  private static int counter = 0;

  public InventoryEmployee(String username, String password) {
    super(username, password);
    type = "inventory";
    counter++;
  }

  public static void updateUsername(String oldUsername, String newUsername) {
    for (InventoryEmployee employee : data) {
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
    for (InventoryEmployee employee : data) {
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
