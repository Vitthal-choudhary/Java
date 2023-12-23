/*
 * Interface is a user defined data type
 * It is similar to class in structure
 * All its fields are final static variables by default
 * All its methods are abstract methods by default
 *
 * Rules for Inheritance
 * Let A,B be classes
 * Let X,Y be interfaces
 *
 * 1. A-->B  class A extends B
 * 2. X-->Y interface X extends Y
 * 3. X-->A class A implements X
 * 4. A-->X This is not allowed
 * 5. A-->B, X-->B class B extends A implements X,Y
 */


package classes;

interface Ibase
{
    void show();
}

class Iderived1 implements Ibase
{
    public void show()      //public karna zaroori h isko
    {
        System.out.println("Showing interface in derived1");
    }
}

class Iderived2 implements Ibase
{
    public void show()
    {
        System.out.println("Showing interface in derived 2");
    }

}
public class Interface
{
    public static void main(String[] a)
    {
        Iderived1 d1 = new Iderived1();
        Iderived2 d2 =new Iderived2();

        Ibase bj;
        bj = d1;
        bj.show();

        bj = d2;
        bj.show();
    }
}
