/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * Primitive Data Types         Wrapper Classes
 * int                          Integer
 * long                         Long
 * short                        Short
 * float                        Float
 * double                       Double
 * char                         Character
 * boolean                      Boolean
 * byte                         Byte
 *
 * Primitive values
 * int x;
 * float y;
 *
 * Object values
 * Integer ob1;
 * Float ob2;
 *
 * Wrapper classes provide us with methods to convert values from
 * primitive to object and vice versa & primitive to String and
 * String to Object values
 *
 * 1. Converting a primitive value to an object values using constructor method
 * ob1 = new Integer(x);
 * ob2 = new Float(y);
 *
 * 2. Converting an Object values to a primitive value using typeValue() method
 * x = ob1.intValue()
 * y = ob2.floatValue()
 *
 * 3. Converting a primitive value to a String object using toString() method
 * String str1 = Integer.toString(x)
 * String str2 = Float.toString(y)
 *
 * 4. Converting a String object to an Object value using valueOf() method
 * ob1 = Integer.valueOf(str1)
 * ob2 = Float.valueOf(str2)
 *
 * 2+4
 * x = Integer.valueOf(str1).intValue()
 * y = Float.valueOf(str2).floatValue()
 *
 * Modified
 * x = Integer.parseInt(str1)
 * y = Float.parseInt(str2)
 *
 * Input using DataInputStream

*/
package classes;

import java.io.DataInputStream;
import java.io.IOException;

public class Wrapper_classes
{
    public static void main(String[] a) throws IOException
    {
        int x;
        float y;
        char z;
        String s;
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("Enter x");
        x = Integer.parseInt(din.readLine());
        System.out.println("Enter y");
        y = Float.parseFloat(din.readLine());
        System.out.println("Enter s");
        s = din.readLine();
        System.out.println("Enter z");
        z = (char)din.read();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(s);
    }
}
