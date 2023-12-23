package classes.compile_polymorphism;

import java.util.Scanner;

class Samples
{
    int a;      //fields
    float b;

    public Samples()
    {
        a=5;
        b=2.6f;
    }

    public Samples(int a, float b) {
        this.a = a;     //this represents current object
        this.b = b;
    }

    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

public class constructor_overloading
{
        public static void main(String a[])
        {
            Samples s1,s2;
            s1 = new Samples();
            s2 = new Samples(12, 23.6f);
            s1.show();
            s2.show();
            int x;
            float y;

            Scanner sc  = new Scanner(System.in);
            System.out.print("Enter x,y");;
            x=sc.nextInt();
            y=sc.nextFloat();
            Samples s3 = new Samples(x, y);       //basic to class type conversion
            s3.show();
        }
}
