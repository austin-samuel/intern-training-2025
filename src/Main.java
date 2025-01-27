public class Main {
  // Generic Method to sum elements in an array
  public static <T extends Number> double sumArray(T[] array) {
    double sum = 0.0;
    for (T element : array) {
      sum += element.doubleValue();
    }
    return sum;
  }

  public static void main(String[] args) {
    // Task 1: Test NumericBox with different numeric types
    NumericBox<Integer> intBox = new NumericBox<>(10);
    System.out.println("Integer Box value: " + intBox.getValue());
    System.out.println("Integer Box double value: " + intBox.doubleValue());

    NumericBox<Double> doubleBox = new NumericBox<>(15.5);
    System.out.println("Double Box value: " + doubleBox.getValue());
    System.out.println("Double Box double value: " + doubleBox.doubleValue());

    NumericBox<Long> longBox = new NumericBox<>(100L);
    System.out.println("Long Box value: " + longBox.getValue());
    System.out.println("Long Box double value: " + longBox.doubleValue());

    NumericBox<Float> floatBox = new NumericBox<>(25.75f);
    System.out.println("Float Box value: " + floatBox.getValue());
    System.out.println("Float Box double value: " + floatBox.doubleValue());

    NumericBox<Short> shortBox = new NumericBox<>((short) 5);
    System.out.println("Short Box value: " + shortBox.getValue());
    System.out.println("Short Box double value: " + shortBox.doubleValue());

    NumericBox<Byte> byteBox = new NumericBox<>((byte) 3);
    System.out.println("Byte Box value: " + byteBox.getValue());
    System.out.println("Byte Box double value: " + byteBox.doubleValue());

    // Task 2: Test sumArray with arrays of different numeric types
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.7, 2.3, 3.5};
    Float[] floatArray = {1.0f, 2.0f, 3.0f};
    Long[] longArray = {10L, 20L, 30L};
    Short[] shortArray = {10, 20, 30};
    Byte[] byteArray = {2, 4, 8};

    System.out.println("Sum of intArray: " + sumArray(intArray));
    System.out.println("Sum of doubleArray: " + sumArray(doubleArray));
    System.out.println("Sum of floatArray: " + sumArray(floatArray));
    System.out.println("Sum of longArray: " + sumArray(longArray));
    System.out.println("Sum of shortArray: " + sumArray(shortArray));
    System.out.println("Sum of byteArray: " + sumArray(byteArray));
  }
}