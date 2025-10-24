import java.util.ArrayList;
import java.util.Scanner;
class Inventory
{
    private String productname;
    private int quantity;
    private int Price;
    public Inventory(String productname,int quantity, int Price)
    {
        this.productname = productname;
        this.quantity = quantity;
        this.Price = Price;
    }
    public Inventory(){}
    public String getFullInventoryDetails()
    {
        return productname + " : "+ quantity + " : " + Price;
    }
    ArrayList<Inventory> Al = new ArrayList<Inventory>();

    public void addinventory(Inventory name)
    {
        Al.add(name);
    }
    public void removeinventory(Inventory name)
    {
        Al.remove(name);
    }
    public void displayInvdetails()
    {
        for(Inventory name : Al)
        {
            System.out.println(name.getFullInventoryDetails());
        }
    }
    public void checklow()
    {
        if(quantity < 100)
        {
            System.out.println("Low Quantity" + " of " + productname + " Quantity : " + quantity);
        }
        else
        {
            System.out.println("Enough Quantity" + " of " + productname + " Quantity : " + quantity);
        }
    }
}
class Testmain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Inventory obj1 = new Inventory("mobile phones",1000,10000);
        Inventory obj2 = new Inventory("laptops",575,50000);
        Inventory obj3 = new Inventory("television",69,70000);

        Inventory Inv = new Inventory();
        Inv.addinventory(obj1);
        Inv.addinventory(obj2);
        Inv.addinventory(obj3);
        Inv.displayInvdetails();
        obj1.checklow();
        System.out.println("-------------------------------------");
        Inv.removeinventory(obj1);
        obj3.checklow();
        Inv.displayInvdetails();
    }
}