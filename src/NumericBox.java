// Generic Class for Numeric Operations
class NumericBox<inputType extends Number> {
  private inputType value;

  // Constructor
  public NumericBox(inputType value) {
    this.value = value;
  }

  // Getter
  public inputType getValue() {
    return value;
  }

  // Setter
  public void setValue(inputType value) {
    this.value = value;
  }

  // Method to return the double representation of the value
  public double doubleValue() {
    //System.out.println("Calling doubleValue...");
    return value.doubleValue();
  }
}
