package practice;

import java.util.Scanner;

public class arrays
{
    public static void main(String[] a)
    {
        int ar[]; //array declaration
        int br[]={1,2,3,5,6,9}; //initialization

        ar = new int[10];   //assigning size for an array

        Scanner sc = new Scanner(System.in);
        for(int index=0;index<ar.length;index++)    //ar.length function has the size of array
        {
            System.out.println("Enter element");
            ar[index] = sc.nextInt();
        }
        for(int index=0;index<ar.length;index++)
        {
            System.out.println(ar[index]);
        }
    }
}
