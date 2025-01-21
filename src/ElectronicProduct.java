public class ElectronicProduct extends Product implements Discountable {
    int warrantyInYears;

    ElectronicProduct(int id, String name, double price, int warrantyInYears) {
        super(id, name, price);
        this.warrantyInYears = warrantyInYears;
    }

    @Override
    public double calculateDiscount(double price) {
        return 0.9 * price;
    }
}
