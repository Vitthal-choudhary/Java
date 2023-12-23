package classes.inheritance;

import java.util.Scanner;

class Address
{
    int hno;
    String city,state;

    void getaddress()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter house number  ");
        hno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter city  ");
        city = sc.nextLine();
        System.out.print("Enter State  ");
        state = sc.nextLine();
    }

    void putaddress()
    {
        System.out.println("House number "+hno);
        System.out.println("City "+city);
        System.out.println("State "+state);
    }
}

class Student extends Address
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
public class single
{
    public static void main(String[] arg)
    {
        Student s = new Student();
        s.getstudent();
        s.getaddress();
        s.putstudent();
        s.putaddress();
    }
}

//Types of inheritance
//1. Single Inheritance - allowed
//2. Hierarchical Inheritance   - allowed
// Address --> Student, Address --> Teacher
//main --> Choice based program for teacher and student
//3. Multiple Inheritance   - not allowed
//4. Multilevel Inheritance - allowed
// Address-->Student-->College
//5. Hybrid Inheritance - not allowed