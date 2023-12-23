/*
 * Exceptions are runtime errors. These occur in exceptional cases
 * Exceptional handling is a mechanism to handle such errors
 * during runtime of program execution
 *
 * try - catch - throw are three reserved words to perform this
 * in the program
 *
 * try block will contain error-prone statements
 * catch block will contain corrective action
 *  if error - goto catch
 *  if no error - skip catch
 *
 * throw is used to send the control to catch block on the basis
 * of a condition
 */

package exceptions;
import java.util.Scanner;

public class Exception_handling
{
    public static void main(String[] args)
    {
        int x,y;
        float z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x,y");
        x= sc.nextInt();
        y=sc.nextInt();
        try
        {
            z = x/(y-3);
            System.out.println(z);
        }
        catch(Exception ex)
        {
            //System.out.println("Caught :"+ex.getMessage());
            System.out.println("Caught :"+ex);
            z=0.001f;
        }
        System.out.println("-- End of the program--");
    }

}
