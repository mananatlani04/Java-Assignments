import java.util.Scanner;
class CS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter unit");
        int Unit=sc.nextInt();
        int tb=Unit*100;
        System.out.println("Total bill amount="+tb);
        if(tb>=1000)
        {
        System.out.println("10% discount");
        double P=(10*tb)/100; 
        double TAAD=tb-P;                                                                                                                                                                                                                                                                                                     ;
        System.out.println("Total Amount After Discount="+TAAD);
         }
        else
        System.out.println("No Discount");
    }
        
}