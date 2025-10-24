import java.util.Scanner;
class CS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of years");
        int years=sc.nextInt();
        System.out.println("enter salary");
        int salary=sc.nextInt();
        if(years>5)
        {
        System.out.println("5% bonus");
        double P=(5*salary)/100; 
        double Result=salary+P;                                                                                                                                                                                                                                                                                                     ;
        System.out.println("total salary="+Result);
         }
        else
        System.out.println("No Discount");  
    }
}