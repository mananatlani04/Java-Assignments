class MobilePhoneStore
{
    private String brand;
    private String model;
    private int price;
    public void setData(String brand,String model,int price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getPrice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("Brand Name:"+ brand);
        System.out.println("Model:"+ model);
        System.out.println("Price:"+ price);
    }
    public void affordable()
    {
        if(price < 20000)
            System.out.println("Affordable");
        else
            System.out.println("Not Affordable");
    }
}
class Testmain
{
    public static void main(String args[])
    {
        MobilePhoneStore obj = new MobilePhoneStore();
        obj.setData("Realme","p3 ultra 5g",23999);
        obj.display();
        obj.affordable();
        obj.setData("Samsung","f16 5g",16999);
        obj.display();
        obj.affordable();
    }
}
