package hypermarketsystem;

/**
 * MarktingEmployee class.
 */
public class MarktingEmployee extends Person {
  public static MarktingEmployee[] data = Employees.Markting.query();
  private static int counter = 0;

  public MarktingEmployee(String username, String password) {
    super(username, password);
    type = "markting";
    counter++;
  }

  public MarktingEmployee(int id, String username, String password) {
    super(id, username, password);
    type = "markting";
    counter++;
  }

  public MarktingEmployee updateUsername(String username) {
    if (search(username) != null) {
      return null;
    }
    this.username = username;
    return this;
  }

  public static MarktingEmployee search(String username) {
    for (MarktingEmployee employee : data) {
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
