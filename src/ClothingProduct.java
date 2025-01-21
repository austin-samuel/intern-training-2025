public class ClothingProduct extends Product implements Discountable{
     public String size;
     public ClothingProduct(int id, String name, double price, String size)
     {
         super(id,name,price);
         this.size=size;
     }
     public double calculateDiscount(double price)
     {
         return 0.15*price;
     }

}
