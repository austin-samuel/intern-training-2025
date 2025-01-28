public class ShoppingSystem {
    public static void main(String[] args) {
//        Product obj1 = new Product(101, "Bottle", 90.50);
//        System.out.println(obj1.getId());
//        System.out.println(obj1.getName());
//        System.out.println(obj1.getPrice());
//        obj1.setPrice(105.75);
//        obj1.displayDetails();
        ElectronicProduct ep1 = new ElectronicProduct(102, "Heater", 8000.00, 5);
        ClothingProduct cp1 = new ClothingProduct(103, "Sweater", 3000.00, "Medium");

        ep1.displayDetails();
        cp1.displayDetails();

        System.out.println("Discounted Price of Electronic Product = "+(ep1.getPrice()-ep1.calculateDiscount(ep1.getPrice())));
        System.out.println("Discounted Price of Clothing Product = "+(cp1.getPrice()-cp1.calculateDiscount(cp1.getPrice())));

    }
}
