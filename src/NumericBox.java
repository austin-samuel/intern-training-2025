class NumericBox<T extends Number> {
    private T value;

    public NumericBox(T value){
        this.value= value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value= value;
    }

    public double doubleValue()
    {
        return value.doubleValue();
    }

    public static <T extends Number> double sumArray(T[] arr)
    {
        double sum=0.0;
        for(T element : arr)
        {
            sum += element.doubleValue();
        }

        return sum;
    }


}



