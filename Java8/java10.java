class CircleGeometry
{
    private float length;
    private float width;
    public void setData(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public float getlength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    public void Calculate()
    {
        System.out.println("Area of circle : "+ length * width);
        System.out.println("-----------------------------------");
    }
    public void display()
    {
        System.out.println("Length : "+ length);
        System.out.println("Width : "+ width);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        CircleGeometry obj = new CircleGeometry();
        obj.setData(10,8);
        obj.display();
        obj.Calculate();
        obj.setData(9,7);
        obj.display();
        obj.Calculate();
    }
}