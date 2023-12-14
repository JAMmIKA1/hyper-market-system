package hypermarketsystem;

/**
 * Admin class.
 */
public class Admin extends Person {
  public static Admin[] data = Employees.AdminUser.query();
  private static int counter = 0;

  public Admin(String username, String password) {
    super(username, password);
    type = "admin";
    counter++;
  }
  
  public Admin(int id, String username, String password) {
    super(id, username, password);
    type = "admin";
    counter++;
  }

  public Admin updateUsername(String username) {
    if (search(username) != null) {
      return null;
    }
    this.username = username;
    return this;
  }

  public static Admin search(String username) {
    for (Admin employee : data) {
      if (employee == null) {
        continue;
      }
      if (employee.getUsername().equals(username)) {
        return employee;
      }
    }
    return null;
  }

  public InventoryEmployee addInventoryEmployee(String username, String password) {
    if (InventoryEmployee.search(username) != null) {
      return null;
    }
    int quantity = InventoryEmployee.quantity();
    InventoryEmployee.data[quantity] = new InventoryEmployee(username, password);
    return InventoryEmployee.data[InventoryEmployee.quantity() - 1];
  }

  public boolean removeInventoryEmployee(String username) {
    for (int i = 0; i < InventoryEmployee.data.length; i++) {
      if (InventoryEmployee.data[i] == null) {
        continue;
      }
      if (InventoryEmployee.data[i].getUsername().equals(username)) {
        InventoryEmployee.data[i] = null;
        return true;
      }
    }
    return false;
  }

  public MarktingEmployee addMarktingEmployee(String username, String password) {
    if (MarktingEmployee.search(username) != null) {
      return null;
    }
    int quantity = MarktingEmployee.quantity();
    MarktingEmployee.data[quantity] = new MarktingEmployee(username, password);
    return MarktingEmployee.data[MarktingEmployee.quantity() - 1];
  }

  public boolean removeMarktingEmployee(String username) {
    for (int i = 0; i < MarktingEmployee.data.length; i++) {
      if (MarktingEmployee.data[i] == null) {
        continue;
      }
      if (MarktingEmployee.data[i].getUsername().equals(username)) {
        MarktingEmployee.data[i] = null;
        return true;
      }
    }
    return false;
  }

  public Seller addSeller(String username, String password) {
    if (Seller.search(username) != null) {
      return null;
    }
    int quantity = Seller.quantity();
    Seller.data[quantity] = new Seller(username, password);
    return Seller.data[Seller.quantity() - 1];
  }

  public boolean removeSeller(String username) {
    for (int i = 0; i < Seller.data.length; i++) {
      if (Seller.data[i] == null) {
        continue;
      }
      if (Seller.data[i].getUsername().equals(username)) {
        Seller.data[i] = null;
        return true;
      }
    }
    return false;
  }

  public static int quantity() {
    return counter;
  }
}
