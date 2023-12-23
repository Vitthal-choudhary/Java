/*
 * Abstract is a reserved word. If a class is abstract it has to be derived.
 * Abstract class cannot be instantiated because it does not have a visible constructor.
 *
 * Abstract Method has to be in an abstract base class, It has to reimplemented in a derived class.
 *
 * This is also an example of Inheritance Polymorphism...
 */

package classes;

abstract class Abase
{
    abstract void show();
}

class Aderived1 extends Abase   //jab tak void show ni bnega isme tab tak error dega ye
{
    void show()
    {
        System.out.println("Showing Base in Derived1");
    }
}
class Aderived2 extends Abase
{
    void show()
    {
        System.out.println("Showing Base in Derived2");
    }
}

public class abstract_keyword
{
    public static void main(String[] a)
    {
        //Abase a = new Abase()  not allowed
        Abase obj;
        Aderived1 d1 = new Aderived1();
        Aderived2 d2 = new Aderived2();

        // Method 1
        d1.show();
        d2.show();


        // Method 2 -------> Late Binding(obj goes to base and base calls d1.show)
        obj = d1;
        obj.show();

        obj = d2;
        obj.show();
    }
}
