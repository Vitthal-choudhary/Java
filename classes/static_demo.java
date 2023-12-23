/*
 * Static is a reserved word.
 * Static Members in a class are class level members.
 * These do not associate with objects.
 *
 * Static fields are common variables for all objects.
 * These occupy common memory space for all the objects.
 * Any change made to them is reflected in all the objects.
 *
 * Static methods can use static fields only.
 * These are called with class name instead of objects.
 */

package classes;

import java.util.Scanner;

class Statictest
{
    int a;
    static int b;

    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        a = sc.nextInt();
        b++;
    }
    void putdata()
    {
        System.out.println(a);
    }
    static void show()
    {
        System.out.println(b);
    }
}
public class static_demo
{
    public static void main(String[] args)
    {
        Statictest s1,s2,s3;
        s1 = new Statictest();
        s2 = new Statictest();
        s3 = new Statictest();

        s1.getdata();
        s2.getdata();
        s3.getdata();

        s1.putdata();
        s2.putdata();
        s3.putdata();

        Statictest.show();
    }
}
