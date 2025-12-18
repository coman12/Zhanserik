public class Shopper {
    private String name;
    private String email;

    public Shopper(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Shopper: " + name + ", Email: " + email);
    }
}
