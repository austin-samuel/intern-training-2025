public class ShoppingSystem{
    public static void main(String[] args){
        ElectronicProduct e= new ElectronicProduct(1,"halwa",24.6,5);
        ClothingProduct c= new ClothingProduct(1,"halwa",24.6,"medium");
    e.displayDetails();
    c.displayDetails();
    double d1=e.calculateDiscount(e.price);
    double d2=c.calculateDiscount(c.price);
    System.out.println("Discount of Electronic is: "+d1+" and final price is "+(e.price-d1));
    System.out.println("Discount of Clothing is: "+d2+" and final price is "+(c.price-d2));
}
}
