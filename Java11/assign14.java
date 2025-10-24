/* Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R */
import java.util.Scanner;
class MathOperation
{
    private double X; 
    private double Y;
    private double R;
    public void init()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter X");
        X = sc.nextDouble();
        System.out.println("enter Y");
        Y = sc.nextDouble();
    }
    public double add()
    {
        R = X + Y;
        return R;
    }
    public double multiply()
    {
        R = X * Y;
        return R;
    }
    public double power()
    {
        R = Math.pow(X,Y);
        return R;
    }
    public void display()
    {
        System.out.println(R);
    }
}
class TestMain
{
    public static void main(String[] args) 
    {
        scanner1 obj1 = new scanner1();
        obj1.init();
        obj1.add();
        obj1.display();
        obj1.multiply();
        obj1.display();
        obj1.power();
        obj1.display();    
    }
}
