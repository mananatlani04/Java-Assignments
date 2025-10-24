import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lowercase Alphabets:");
        char a = sc.next().charAt(0);
        System.out.println("Output:");
        for (char ch = a; ch <= 'z'; ch++) 
        {
            System.out.print(ch +" ");
        }
        sc.close();
    }
}