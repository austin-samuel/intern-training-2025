public class ClothingProduct extends Product implements Discountable{
    private String size;

    public ClothingProduct(int id, String name, double price, String size){
        super(id, name, price);

        this.size = size;
        type = 'c';
    }

    public ClothingProduct() {
        super();
    }

    public String getSize(){
        return size;
    }

    @Override
    public double calculateDiscount(double price) {
        double discount = 0.15;
        return price*(1-discount);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + getSize());
    }
}
