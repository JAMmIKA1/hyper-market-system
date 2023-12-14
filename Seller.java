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

  public Seller(int id, String username, String password) {
    super(id, username, password);
    type = "seller";
    counter++;
  }

  public Seller updateUsername(String username) {
    if (search(username) != null) {
      return null;
    }
    this.username = username;
    return this;
  }

  public static Seller search(String username) {
    for (Seller employee : data) {
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
