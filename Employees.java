package hypermarketsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Employees.
 */
public class Employees {

  public static void flushData() {
    Admin[] admins = AdminUser.query();
    MarktingEmployee[] marktings = Markting.query();
    InventoryEmployee[] inventories = Inventory.query();
    Seller[] sellers = SellerMan.query();

    int adminLastId = (Admin.quantity() != 0)
        ? (admins[Admin.quantity() - 1].getId()) : (0);

    int marktingLastId = (MarktingEmployee.quantity() != 0)
        ? (marktings[MarktingEmployee.quantity() - 1].getId()) : (0);

    int inventoryLastId = (InventoryEmployee.quantity() != 0)
        ? (inventories[InventoryEmployee.quantity() - 1].getId()) : (0);

    int sellerLastId = (Seller.quantity() != 0)
        ? (sellers[Seller.quantity() - 1].getId()) : (0);

    Integer[] num = { adminLastId, marktingLastId, inventoryLastId, sellerLastId};
    int max = Collections.max(Arrays.asList(num));
    Person.counterId = max;
  }

  public static void commit_all() {
    AdminUser.commit();
    Markting.commit();
    Inventory.commit();
    SellerMan.commit();
  }

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
          int id = Integer.valueOf(userinfo[0]);
          employees[counter++] = new InventoryEmployee(id, userinfo[1], userinfo[2]);
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
          writer.append(employee.getId() + ", " + employee.getUsername() + ", " + employee.getPassword() + '\n');
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
          int id = Integer.valueOf(userinfo[0]);
          employees[counter++] = new MarktingEmployee(id, userinfo[1], userinfo[2]);
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
          writer.append(employee.getId() + ", " + employee.getUsername() + ", " + employee.getPassword() + '\n');
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
          int id = Integer.valueOf(userinfo[0]);
          employees[counter++] = new Seller(id, userinfo[1], userinfo[2]);
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
          writer.append(employee.getId() + ", " + employee.getUsername() + ", " + employee.getPassword() + '\n');
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
          int id = Integer.valueOf(userinfo[0]);
          employees[counter++] = new Admin(id, userinfo[1], userinfo[2]);
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
          writer.append(employee.getId() + ", " + employee.getUsername() + ", " + employee.getPassword() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
