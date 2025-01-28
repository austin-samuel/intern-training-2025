public class ShoppingSystem {
    public static void main(String[] args) {
        ElectronicProduct e1 = new ElectronicProduct(1, "AC" , 9999.99, 10);
        ClothingProduct c1 = new ClothingProduct(2, "Shirt", 299.99, "M");

        e1.displayDetails();
        System.out.println(", warranty: " + e1.warrantyInYears);
        c1.displayDetails();
        System.out.println(", size: " + c1.size);


        System.out.println("Discounted Price for electronics is " + e1.calculateDiscount(e1.getPrice()));
        System.out.println("Discounted Price for clothes is " + c1.calculateDiscount(c1.getPrice()));
    }
}
