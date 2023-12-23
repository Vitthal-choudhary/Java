/*
* we can make our own class and select when  to show an error
* */

package exceptions;

import java.util.Scanner;

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}
public class User_ex_Demo
{
    public static void main(String[] args)
    {
        int x,y;
        float z;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        try
        {
            z = (float) (x*y)/10000;
            if (z<0.01f)
                throw new MyException("No is too small");   //throw is used to send control to catch statement
                                                            // and bring error in try block at condition
            else
                System.out.println(z);
        }
        catch (MyException my)
        {
            System.out.println("Caught "+my.getMessage());
        }
    }
}
