import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array1");
        int n = sc.nextInt();
        System.out.println("enter size of array2");
        int m = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        int ar[] = new int[m];
        System.out.println("enter elements of array1");
        for ( int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter elements of array2");
        for ( int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
        for ( int i = 0; i < n; i++ )
        {
            for ( int j = 0; j < m; j++)
            {
                if( arr[i] != ar[j] )
                {
                    count++;
                }
            }
        }
        System.out.println("count : " + count);
    }
}
