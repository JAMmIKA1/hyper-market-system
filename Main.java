package hypermarketsystem;

/**
 * Main file.
 */
public class Main {
  public static void main(String[] args) {
    Employees.flushData();

    Admin admin = new Admin("admin", "stone");
    admin.addMarktingEmployee("jkl", "ff");
    admin.addMarktingEmployee("add", "423");
    Employees.commit_all();
  }
}
