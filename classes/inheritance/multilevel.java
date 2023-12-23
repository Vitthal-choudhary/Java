package classes.inheritance;

import java.util.Scanner;

class College extends Student
{
    Scanner sc = new Scanner(System.in);
    int CollegeID;
    String Collegename;
    void getCollege()
    {
        System.out.print("Enter CollegeID ");
        CollegeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Collegename  ");
        Collegename = sc.nextLine();
    }
    void putCollege()
    {
        System.out.println("CollegeID "+CollegeID);
        System.out.println("Collegename "+Collegename);
    }
}
public class multilevel
{
    public static void main(String arg[])
    {
        College c = new College();
        c.getstudent();
        c.getaddress();
        c.getCollege();
        System.out.println("---------PRINTING DATA-----------");
        c.putstudent();
        c.putaddress();
        c.putCollege();
    }
}
