public class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id=id;
        this.name= name;
        this.price= price;
    }

    int getId(){
       return id;
    }

    String getName()
    {
        return name;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price)
    {
        this.price=price;
    }
    void displayDetails(){
//        System.out.println("Product Details");
        System.out.println("Product ID: "+ id );
        System.out.println("Product name: "+ name);
        System.out.println("Product price: "+ price);

    }
}
