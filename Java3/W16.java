import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter f/c or F/C");
        char ch=sc.next().charAt(0);
        if(ch=='f' || ch=='F')
    {
        System.out.println("enter value of fahrenheit");
        double f=sc.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("celsius="+c);
    }
     else if(ch=='c' || ch=='C')
    {
    System.out.println("enter value of celsius");
    double c=sc.nextDouble();
    double f=c*(9/5)+32;
    System.out.println("fahrenheit="+f);
    }
    else
    System.out.println("enter valid character");
        }
    }