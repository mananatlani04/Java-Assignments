import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int a = 0;
        int arr[] = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n;j++)
        {
            if(arr[j] % 2 == 0)
            {
            a = arr[j];
            evensum+=a;
           }
          else
           {
            a = arr[j];
            oddsum += a;
           }
        }   
         System.out.println("sum of even elements:"+evensum);
           System.out.println("sum of odd elements:"+oddsum); 
    }
}