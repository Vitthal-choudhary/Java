package practice;

import java.util.Scanner;

public class matrix
{
    public static void main(String[] a)
    {
        int m[][], row,col;
        m= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(row=0;row<=2;row++)
        {
            for(col=0;col<=2;col++)
            {
                System.out.println("Enter element");
                m[row][col]=sc.nextInt();
            }
        }
        for(row=0;row<=2;row++)
        {
            for (col = 0; col <= 2; col++)
            {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
}
