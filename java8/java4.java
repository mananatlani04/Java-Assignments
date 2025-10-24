class carinfomanager
{
    private String brand;
    private String model;
    private int year;
    public void setData(String brand,String model,int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public void display()
    {
        System.out.println("Brand:"+ brand + "   " + "Model:"+ model + "   " + "Year:"+ year);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        carinfomanager obj = new carinfomanager();
        obj.setData("Maruti Suzuki","Baleno",2024);
        obj.display();
    }
}
