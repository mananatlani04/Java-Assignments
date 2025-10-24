import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tl");
        int tl=sc.nextInt();
        System.out.println("enter tb");
        int tb=sc.nextInt();
        System.out.println("enter rl");
        int rl=sc.nextInt();
        System.out.println("enter rb");
        int rb=sc.nextInt();
        int aor=rl*rb;
        int a=tl*tb;
        int not=aor/a;
        System.out.println("not="+not);
    }
}