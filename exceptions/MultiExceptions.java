package exceptions;
import java.util.Scanner;

public class MultiExceptions
{
    public static void main(String[] args)
    {
        int y, x[] = {1,2};
        float z;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter y");
        y = sc.nextInt();

        try
        {
            z = x[1]/(y-3);
            System.out.println(z);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Division by zero");
            z = 0.001f;
        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Array Overflow");
            z = 0.001f;
        }
        catch (Exception ex)        // if we write this up the other two won't execute
        {                            // coz this can handle all exceptions
            System.out.println("Caught Error:---"+ex);
            z=0.001f;
        }
        finally     //All time catch method
        {
            System.out.println("I am always there");
        }
    }
}
