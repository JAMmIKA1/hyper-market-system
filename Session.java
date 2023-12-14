package hypermarketsystem;


/**
 * Session class.
 */
public class Session {
  public static MarktingEmployee authenticateMarkting(String username, String password) {
    MarktingEmployee target = MarktingEmployee.search(username);
    if (target == null || !target.getPassword().equals(password)) {
      return null;
    }
    return target;
  }

  public static Admin authenticateAdmin(String username, String password) {
    Admin target = Admin.search(username);
    if (target == null || !target.getPassword().equals(password)) {
      return null;
    }
    return target;
  }

  public static Seller authenticateSeller(String username, String password) {
    Seller target = Seller.search(username);
    if (target == null || !target.getPassword().equals(password)) {
      return null;
    }
    return target;
  }

  public static InventoryEmployee authenticateInventory(String username, String password) {
    InventoryEmployee target = InventoryEmployee.search(username);
    if (target == null || !target.getPassword().equals(password)) {
      return null;
    }
    return target;
  }
}
