public class ElectronicProduct extends Product implements Discountable{
    int warrantyInYears;
    ElectronicProduct(int id, String name, double price, int years){
        super(id, name, price);
        this.warrantyInYears = years;
    }

    public double calculateDiscount(double price) {
        return price*0.1;
    }

    void displayDetails() {
        System.out.println(this.getId()+" | "+this.getName()+" | "+this.getPrice()+" | "+this.warrantyInYears);
    }
}
