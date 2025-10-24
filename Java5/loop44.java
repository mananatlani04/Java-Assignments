import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int last=n%10;
        int temp=n/10;
        int digitcount=1;
        int first=0;
        while(temp>0)
        {
            first=temp%10;
            temp/=10;
            digitcount*=10;
        }
        int middle=(n%digitcount)/10;
        int rev=((last*digitcount)+(middle*10)+first);
        System.out.println(rev+" ");
    }
}