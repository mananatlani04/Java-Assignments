/*Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer*/
class MathOperation
{
    private int A;
    private int B;
    private float C;
    private float D;
    private float E;
    private double F;
    public MathOperation( int A, int B, float C, float D, float E, double F)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
    }
    public void multiply1()
    {
        int result = A * B;
        System.out.println("result1 : " + result);
    }
    public void multiply2()
    {
        double result = C * D * E;
        System.out.println("result2 : " + result);
    }
    public void multiply3()
    {
        int G [] = {1,2,3,4,5,6};
        int result = 1;
        for ( int i = 0; i < G.length; i++)
        {
            result *= G[i];
        }
        System.out.println("Result3 : " + result);
    }
    public void multiply4()
    {
        double result = A * C;
        System.out.println("result4 : " + result);
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        MathOperation obj1 = new MathOperation(2,3,3.0f,4.0f,5.0f,6.0);
        obj1.multiply1();
        obj1.multiply2();
        obj1.multiply3();
        obj1.multiply4();
    }
}