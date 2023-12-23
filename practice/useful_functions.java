package practice;

class Functions
{
    void Factorial(int n)   //get n!
    {
        long fact=1;
        for (int i=n; i>=1; i--)
            fact *= i;
        System.out.println("Factorial of the number is "+fact);
    }

    void fibonacci(int n)    // prints n Fibonacci terms
    {
        int x=0, y=1, z, i=2;
        System.out.print(x+" ");
        System.out.print(y+" ");
        do {
            z = x+y;
            System.out.print(z+" ");
            i++;
            x=y;
            y=z;
        }while (i<n);
        System.out.println(" ");
    }

    void Factors(int n)     //to get factors of n
    {
        System.out.println("Factors of the number are:---->");
        for (int i=1; i<=n/2; i++)
        {
            if (n%i==0)
                System.out.println(i);
        }
    }

    void hcf_lcm(int x, int y)
    {
        int dividend, divisor, rem;
        if (x>y)
        {
            dividend=x;
            divisor=y;
        }
        else
        {
            dividend=y;
            divisor=x;
        }
        while (dividend % divisor != 0)
        {
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println("HCF is  "+divisor);
        System.out.println("LCM is  "+(x*y)/divisor);
    }

    void leap_year(int year)
    {
        if (year%400==0 || (year%4==0 && year%100!=0))
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}
public class useful_functions
{
    public static void main(String[] a)
    {
        Functions obj = new Functions();
        obj.Factorial(5);
        obj.fibonacci(6);
        obj.Factorial(23);
        obj.Factors(68);
        obj.hcf_lcm(6,15);
        obj.leap_year(2020);
    }
}
