public class ClothingProduct extends Product implements Discountable {
    String size;
    ClothingProduct(int id, String name, double price, String size){
        super(id, name, price);
        this.size = size;
    }

    public double calculateDiscount(double price) {
        return price*0.15;
    }

    void displayDetails() {
        System.out.println(this.getId()+" | "+this.getName()+" | "+this.getPrice()+" | "+this.size);
    }
}
