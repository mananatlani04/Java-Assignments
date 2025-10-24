import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter elements");
        int arr[] = new int[n];
        int i;
        int j;
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i <= n-1; i++)
        {
            for(j = i+1; j < n; j++)
            {
                int temp;
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("index "+ i + ":"+ arr[i]);
        }
    }
}