import java.util.*;
public class Product {
    private int id;
    private String name;
    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("The fields are:\nid: " + id + "\nname: " + name + "\nprice: " + price);
    }

    public static void main(String[] args) {
        Product obj = new Product(1, "halwa", 24.6);
        double pr = obj.getPrice();
        obj.displayDetails();
    }
}

