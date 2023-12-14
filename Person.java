package hypermarketsystem;

/**
 * Person Class.
 */
public abstract class Person {
  public static int counterId = 0;
  protected String username;
  protected String password;
  protected String type;
  protected int id;

  public Person(String username, String password) {
    this.username = username;
    this.password = password;
    this.id = ++counterId;
  }

  public Person(int id, String username, String password) {
    this.username = username;
    this.password = password;
    this.id = id;
  }

  public void updatePassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public int getId() {
    return id;
  }
}
