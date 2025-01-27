import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        NumericBox<Integer> int1= new NumericBox<>(55);
        NumericBox<Float> float1= new NumericBox<>(10.5f);
        NumericBox<Double> double1= new NumericBox<>(25.0);
        NumericBox<Long> long1= new NumericBox<>(30L);
        NumericBox<Short> short1= new NumericBox<>((short) 50);
        NumericBox<Byte> byte1= new NumericBox<>((byte) 3);
        NumericBox<BigDecimal> bigDecimal1= new NumericBox<>(new BigDecimal("123.45"));

        System.out.println("Integer value: " + int1.getValue());
        System.out.println("Float value: " + float1.getValue());
        System.out.println("Double value: " + double1.getValue());
        System.out.println("Long value: " + long1.getValue());
        System.out.println("Short value: " + short1.getValue());
        System.out.println("Byte value: " + byte1.getValue());
        System.out.println("BigDecimal value: " + bigDecimal1.getValue());

        System.out.println("Integer double value: " + int1.doubleValue());
        System.out.println("Float double value: " + float1.doubleValue());
        System.out.println("Double double value: " + double1.doubleValue());
        System.out.println("Long double value: " + long1.doubleValue());
        System.out.println("Short double value: " + short1.doubleValue());
        System.out.println("Byte double value: " + byte1.doubleValue());
        System.out.println("Big Decimal double value: " + bigDecimal1.doubleValue());


        Integer[] intArray= {1,2,3,4,5};
        Float[] floatArray= {1.1f,2.2f, 3.3f,4.4f,5.5f};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Long[] longArray= {10L,20L,30L,40L,50L};
        Short[] shortArray= {(short)11,(short)22, (short)33, (short)44, (short)55};
        Byte[] byteArray={(byte)2,(byte)4,(byte)6,(byte)8,(byte)10};
        BigDecimal[] bigDecimalArray= {
                new BigDecimal("1.1"),
                new BigDecimal("1.2"),
                new BigDecimal("1.3"),
                new BigDecimal("1.4"),
                new BigDecimal("1.5")
        };

        System.out.println("Integer Array Sum: " + NumericBox.sumArray(intArray));
        System.out.println("Float Array Sum: " + NumericBox.sumArray(floatArray));
        System.out.println("Double Array Sum: " + NumericBox.sumArray(doubleArray));
        System.out.println("Long Array Sum: " + NumericBox.sumArray(longArray));
        System.out.println("Short Array Sum: " + NumericBox.sumArray(shortArray));
        System.out.println("Byte Array Sum: " + NumericBox.sumArray(byteArray));
        System.out.println("Big Decimal Array Sum: " + NumericBox.sumArray(bigDecimalArray));


    }
}