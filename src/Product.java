public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }

    void setPrice(double price){
        this.price = price;
    }

    void displayDetails(){
        System.out.println(this.id+" | "+this.name+" | "+this.price);
    }
}
