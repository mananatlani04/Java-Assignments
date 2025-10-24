class CircleGeometry
{
    private float radius;
    public void setData(float radius)
    {
        this.radius = radius;
    }
     public float getRadius()
    {
        return radius;
    }
    public void Calculate()
    {
        System.out.println("Circumference:"+ 2 * Math.PI * radius);
        System.out.println("Area:"+ 2 * Math.PI * radius * radius);
    }
    public void display()
    {
        System.out.println("Radius:"+ radius);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        CircleGeometry obj = new CircleGeometry();
        obj.setData(10);
        obj.display();
        obj.Calculate();
        obj.setData(9);
        obj.display();
        obj.Calculate();
    }
}