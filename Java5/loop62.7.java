/*
1
00
111
0000
11111
*/

class loop
{
    public static void main(String[] args) 
    {
        for (int i=1;i<=5;i++)
        {
            if(i % 2 == 1)
            {
            for (int j=1; j<=i;j++)
                {
                System.out.print(1);
                }
            }
            else
            {
                for (int j=1; j<=i; j++)
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
