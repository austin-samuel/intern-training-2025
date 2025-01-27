public class NumericBox<T>{
    private T field1;
    NumericBox(T field1){
        this.field1 = field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public T getField1() {
        return field1;
    }

    public double doubleValue3(){
        return Double.parseDouble(this.field1.toString());
    }

    public static <T extends Number> double sumArray(T[] arr){
        double sum=0;
        for(T t : arr){
            sum = sum+ Double.parseDouble(t.toString());
        }
        return sum;
    }
}
