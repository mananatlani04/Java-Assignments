import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i<=1000)
        {
            System.out.println("java");
            i++;
        }
        sc.close();
    }
}