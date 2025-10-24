import java.util.Scanner;
class W 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total electricity units consumed: ");
        double units = in.nextDouble();
        double amount;
        if (units <= 50) 
        {
            amount = units * 0.50;
        } 
        else if (units <= 150) 
        {
            amount = (50 * 0.50) + ((units - 50) * 0.75);
        } 
        else if (units <= 250) 
        {
            amount = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } 
        else 
        {
            amount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }
        double surcharge = amount * 0.20;
        double totalBill = amount + surcharge;
        System.out.printf("totalBill="+totalBill);
    }
}
