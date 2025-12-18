public class Order {
    private Product product;
    private Shopper shopper;
    private int quantity;

    public Order(Product product, Shopper shopper, int quantity) {
        this.product = product;
        this.shopper = shopper;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public void displayOrder() {
        shopper.displayInfo();
        product.displayInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: $" + getTotalPrice());
    }
}
