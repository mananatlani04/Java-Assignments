class circle
{
    private int radius;
public circle(int radius)
{
    this.radius = radius;
}
public void setRadius(int radius)
{
    this.radius = radius;
}
public int getRadius()
{
    return radius;
}
public void circumference()
{
    System.out.println("circumference of the circle:" + (2 * Math.PI * radius));
}
public void area()
{
    System.out.println("Area of the circle:" + (Math.PI * radius * radius));
}
public void display()
{
    System.out.println("radius:" + radius);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        circle t1 = new circle(20);
        circle t2 = new circle(21);
        t1.display();
        t1.circumference();
        t1.area();
        t2.display();
        t2.circumference();
        t2.area();
    }
}