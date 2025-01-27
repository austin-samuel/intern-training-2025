import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        NumericBox<Integer> intNum = new NumericBox<>(2);
        NumericBox<Double> doubleNum = new NumericBox<>(3.14);
        NumericBox<Float> floatNum = new NumericBox<>(9.8f);
        System.out.println("Integer Box Value (double): " + intNum.doubleValue());
        System.out.println("Double Box Value (double): " + doubleNum.doubleValue());
        System.out.println("Float Box Value (double): " + floatNum.doubleValue());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("testing sum of array with different type of arrays :");
            Object arr = arrayUtility.inputArray();
            if (arr instanceof int[]) {
                int[] intArray = (int[]) arr; //convert to int array the object arr
                Integer[] result = new Integer[intArray.length]; // Create Integer[] class array for the arr object that I got
                for (int i = 0; i < intArray.length; i++) {
                    result[i] = intArray[i];
                }
                double sum = NumericBox.sumArray(result);
                System.out.println("Sum of Integer array is :" + sum);
            } else if (arr instanceof double[])//checking the object received is a double type
            {
                double[] doubleArr = (double[]) arr;
                Double[] result = new Double[doubleArr.length];
                for (int i = 0; i < doubleArr.length; i++) {
                    result[i] = doubleArr[i];
                }
                double sum = NumericBox.sumArray(result);
                System.out.println("Sum of Double Array: " + sum);
            }
            else if(arr instanceof float[]) {
                float[] floatArr=(float[]) arr;
                Float[] result=new Float[floatArr.length];
                for (int i=0;i<floatArr.length;i++) {
                    result[i] = floatArr[i];
                }
                double sum = NumericBox.sumArray(result);
                System.out.println("Sum of Float Array: " + sum);
            }
            else {
                System.out.println("-----------------------------------------------------------");
            }
            System.out.println("type (exit) to end testing else press 1");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}



