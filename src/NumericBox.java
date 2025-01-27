package session6_generics;

public class NumericBox<T extends Number> {
    private T number;

    NumericBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Double doubleValue() {
        return number.doubleValue();
    }
}
