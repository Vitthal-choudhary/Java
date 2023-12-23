package practice.strings;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] a)
    {
        String str1;
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        StringBuffer sb1 = new StringBuffer(str1);
        sb1.reverse();
        if(str1.equals(sb1.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
