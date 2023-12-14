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

  public Product addProduct(String ProductName, double ProductPrice, int Productquantity) {
    if (Product.search(ProductName) != null) {
      return null;
    }
    int products = Product.quantity();
    Product.data[products] = new Product(ProductName, ProductPrice, Productquantity);
    return Product.data[Product.quantity() - 1];
  }

  public boolean removeProduct(String ProductName) {
    for (int i = 0; i < Product.data.length; i++) {
      if (Product.data[i] == null) {
        continue;
      }
      if (Product.data[i].getProductName().equals(ProductName)) {
        Product.data[i] = null;
        return true;
      }
    }
    return false;
  }

  public static int quantity() {
    return counter;
  }
}
