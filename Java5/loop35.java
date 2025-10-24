import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number");
        int n=sc.nextInt();
        int count = 0;
        if (n < 10 &&  n > -9) 
        {
            count = 1;
        } 
        else 
        {
            while (n != 0) 
            {
                n = n / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
