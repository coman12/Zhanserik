public class Main {
  public static void main(String[] args) {

    Product p1 = new Product("Laptop", 1200);
    Product p2 = new Product("Laptop", 1200);

    Shopper s1 = new Shopper("Eskendir", "eseke@gmail.com");

    Order order1 = new Order(p1, s1, 2);

    order1.displayOrder();

    if (p1.getPrice() == p2.getPrice()) {
      System.out.println("Products have the same price.");
    } else {
      System.out.println("Products have different prices.");
    }
  }
}