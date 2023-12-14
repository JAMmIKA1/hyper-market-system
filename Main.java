package hypermarketsystem;

import hypermarketsystem.Employees.Markting;

/**
 * Main file.
 */
public class Main {
  public static void main(String[] args) {
    Employees.flushData();

    Admin admin = new Admin("admin", "stone");

    Employees.Markting.commit();
  }
}
