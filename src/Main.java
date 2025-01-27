package session6_generics;

public class Main {
    public static void main(String[] args) {
        NumericBox<Integer> numInt = new NumericBox<>(1);
        NumericBox<Double> numDouble = new NumericBox<>(1.20432342);
        NumericBox<Float> numFloat = new NumericBox<>(1.22f);

        System.out.println("NumericBox<Integer>: " + numInt.getNumber());
        numInt.setNumber(120);
        System.out.println("NumericBox<Integer> after setting: " + numInt.getNumber());
        System.out.println("NumericBox<Double>: " + numDouble.getNumber());
        System.out.println("NumericBox<Float>: " + numFloat.getNumber());

        System.out.println("Calling getDouble function of numInt: " + numInt.doubleValue());

        Integer[] arrInt = {1, 2, 3, 4, 5};
        Double[] arrDub = {1.0 + 2.3 + 3.2 + 4.1 + 5.2};
        Float[] arrFlo = {1.0f + 2.3f + 3.2f + 4.1f + 5.2f};
        System.out.println("ArrInt sum = " + SumArray.sumArray(arrInt));
        System.out.println("ArrDub sum = " + SumArray.sumArray(arrDub));
        System.out.println("ArrFlo sum = " + SumArray.sumArray(arrFlo));
    }
}
