/*
    Final is a reserved word. This is used to:---
            1. Create constant
                    final int x=6;
            2. Create methods in base class that are not to be overridden.
            3. Create classes that are not to be derived but only to be instantiated
*/
package classes;

//final class FBase     // if this class is final than it cannot be derived
class FBase
{
    final int x=6;      //constant value
    final void show()
    {
        //x++;
    }
}
class FDerived extends FBase
{
    /*void show()
    {
            this function cannot be written again here coz it's final in base class
    }*/
}

public class Final_keyword
{
}
