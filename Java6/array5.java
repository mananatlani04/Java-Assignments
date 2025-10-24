import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        int i,j;
        for (i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(j = 0; j < n; j++)
        {
            if(arr[j] % 5 == 0)
            {
                arr[j] = 0;
            }
            System.out.println("index "+ j + ":"+arr[j]);
        }
    }
}