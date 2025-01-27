package session6_generics;

public class SumArray {
    public static <T extends Number> double sumArray(T[] arr) {
        double sum = 0.0;
        for (T element: arr) {
            sum += element.doubleValue();
        }
        return sum;
    }
}