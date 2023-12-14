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

  public static void updateUsername(String oldUsername, String newUsername) {
    for (MarktingEmployee employee : data) {
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
    for (MarktingEmployee employee : data) {
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
