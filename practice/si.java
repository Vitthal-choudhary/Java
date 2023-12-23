package practice;

import java.util.Scanner;

public class si
{
    public static void main(String ar[])
    {
        long p;
        float r,si;
        int t;
        Scanner sc; //object declaration
        sc = new Scanner(System.in);    //object instantiation
        //passing reference of System.in to sc
        System.out.println("Enter p,r,t");
        p = sc.nextLong();
        r = sc.nextFloat();
        t = sc.nextInt();
        si = (p*r*t)/100.0f;
        System.out.println("Interest="+si);
    }
}
