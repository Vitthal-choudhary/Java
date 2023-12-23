package practice;

import java.util.Scanner;

public class one
{
    public static void main(String arr[])
    {
        System.out.println("Hello World");

        // Greater of 2 numbers using conditionals  ? :
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        c= a>b?a:b;     // Result has to be stored can't do print directly
        System.out.println("Big = "+c);
    }
}
