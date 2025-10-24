/* Create a class to calculate Area of circle with one data member to store the radius and another to store area value. 
Create method members
init - to input radius from user
calc - to calculate area
display- to display area */
import java.util.Scanner;
class Area 
{
    private double r;
    private double area;
    public void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        r = sc.nextDouble();
    }
    public double getCalc()
    {
        area = Math.PI * r * r;
        return area;
    }
    public void display()
    {
        System.out.println(area);
    }
}
class TestMain
{
    public static void main(String[] args) 
    {
        Area obj1 = new Area();
        obj1.init();
        obj1.getCalc();
        obj1.display();
    }
}