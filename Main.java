package hypermarketsystem;

/**
 * Main file.
 */
public class Main {
  public static void main(String[] args) {
    Admin tmp = new Admin("mohamed", "stone");
    tmp.removeInventoryEmployee("mohamed_reda");
    Employees.Inventory.commit();
  }
}
