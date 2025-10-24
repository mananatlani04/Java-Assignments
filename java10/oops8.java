import java.util.Scanner;
class Occurence
{
    private String data;

    public Occurence(String data)
    {
        this.data = data;
    }
    public void display()
    {
        System.out.println("Entered String :" + data);
    }
    public void Occu()
    {
        char arr[] = data.toCharArray();
        for ( int i = 0; i < data.length(); i++)
        {
            if ( arr[i] == '\0' )
            continue;

            int count = 1; 
            for ( int j = i + 1; j < data.length(); j++)
            {
                if ( arr[i] == arr[j] )
                {
                    count++;
                    arr[j] = '\0';
                }
            }
            System.out.println("character : " + arr[i] + " appered : " + count + " time");
        }
    } 
}
class Testmain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = sc.nextLine();

        Occurence obj1 = new Occurence(input);
        obj1.Occu();
    }
}