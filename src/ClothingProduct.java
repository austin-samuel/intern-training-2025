public class ClothingProduct extends Product implements Discountable{

    String size;

    ClothingProduct(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount(double price) {
        return 0.85 * price;
    }
}
