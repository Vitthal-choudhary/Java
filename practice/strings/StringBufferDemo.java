package practice.strings;

import java.util.Scanner;

public class StringBufferDemo
{
    public static void main(String[] a)
    {
        StringBuffer sb1,sb2;
        sb1 = new StringBuffer("Programming");
        sb1.setLength(20);
        sb1.setCharAt(3, 'z');
        System.out.println(sb1);
        sb1.insert(6, "demo");
        System.out.println(sb1);
        //sb1.append(sb2)  similar to concat

        Scanner sc = new Scanner(System.in);
        sb2 = new StringBuffer(sc.nextLine());
    }
}
