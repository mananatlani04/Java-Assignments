import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        char c='b';
        char ch='A';
        for(int i=1;i<=n;i++,ch++)
        {
        if(n>26)
        {
            System.out.println("'error'enter no.From-1 to 26");
            break;
        }
        if(i%2==1)
            {    
            System.out.print(ch +" ");
            }
        else if(i%2==0)
            {
            System.out.print(c +" ");
            c++;
            c++;
            }
        }
    }
}
        