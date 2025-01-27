public class Main {

    public static void main(String[] args) {
        String[] strArr = {"123","234","345","456"};
        Double[] doubleArr = {12.3, 23.4, 34.5, 45.6};
        Integer[] intArr = {1,2,3,4,5};
        Float[] floatArr = {1.2f, 2.3f};
        NumericBox<Integer> f = new NumericBox<>(678);

        NumericBox<String[]> temp = new NumericBox<>(strArr);

        System.out.println(temp.getField1()[2]);
        System.out.println(f.doubleValue3());
        System.out.println(NumericBox.sumArray(floatArr));

    }
}
