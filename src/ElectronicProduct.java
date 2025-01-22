
public class ElectronicProduct extends Product implements Discountable{

    private int warrantyInYears;

    public ElectronicProduct(int id, String name, double price, int warrantyInYears) {
        super(id, name, price);
        this.warrantyInYears = warrantyInYears;
        type = 'e';
    }

    public ElectronicProduct() {
        super();
    }

    public int getWarrantyInYears() {
        return warrantyInYears;
    }


    @Override
    public double calculateDiscount(double price) {

        double discount = 0.1;
        return price*(1-discount);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + getWarrantyInYears());
    }
}
