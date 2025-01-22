import java.util.Scanner;

public class ShoppingSystem {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int totalProduct = myObj.nextInt();

        Product[] products = new Product[totalProduct];
        myObj.nextLine();

        for (int i = 0; i < totalProduct; i++) {
            System.out.print("Enter product type (e/E for Electronic, c/C for Clothing): ");
            String type = myObj.next();
            char productType = type.charAt(0);

            switch (productType) {
                case 'e':
                case 'E': {
                    // For ElectronicProduct, read necessary data
                    System.out.print("Enter product ID: ");
                    int id = myObj.nextInt();
                    myObj.nextLine(); // Consume leftover newline
                    System.out.print("Enter product name: ");
                    String name = myObj.nextLine();
                    System.out.print("Enter product price: ");
                    double price = myObj.nextDouble();
                    System.out.print("Enter warranty in years: ");
                    int warranty = myObj.nextInt();

                    // Create ElectronicProduct and add it to the array
                    products[i] = new ElectronicProduct(id, name, price, warranty);
                    System.out.println("----------------------------------------------------");
                    break;
                }

                case 'c':
                case 'C': {
                    // For ClothingProduct, read necessary data
                    System.out.print("Enter product ID: ");
                    int id = myObj.nextInt();
                    myObj.nextLine(); // Consume leftover newline
                    System.out.print("Enter product name: ");
                    String name = myObj.nextLine();
                    System.out.print("Enter product price: ");
                    double price = myObj.nextDouble();
                    myObj.nextLine(); // Consume leftover newline
                    System.out.print("Enter product size: ");
                    String size = myObj.nextLine();

                    // Create ClothingProduct and add it to the array
                    products[i] = new ClothingProduct(id, name, price, size);
                    System.out.println("----------------------------------------------------");
                    break;
                }

                default:
                    System.out.println("Invalid product type. Please enter 'e'/'E' or 'c'/'C'.");
                    i--;
                    break;
            }
        }

        System.out.println();
        // Display the details of all products
        for (int i = 0; i < totalProduct; i++) {
            products[i].displayDetails();

            double discountPrice;
            if(products[i].type == 'e')
            {
                ElectronicProduct tempObj = new ElectronicProduct();
                discountPrice = tempObj.calculateDiscount(products[i].getPrice());
                System.out.println("Discounted Price: " + String.format("%.2f", discountPrice));

            }
            else if(products[i].type == 'c')
            {
                ClothingProduct tempObj = new ClothingProduct();
                discountPrice = tempObj.calculateDiscount(products[i].getPrice());
                System.out.println("Discounted Price: " + String.format("%.2f", discountPrice));
            }

            System.out.println("----------------------------------------------------");
        }


    }
}