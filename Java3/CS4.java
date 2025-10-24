import java.util.Scanner;
class CS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        double marks=sc.nextInt();
        if(marks<25)
        System.out.println("F grade");
        else if(marks>=25 && marks<=45)
        System.out.println("E grade");
        else if(marks>=46 && marks<=50)
        System.out.println("D grade");
        else if(marks>=51 && marks<=60)
        System.out.println("C grade");
        else if(marks>=61 && marks<=80)
        System.out.println("B grade");
        else if(marks>=81 && marks<=100)
        System.out.println("A grade");
        else
        System.out.println("ERROR");
        }
    }

