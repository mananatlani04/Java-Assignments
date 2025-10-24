import java.util.Scanner;
class CS{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of person 1: ");
        int age1=sc.nextInt();
        System.out.print("Enter age of person 2: ");
        int age2=sc.nextInt();
        System.out.print("Enter age of person 3: ");
        int age3=sc.nextInt();
        int oldest=age1;
        if(age2>oldest) 
        {
            oldest = age2;
        }
        if(age3>oldest) 
        {
            oldest = age3;
        }
        int youngest=age1;
        if(age2<youngest) 
        {
            youngest = age2;
        }
        if(age3<youngest) 
        {
            youngest = age3;
        }
        System.out.println("Oldest age=" + oldest);
        System.out.println("Youngest age=" + youngest);
    }
}
