package practice;

import PackDemo.*;  // * import everything
import PackDemo.subbpack.Member4;

public class Inheriting_From_packages   extends Member3
{
    public static void main(String[] a)
    {
        Member1 obj1 = new Member1();
        Member2 obj2 = new Member2();
        obj1.show();
        obj1.demonstrate();
        obj2.show();

        Inheriting_From_packages obj3 = new Inheriting_From_packages();
        obj3.show();

    }
}
