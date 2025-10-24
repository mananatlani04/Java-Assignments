class Rectangle
{
    private int width;
    private int length;
public Rectangle(int width, int length)
{
    this.width = width;
    this.length = length;
}
public void setWidth(int width)
{
    this.width = width;
}
public void setLength(int length)
{
    this.length = length;
}
public int getwidth()
{
    return width;
}
public int getlength()
{
    return length;
}
public void perimeter()
{
    System.out.println("Perimeter of the rectangle:" + (2 * (length + width)));
}
public void area()
{
    System.out.println("Area of the rectangle:" + (length * width));
}
public void display()
{
    System.out.println("width:" + width +"  length:" + length);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        Rectangle t1 = new Rectangle(13,20);
        Rectangle t2 = new Rectangle(14,21);
        t1.display();
        t1.perimeter();
        t1.area();
        t2.display();
        t2.perimeter();
        t2.area();
    }
}