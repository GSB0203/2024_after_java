package untitled.src.day3;

class Product
{
  int price;
  int bonusPoint;

  public Product(int price) {
    this.price = price;
    bonusPoint = (int)(price/10.0);
  }
}

class Tv extends Product {
  Tv() {
    super(1000);
  }

  public String toString() {
    return "Tv";
  }
}

public class exercise7_5 {
  public static void main(String[] args) {
    Tv tv = new Tv();
  }
}
