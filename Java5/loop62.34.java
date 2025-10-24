import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        System.out.println("enter character (character  should be bigger than 'd' and 'D')");
        char c = sc.next().charAt(0);
        char ch = c;
        char a = 'e';
        char b = 'E';
        if( ch >= 'e' && ch >= 'E')
        {
            for ( int i = n; i >= 1; i--,ch--)
            {
                for ( int j = 1; j <= i; j++)
                {
                    System.out.print(ch);
                }
                    System.out.println();
            }
        }
        else 
        System.out.println("please enter valid character");
    }
}
