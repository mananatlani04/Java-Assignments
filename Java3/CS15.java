import java.util.Scanner;
class CS
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price of bike=");
        double cost=sc.nextDouble();
        double taxRate;
        if (cost > 100000) 
        {
            taxRate = 0.15;
        } 
        else if (cost > 50000) 
        {
            taxRate = 0.10;
        } 
        else 
        {
            taxRate = 0.05;
        }
        double tax = cost * taxRate;
        System.out.println("tax="+tax);
    }
} 