public class Product {
    private  final int id;
    private final String name;
    double price;
    //parameterised constructor for initializing values
    public Product(int id,String name,double price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }

//    public int getId()
//    {
//        return id;
//    }
//     public String getName()
//     {
//         return name;
//     }

    public double getPrice()
    {
        return price;
    }
    //     public void setPrice(double price)
//     {
//         this.price=price;
//
//     }
    void display_Details()
    {
        System.out.println("Your id is "+id);
        System.out.println("Your name is "+name);
        System.out.println("Your price is "+price);
    }

}
interface Discountable
{
    double calculateDiscount(double price);
}
//electronic product class created
class ElectronicProduct extends Product implements Discountable
{
    private  final int warrantyInYears;
    public ElectronicProduct(int id, String name, double price, int warrantyInYears) {
        super(id, name, price);
        this.warrantyInYears = warrantyInYears;
    }
    public double calculateDiscount ( double price)
    {
        return price*0.10;
    }
    public void display_Details()
    {
        super.display_Details();
        System.out.println("warranty in years is: "+warrantyInYears);
    }

}
//clothing class created
class ClothingProduct extends Product implements Discountable {
    private final String size;

    public ClothingProduct(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }
    public double calculateDiscount(double price)
    {
        return price*0.15;
    }
    public void display_Details()
    {
        super.display_Details();
        System.out.println("size is : "+size);
    }
}


