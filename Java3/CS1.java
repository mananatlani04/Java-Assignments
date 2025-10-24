import java.util.Scanner;
class CS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int l=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        if(l==b)
        System.out.println("square");
        else
        System.out.println("not a square");
    }
}