package practice;

import java.util.Scanner;
import calculate.*;

public class Calculator
{
    public static void main(String[] a)
    {
        int choice, x, y, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers ");
        x = sc.nextInt();
        y=sc.nextInt();

        System.out.println("Enter Choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                Add Aobj = new Add(x, y);
                result = Aobj.calculate();
                System.out.println("Result = "+result);
                break;
            case 2:
                Subtract Sobj = new Subtract(x,y);
                result = Sobj.calculate();
                System.out.println("Result = "+result);
                break;
            case 3:
                Multiply Mobj = new Multiply(x, y);
                result = Mobj.calculate();
                System.out.println("Result = "+result);
                break;
            case 4:
                Division Dobj = new Division(x, y);
                result = Dobj.calculate();
                System.out.println("Result = "+result);
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
