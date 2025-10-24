import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();
        if (sp > cp) 
        {
            double profit = sp - cp;
            System.out.printf("profit="+profit);
        } 
        else if (sp < cp) 
        {
            double loss = cp - sp;
            System.out.printf("loss="+loss);
        } 
        else 
        {
            System.out.println("No Profit No Loss");
        }
    }
}