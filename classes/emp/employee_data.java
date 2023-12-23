package classes.emp;

import java.util.Scanner;

class Employee
{
    int emp_no;
    String name,designation;
    long total, tax, net_salary;
    int[] salary;

    void getemp()
    {
        salary = new int[12];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee number  ");
        emp_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name  ");
        name = sc.nextLine();
        System.out.print("Enter Designation  ");
        designation = sc.nextLine();
        System.out.println("Enter salary for each month");
        for (int i=0; i<salary.length; i++)
        {
            System.out.println("Enter Salary");
            salary[i] = sc.nextInt();
        }
    }

    void calculate()
    {
        total = 0;
        for (int i=0; i<12; i++)
            total += salary[i];

        if (total>1000000)
            tax = 10000;
        else
            tax = 5000;

        net_salary = total-tax;
    }

    void putemployee()
    {
        System.out.println("Name "+name);
        System.out.println("Employee Number "+emp_no);
        System.out.println("Designation "+designation);
        System.out.println("Total Salary "+total);
        System.out.println("Tax "+tax);
        System.out.println("Net Salary "+net_salary);
    }
}
public class employee_data
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.getemp();
        e.calculate();
        e.putemployee();
    }
}
