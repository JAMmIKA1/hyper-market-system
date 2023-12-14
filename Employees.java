package hypermarketsystem;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Employees.
 */
public class Employees {

  public class Inventory {
    public static InventoryEmployee[] query() {
      InventoryEmployee[] employees = new InventoryEmployee[100];
      try {
        File file = new File("./users/InventoryEmployees.txt");
        if (!file.exists()) {
          file.createNewFile();
        }
        Scanner reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
          String[] userinfo = reader.nextLine().split(",\\s*");
          employees[counter++] = new InventoryEmployee(userinfo[0], userinfo[1]);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return employees;
    }

    public static void commit() {
      try {
        FileWriter writer = new FileWriter("./users/InventoryEmployees.txt", false);
        for (InventoryEmployee employee : InventoryEmployee.data) {
          if (employee == null) {
            continue;
          }
          writer.append(employee.getUsername() + ", " + employee.getPassword() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public class Markting {
    public static MarktingEmployee[] query() {
      MarktingEmployee[] employees = new MarktingEmployee[100];
      try {
        File file = new File("./users/MarktingEmployees.txt");
        if (!file.exists()) {
          file.createNewFile();
        }
        Scanner reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
          String[] userinfo = reader.nextLine().split(",\\s*");
          employees[counter++] = new MarktingEmployee(userinfo[0], userinfo[1]);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return employees;
    }

    public static void commit() {
      try {
        FileWriter writer = new FileWriter("./users/MarktingEmployees.txt", false);
        for (MarktingEmployee employee : MarktingEmployee.data) {
          if (employee == null) {
            continue;
          }
          writer.append(employee.getUsername() + ", " + employee.getPassword() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public class SellerMan {
    public static Seller[] query() {
      Seller[] employees = new Seller[100];
      try {
        File file = new File("./users/Sellers.txt");
        if (!file.exists()) {
          file.createNewFile();
        }
        Scanner reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
          String[] userinfo = reader.nextLine().split(",\\s*");
          employees[counter++] = new Seller(userinfo[0], userinfo[1]);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return employees;
    }

    public static void commit() {
      try {
        FileWriter writer = new FileWriter("./users/Sellers.txt", false);
        for (Seller employee : Seller.data) {
          if (employee == null) {
            continue;
          }
          writer.append(employee.getUsername() + ", " + employee.getPassword() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public class AdminUser {
    public static Admin[] query() {
      Admin[] employees = new Admin[100];
      try {
        File file = new File("./users/Admins.txt");
        if (!file.exists()) {
          file.createNewFile();
        }
        Scanner reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
          String[] userinfo = reader.nextLine().split(",\\s*");
          employees[counter++] = new Admin(userinfo[0], userinfo[1]);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return employees;
    }

    public static void commit() {
      try {
        FileWriter writer = new FileWriter("./users/Admins.txt", false);
        for (Admin employee : Admin.data) {
          if (employee == null) {
            continue;
          }
          writer.append(employee.getUsername() + ", " + employee.getPassword() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
