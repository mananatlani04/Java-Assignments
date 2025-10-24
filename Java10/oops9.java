import java.util.Scanner;
class Max
{
    private String data;
    private String output;

    public Max(String data)
    {
        this.data = data;
    }
    public int max()
    {
        char arr[] = data.toCharArray();
        int A = 0;
        for ( int i = 0; i < data.length(); i++)
        {
            int count = 0;
            if ( arr[i] == ' ')
            {
                continue;
            }
            count++;
            A = count;
        }
        return A;
    }
    public void display()
    {
        System.out.println("Entered String :" + data);
        System.out.println("");
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = sc.nextLine();
        Max obj1 = new Max(input);
        obj1.display();
        
    }
}