import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 and 5=");
        int num = sc.nextInt();
        String word;
        if(num == 1) 
        {
            word = "one";
        } 
        else if(num == 2) 
        {
            word = "two";
        } 
        else if (num == 3) 
        {
            word = "three";
        } 
        else if (num == 4)
        {
            word = "four";
        } 
        else if (num == 5) 
        {
            word = "five";
        } 
        else
        {
            word = "Invalid input - please enter a number from 1 to 5";
        }
    System.out.println(word);
    }
}