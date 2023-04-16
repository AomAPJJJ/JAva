package quantity.id999;

//1. create a class named "Measure" in "quantity.id999" package.
public class Measure {
   //1.1 add a private field named "value" which is a "double".
   private double value;

   //1.2 add a private final field named "unit" which is a "String".
   private final String unit;
   
   //1.3 add a public constructor that receives and sets all fields.
   public Measure(double value, String unit) {
      this.value = value;
      this.unit = unit;
   }
   
   //1.4 add a public getter method for "unit".
   public String getUnit() { return unit; }

   //1.5 add a public getter/setter method for "value".
   public double getValue() { return value; }
   public void setValue(double value) { this.value = value; }

   //1.6 override the "toString()" method to show the "value" and the "unit".
   @Override
   public String toString() {
      return "Measure{" + value + " " + unit + "}";
   }
}
