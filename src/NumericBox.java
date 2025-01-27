public class NumericBox <T extends Number>{
    private T value;
    public NumericBox()
    {
        System.out.println("Default constructor called\n");
    }
    public NumericBox(T value)  //constructor intiatlized
    {
        System.out.println("Parameterized Constructor called!!\n");
        this.value=value;
    }
    public T getValue()  //my getter with type T
    {
        System.out.println("\nHere is your value by Getter: "+value);
        return value;
    }
    public void setValue(T value)  // my setter with type T
    {
        System.out.println("\nValue set successfully!!! \n");
        this.value=value;
    }
    public double doubleValue()
    {
        System.out.println("\nReturning the double representation of value\n");
        return value.doubleValue();
    }
    public static <T extends Number> double sumArray(T[] arr)
    {
        double sum=0;
        for(T item:arr)
        {
            sum+=item.doubleValue();  //item is an object, doubleValue is an inbuilt function
        }
        return sum;
    }
    public static void main(String[] args)
    {
        /*Please note:
        *On research, i got to know that we cannot explicitly type cast
        *the objects, if done it throws a "Thread loss"
        *  */

        NumericBox<Integer> obj1=new NumericBox<>(5);
        System.out.println("\nInteger object created!\n");

        NumericBox<Double> obj2=new NumericBox<>(10.34);
        System.out.println("\nDouble object created!\n");

        NumericBox<Float> obj3=new NumericBox<>(16.5f);
        System.out.println("\nFloat object created!\n");

        // NumericBox<String> obj3=new NumericBox<>("adi"); throws error

        NumericBox<Integer> arrayObject=new NumericBox<>();
        Integer[] arr={1,2,3,4,5};

       // double sum=arrayObject.sumArray(arr);
        //1st, testing the NumericBox first
        //checking getter
        obj1.getValue();
        obj2.getValue();

        //checking setter
        obj1.setValue(10);
        obj2.setValue(19.8);

        System.out.println("\nPrinting the object in double: "+obj1.getValue().doubleValue());

        //2nd now,
        //checking the sum method
         double sum=arrayObject.sumArray(arr);
        System.out.println("\nThe sum of the array is: "+sum);
    }
}
