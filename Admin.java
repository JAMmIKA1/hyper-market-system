package hypermarketsystem;

/**
 * Admin class.
 */
public class Admin extends Person {
  public static Admin[] data = Employees.AdminUser.query();

  public Admin(String username, String password) {
    super(username, password);
    type = "admin";
  }
  
  public InventoryEmployee addInventoryEmployee(String username, String password) {
    int quantity = InventoryEmployee.quantity();
    InventoryEmployee.data[quantity] = new InventoryEmployee(username, password);
    return InventoryEmployee.data[InventoryEmployee.quantity() - 1];
  }

  public void removeInventoryEmployee(String username) {
    for (int i = 0; i < InventoryEmployee.data.length; i++) {
      if (InventoryEmployee.data[i] == null) {
        continue;
      }
      if (InventoryEmployee.data[i].getUsername().equals(username)) {
        InventoryEmployee.data[i] = null;
        break;
      }
    }
  }

  public MarktingEmployee addMarktingEmployee(String username, String password) {
    int quantity = MarktingEmployee.quantity();
    MarktingEmployee.data[quantity] = new MarktingEmployee(username, password);
    return MarktingEmployee.data[MarktingEmployee.quantity() - 1];
  }

  public void removeMarktingEmployee(String username) {
    for (int i = 0; i < MarktingEmployee.data.length; i++) {
      if (MarktingEmployee.data[i] == null) {
        continue;
      }
      if (MarktingEmployee.data[i].getUsername().equals(username)) {
        MarktingEmployee.data[i] = null;
        break;
      }
    }
  }

  public Seller addSeller(String username, String password) {
    int quantity = Seller.quantity();
    Seller.data[quantity] = new Seller(username, password);
    return Seller.data[Seller.quantity() - 1];
  }

  public void removeSeller(String username) {
    for (int i = 0; i < Seller.data.length; i++) {
      if (Seller.data[i] == null) {
        continue;
      }
      if (Seller.data[i].getUsername().equals(username)) {
        Seller.data[i] = null;
        break;
      }
    }
  }
}
