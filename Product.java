package hypermarketsystem;

public class Product {
  public static Product[] data = HyperData.ProductModel.query();
  public static int counterId = 0;
  private double offer;
  private String ProductName;
  private int ProductId;
  private double ProductPrice;
  private int Productquantity;

  public Product(String ProductName, double ProductPrice, int Productquantity) {
    this.offer = 0;
    this.ProductId = ++counterId;
    this.ProductName = ProductName;
    this.ProductPrice = ProductPrice;
    this.Productquantity = Productquantity;
  }

  public Product(int id, String ProductName, double ProductPrice, int Productquantity) {
    this.offer = 0;
    this.ProductId = id;
    this.ProductName = ProductName;
    this.ProductPrice = ProductPrice;
    this.Productquantity = Productquantity;
    ++counterId;
  }

  public static Product search(String ProductName) {
    for (Product product : data) {
      if (product == null) {
        continue;
      }
      if (product.getProductName().equals(ProductName)) {
        return product;
      }
    }
    return null;
  }

  public void setOffer(double offer) {
    this.offer = offer;
  }

  public void setProductName(String ProductName) {
    this.ProductName = ProductName;
  }

  public void setProductPrice(double ProductPrice) {
    this.ProductPrice = ProductPrice;
  }

  public void setProductquantity(int Productquantity) {
    this.Productquantity = Productquantity;
  }

  public double getOffer() {
    return offer;
  }

  public String getProductName() {
    return ProductName;
  }

  public int getProductId() {
    return ProductId;
  }

  public double getProductPrice() {
    return ProductPrice;
  }

  public int getProductquantity() {
    return Productquantity;
  }

  public static int quantity() {
    return counterId;
  }
}
