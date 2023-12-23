package classes.inheritance;

/*
//case 1
class Base1
{
    Base1()
    {
        System.out.println("Constructing Base");
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
        System.out.println("Constructing Derived");
    }
}

public class constructor_inheritance
{
    public static void main(String args[])
    {
        Derived1 d1 = new Derived1();
    }
}
*/
/*
//Case 2
class Base2
{
    Base2()
    {
        System.out.println("Constructing Base");
    }
}
class Derived2 extends Base2
{
    Derived2(int x)
    {
        System.out.println("Constructing Derived "+x);
    }
}

public class constructor_inheritance
{
    public static void main(String args[])
    {
        Derived2 d1 = new Derived2(8);
    }
}
*/

// Case 3 leads to case 4
class Base3
{
    Base3(int x)
    {
        System.out.println("Constructing Base "+x);
    }
}
class Derived3 extends Base3
{
    Derived3(int y)
    {
        super(y); //super is a keyword method that is used to call
        //base class parameterised constructor
        //it has to be first line of code in the derived class constructor
        System.out.println("Constructing Derived");
    }

}

public class constructor_inheritance
{
    public static void main(String args[])
    {
        Derived3 d1 = new Derived3(36);
    }
}