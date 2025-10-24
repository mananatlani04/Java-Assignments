class P
{
    public static void main(String args[])
    {
        int c,p,l,b,rpm,a;
        c=1600;
        l=20;
        rpm=25;
        p=c/rpm;
        b=(p/2-l);
        a=l*b;
        System.out.println("p:"+p);
        System.out.println("b:"+b);
        System.out.println("a:"+a);
    }
}