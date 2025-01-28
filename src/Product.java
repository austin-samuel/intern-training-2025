public class Product {

    // Fields
    private int id;
    private String name;
    private double price;
    char type;

    // Methods
    public Product(int id, String name, double price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }
}
