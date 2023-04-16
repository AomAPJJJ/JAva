package thing.id999;

//2. create a class name "Dimension" in "thing.id999" package.

import quantity.id999.Measure;

public class Dimension {
   //2.1 add a private final field named "title" which is a "String".
   private final String title;
   
   //2.2 add a private final field named "height" which is a "Measure".
   private final Measure height;
   
   //2.3 add a private final field named "width" which is a "Measure".
   private final Measure width;
   
   //2.4 add a public constructor that receives and sets all fields.
   public Dimension(String title, Measure height, Measure width) {
      this.title = title;
      this.height = height;
      this.width = width;
   }
   
   //2.5 override the "toString()" method to show all fields.
   @Override
   public String toString() {
      return "Dimension{" + title + ": [height:" + height + "], [width:" + width + "]}";
   }
   
   /*
   2.6 add a "changeHeight(...)" method that recieves a "double" 
   (named "newHeight").  This method changes the "value" of 
   the "height" field to "newHeight". This method returns nothing (void).
   */
   public void changeHeight(double newHeight) {
      height.setValue(newHeight);
   }
   
   /*
   2.7 add a "getHeightUnit()" method that receives nothing 
   but returns the "unit" of the "height".
   */
   public String getHeightUnit() { return height.getUnit(); }
   
   /*
   2.8 add a "getHeightValue()" method that receives nothing 
   but returns the "value" of the "height".   
   */
   public double getHeightValue() { return height.getValue(); }
}
