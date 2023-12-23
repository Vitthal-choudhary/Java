package classes.inheritance;

import java.util.Scanner;

class Teacher extends Address
{
    Scanner sc2 = new Scanner(System.in);
    int id;
    String name;
    void getTeacher()
    {
        System.out.print("Enter ID ");
        id = sc2.nextInt();
        sc2.nextLine();
        System.out.print("Enter name  ");
        name = sc2.nextLine();
    }
    void putTeacher()
    {
        System.out.println("ID "+id);
        System.out.println("Name "+name);
    }
}
public class hierarchical
{
    public static void main(String arg[])
    {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice 1 for student 2 for teacher");
        choice = scanner.nextInt();

        if (choice==1)
        {
            Student s = new Student();
            s.getstudent();
            s.getaddress();
            s.putstudent();
            s.putaddress();
        }
        else
            if (choice==2)
            {
                Teacher t = new Teacher();
                t.getTeacher();
                t.getaddress();
                t.putTeacher();
                t.putaddress();
            }
            else
                System.out.println("Wrong Choice");
    }
}
