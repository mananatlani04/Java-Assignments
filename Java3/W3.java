import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage (0-100): ");
        int percent = sc.nextInt();
        if(percent > 90) 
        {
        System.out.println("Grade: A");
        } 
        else if(percent > 80 && percent <= 90) 
        {
        System.out.println("Grade: B");
        } 
        else if(percent >= 60 && percent <= 80) {
        System.out.println("Grade: C");
        } 
        else if(percent < 60 && percent >= 0) {
        System.out.println("Grade: D");
        } 
        else 
        {
        System.out.println("Invalid percentage!");
        }
    }
}
