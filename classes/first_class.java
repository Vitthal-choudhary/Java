package classes;

import java.util.Scanner;

class SumTest
{
    int a,b;    //Fields
    void getdata()      //Methods
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    int calculate()
    {
        return a+b;
    }
}
public class first_class
{
    public static void main(String[] a)
    {
        SumTest obj;        //Object Declaration
        obj = new SumTest();    //object instantiation
        obj.getdata();
        System.out.println(obj.calculate());
    }
}
