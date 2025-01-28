public class ClothingProduct extends Product implements Discountable{
    String size;

    ClothingProduct(int id, String name, double price, String size){
        super(id,name,price);
        this.size=size;
    }

    @Override
    public double calculateDiscount(double price) {
        return (price) * 0.15;

    }
}
