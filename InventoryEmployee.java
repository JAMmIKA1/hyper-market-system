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

  public InventoryEmployee(int id, String username, String password) {
    super(id, username, password);
    type = "inventory";
    counter++;
  }

  public InventoryEmployee updateUsername(String username) {
    if (search(username) != null) {
      return null;
    }
    this.username = username;
    return this;
  }

  public static InventoryEmployee search(String username) {
    for (InventoryEmployee employee : data) {
      if (employee == null) {
        continue;
      }
      if (employee.getUsername().equals(username)) {
        return employee;
      }
    }
    return null;
  }

  public static int quantity() {
    return counter;
  }
}
