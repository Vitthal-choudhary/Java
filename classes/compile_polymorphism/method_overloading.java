package classes.compile_polymorphism;

class Demo
{
    int add(int a1, int b1)
    {
        return a1+b1;
    }
    int add(int a1, int b1, int c1)
    {
        return a1+b1+c1;
    }
    float add(int a1, float b1)
    {
        return a1+b1;
    }
    float add(float a1, int b1)
    {
        return a1+b1;
    }
    float add(float a1, float b1)
    {
        return a1+b1;
    }
}


public class method_overloading
{
    public static void main(String arg[])
    {
        Demo obj = new Demo();
        System.out.println(obj.add(12, 23.5f));
        Demo obj1;

        //referring an object
        obj1=obj;
        System.out.println(obj1.add(12.3f, 12.3f));

        //anonymous object
        System.out.println(new Demo().add(12, 23));
        System.out.println(new Demo().add(12.3f, 23.4f));

    }
}
