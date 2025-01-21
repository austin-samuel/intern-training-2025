public class ElectronicProduct extends Product implements Discountable{
    public int warrentyInYears;
    public ElectronicProduct(int id, String name, double price, int warrentyInYears)
    {
        super(id, name,price);
        this.warrentyInYears=warrentyInYears;
    }

    @Override
    public double calculateDiscount(double price) {
        return (price * 0.1);
    }
}
