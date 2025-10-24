class ProductInventory
{
    private int productid;
    private String name;
    private int quantity;
    private int price;
    public void setData(int productid, String name, int quantity, int price)
    {
        this.productid = productid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void multiplication()
    {
        System.out.println("Total Value:"+ quantity * price);
    }
    public int getProductid()
    {
        return productid;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void display()
    {
        System.out.println("Product Id:"+ productid);
        System.out.println( "Product Name:"+ name);
        System.out.println( "Quantity:"+ quantity);
        System.out.println( "Price:"+ price);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        ProductInventory obj = new ProductInventory();
        obj.setData(123,"Samsung",300,15000);
        obj.display();
        obj.multiplication();
    }
}
