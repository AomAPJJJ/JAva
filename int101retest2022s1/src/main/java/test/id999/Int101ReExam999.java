package test.id999;

import quantity.id999.Measure;
import thing.id999.Dimension;

//3. create a class named "Int101ReExam999" in "test.id999" package.
public class Int101ReExam999 {

    //3.1 add a public static void method to call 1.3, 1.6, 2.4-2.8.
    public static void main(String[] args) {
       //call 1.3 Measure's constructor
       Measure distance = new Measure(100, "kilometer");
       
       //call 1.6 Measure's toString()
       System.out.println("distance: " + distance);
       
       //call 2.4 Dimension's constructor
       Dimension monitor = new Dimension("Screen", new Measure(14.0,"inch") , new Measure(10.0,"inch"));
       
       //call 2.5 Dimension's toString()
       System.out.println("Monitor: " + monitor);
       
       //call 2.6 Dimension's changeHeight(newHeight)
       System.out.println("Change height to 15.0.");
       monitor.changeHeight(15.0);
       
       //call 2.7 Dimension's getHeightUnit()
       System.out.println("Height unit: " + monitor.getHeightUnit());
       
       //call 2.8 Dimension's getHeightValue()
       System.out.println("Height value: " + monitor.getHeightValue());
    }
}
