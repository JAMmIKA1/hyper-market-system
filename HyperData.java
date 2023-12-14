package hypermarketsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * hyperData.
 */
public class HyperData {

  public static void flushData() {
    Product[] products = ProductModel.query();
    Product.counterId = (Product.quantity() != 0)
        ? (products[Product.quantity() - 1].getProductId()) : (0);
    // Admin[] admins = AdminUser.query();
    // MarktingEmployee[] marktings = Markting.query();
    // InventoryEmployee[] inventories = Inventory.query();
    // Seller[] sellers = SellerMan.query();
    //
    // int adminLastId = (Admin.quantity() != 0)
    //     ? (admins[Admin.quantity() - 1].getId()) : (0);
    //
    // int marktingLastId = (MarktingEmployee.quantity() != 0)
    //     ? (marktings[MarktingEmployee.quantity() - 1].getId()) : (0);
    //
    // int inventoryLastId = (InventoryEmployee.quantity() != 0)
    //     ? (inventories[InventoryEmployee.quantity() - 1].getId()) : (0);
    //
    // int sellerLastId = (Seller.quantity() != 0)
    //     ? (sellers[Seller.quantity() - 1].getId()) : (0);
    //
    // Integer[] num = { adminLastId, marktingLastId, inventoryLastId, sellerLastId};
    // int max = Collections.max(Arrays.asList(num));
    // Person.counterId = max;
  }

  public static void commit_all() {
    ProductModel.commit();
  }

  public class ProductModel {
    public static Product[] query() {
      Product[] products = new Product[100];
      try {
        File file = new File("./info/Products.txt");
        if (!file.exists()) {
          file.createNewFile();
        }
        Scanner reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
          String[] userinfo = reader.nextLine().split(",\\s*");
          int id = Integer.valueOf(userinfo[0]);
          String name = userinfo[1];
          double price = Double.parseDouble(userinfo[2]);
          int quantity = Integer.valueOf(userinfo[3]);
          products[counter++] = new Product(id, name, price, quantity);
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return products;
    }

    public static void commit() {
      try {
        FileWriter writer = new FileWriter("./info/Products.txt", false);
        for (Product product : Product.data) {
          if (product == null) {
            continue;
          }
          writer.append(product.getProductId() + ", " + product.getProductName()
            + ", " + product.getProductPrice() + ", " + product.getProductquantity() + '\n');
        }
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
