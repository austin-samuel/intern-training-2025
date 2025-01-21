import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       Product obj=new Product(id,name,price);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to the online shopping system");
        boolean b=true;
        while(b) {
            System.out.println("\t\t\t\t\t\tSelect a product to be bought");
            System.out.println("\t\t\t\t\t\t1. Electronic Product");
            System.out.println("\t\t\t\t\t\t2. Clothing Product");
            System.out.println("\t\t\t\t\t\t3. exit the shopping system");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    int id;
                    String name;
                    double price;
                    System.out.print("enter the product id ");
                    id = sc.nextInt();
                    System.out.print("enter the product name ");
                    name = sc.next();
                    System.out.print("enter the product price ");
                    price = sc.nextDouble();
                    System.out.println("enter the warranty in years");
                    int warrantyInYears = sc.nextInt();
                    ElectronicProduct e = new ElectronicProduct(id, name, price, warrantyInYears);
                    System.out.println("Electronic Product Details are");
                    e.display_Details();
                    double electronicDiscount = e.calculateDiscount(e.getPrice());
                    System.out.println("Discounted Price: " + (e.getPrice() - electronicDiscount));
                    System.out.println("----------------------------------------------------------------");
                    break;

                case 2:
                    int id1;
                    String name1;
                    double price1;
                    System.out.print("enter the product id ");
                    id1 = sc.nextInt();
                    System.out.print("enter the product name ");
                    name1 = sc.next();
                    System.out.print("enter the product price ");
                    price1 = sc.nextDouble();
                    System.out.println("enter the size of your cloth");
                    String size = sc.next();
                    ClothingProduct clothing = new ClothingProduct(id1, name1, price1, size);
                    System.out.println("Clothing Product Details are as follows: ");
                    clothing.display_Details();
                    double clothingDiscount = clothing.calculateDiscount(clothing.getPrice());
                    System.out.println("Discounted Price: " + (clothing.getPrice() - clothingDiscount));
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("exit the shopping system");
                    b=false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }


    }

}
