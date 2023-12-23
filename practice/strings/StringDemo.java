package practice.strings;

import java.util.Scanner;

public class StringDemo
{
    public static void main(String[] a)
    {
        String str1,str2;   //declaration
        str1 = "Info-net";   //initialization
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str2 = sc.nextLine();   //input
        System.out.println("Hello "+str1); //concatenation
        // str1 = str2;    //copying a string
        //String methods
        //1. toLowerCase()
        System.out.println(str1.toLowerCase());
        //2. toUpperCase()
        //3. replace()
        System.out.println(str1.replace('n','m'));
        //4. charAt()
        System.out.println(str1.charAt(4));
        //5. indexOf(char)
        System.out.println(str1.indexOf('n'));
        //6. indexOf(char,int)
        int index = str1.indexOf('n');
        System.out.println(str1.indexOf('n',index+1));
        //7. lastIndexOf()
        System.out.println(str1.lastIndexOf('n'));
        //8. length()
        System.out.println(str1.length());
        //9. equals()
        if(str1.equals(str2))
            System.out.println("Similar Strings");
        else
            System.out.println("Non Similar Strings");
        //10. equalsIgnoreCase()
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Similar Strings");
        else
            System.out.println("Non Similar Strings");
        //11. compareTo()
        if(str1.compareTo(str2)==0)
            System.out.println("Similar String");
        else
        if(str1.compareTo(str2)>0)
        {
            System.out.println(str2);
            System.out.println(str1);
        }
        else
        {
            System.out.println(str1);
            System.out.println(str2);
        }
        //12. substring(n)  n to len-1
        System.out.println(str1.substring(5));
        //13. substring(n,m)  n to m-1
        System.out.println(str1.substring(2,4));
        //14. concat()
        System.out.println(str1.concat(" Computers"));
        //15. contains()
        if(str1.contains("net"))
            System.out.println("Found within");
        else
            System.out.println("Not Found");
        //16. endsWith()
        if(str2.endsWith("oo"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        //17. startsWith()
        //18. isEmpty()
        if(str2.isEmpty())
            System.out.println("Found Empty");
        else
            System.out.println("Not Found");
        //19. trim  removes the leading spaces
        str1 = "   Java    ";
        System.out.println(str1.trim());

    }
}
