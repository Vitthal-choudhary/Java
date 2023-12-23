package practice;

public class Break_Statement_in_loops
{
    public static void main(String[] a)
    {
        int i, j;
        outer:
        for (i = 1; i <= 5; i++)        //labelled loop [ outer is the label for loop ]
        {
            for (j = 1; j <= 5; j++)
            {
                if (i == j)
                    //break;
                    //continue;
                    //break outer;      // We can control the outer loops also
                    continue outer;
                System.out.print(i * j + " ");
            }
            System.out.println(i * i);

        }
    }
}
