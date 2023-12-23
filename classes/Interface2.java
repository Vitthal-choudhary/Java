//Multiple inheritance of class and interface. we can inherit many interface but only one class.

package classes;

import java.util.Scanner;

interface Sports
{
    float score = 7.5f;
}

class Student
{
    int roll;
    String name;
    void getstudent()
    {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter Roll Number ");
        roll = sc2.nextInt();
        sc2.nextLine();
        System.out.print("Enter name  ");
        name = sc2.nextLine();

    }
    void putstudent()
    {
        System.out.println("Roll Number "+roll);
        System.out.println("Name "+name);
    }
}

class Marks extends Student
{
    float m1,m2,m3;
    void getMarks()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects ");
        m1 = x.nextFloat();
        m2 = x.nextFloat();
        m3 = x.nextFloat();
    }

}

class Result extends Marks implements Sports
{
    float total;
    void calculate()
    {
        total = m1+m2+m3+score;
    }
    void showResult()
    {
        System.out.println("Result = "+total);
    }

}
public class Interface2
{
    public static void main(String[] a)
    {
        Result obj = new Result();
        obj.getstudent();
        obj.getMarks();
        obj.calculate();
        obj.showResult();
    }
}
