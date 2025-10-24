import java.util.Scanner;
class CS{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age sex(M/F) marital(Y/N)=");
        int age=sc.nextInt();
        char sex=sc.next().charAt(0);
        char mar=sc.next().charAt(0);
        if(sex=='F'||sex=='f')
        System.out.println("Urban");
        else if((sex=='M'||sex=='m')&&(age>=20&&age<=40)) 
        System.out.println("Anywhere");
        else if((sex=='M'||sex=='m')&&(age>40&&age<=60)) 
        System.out.println("Urban");
        else 
        System.out.println("ERROR");
    }
}