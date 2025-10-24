class P
{
    public static void main(String args[])
    {
        double a,base,height,x;
        base=8;
        height=5;
        a=320;
        double cons=(0.5*base*height);
        x=a/cons;
        x=Math.sqrt(x);
        double b=base*x;
        double h=height*x;
        System.out.println("b:"+b);
        System.out.println("h:"+h);
    }
}