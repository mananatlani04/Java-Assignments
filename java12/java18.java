/*8. Shopping Cart
While calculating total price, one product’s price is missing (null).
What exception will occur?
How would you handle it? (Default price, error message, or skip item?)*/

class Shopping
{
    private int Quantity;
    private String price;
    public Shopping(int Quantity,String price)
    {
        this.Quantity = Quantity;
        this.price = price;
    }
    public void calculating()
    {
        try // NumberFormatException
        {
            Integer price1 = Integer.valueOf(price);
            int a = Quantity * price1;
            System.out.println(a);
        }
        catch(NumberFormatException e)
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("Price can only be in digits | Change price's default value to digits");
            e.printStackTrace();
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Shopping obj1 = new Shopping(2, null);
        obj1.calculating();
    }
}