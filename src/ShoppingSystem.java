import java.util.Scanner;
public class ShoppingSystem{
    public static void main(String[] args)
    {
         /*  ElectronicProduct prod1= new ElectronicProduct(1, "Electric Kettle", 1000, 1);
        ClothingProduct prod2= new ClothingProduct(2, "Dress", 2000, "XL");

        prod1.displayDetails();
        prod2.displayDetails();

        double finalAmount1= prod1.getPrice()- (prod1.calculateDiscount(prod1.getPrice()));
        double finalAmount2= prod2.getPrice()- (prod2.calculateDiscount(prod2.getPrice()));

        System.out.println("\nDiscounted price of Product 1: " + finalAmount1);
        System.out.println("Discounted price of Product 2: " + finalAmount2);
        */

        Scanner input= new Scanner(System.in);
        System.out.print("Enter product type (1 for Electronic, 2 for Clothing): ");
        int productType= input.nextInt();
        input.nextLine();


        if(productType==1)
        {
            System.out.print("ID: ");
            int id= input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name= input.nextLine();

            System.out.print("Price: ");
            double price= input.nextDouble();
            input.nextLine();

            System.out.println("Enter the warranty");
            int warranty= input.nextInt();
            ElectronicProduct prod1= new ElectronicProduct(id,name,price,warranty);
            prod1.displayDetails();

            double finalAmount1= prod1.getPrice()- (prod1.calculateDiscount(prod1.getPrice()));

        System.out.println("\nDiscounted price of Product 1: " + finalAmount1);

        }
        else if(productType==2)
        {
            System.out.print("ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.println("Enter the size");
            String size= input.next();
            ClothingProduct prod2= new ClothingProduct(id,name,price,size);
            prod2.displayDetails();

                    double finalAmount2= prod2.getPrice()- (prod2.calculateDiscount(prod2.getPrice()));
        System.out.println("\nDiscounted price of Product 2: " + finalAmount2);


        }
        else{
            System.out.println("Invalid input");
        }






    }
}