class bankaccount
{
    private long accountnumber;
    private String holdername;
    private int balance;
    public void setData(long accountnumber, String holdername, int balance)
    {
        this.accountnumber = accountnumber;
        this.holdername = holdername;
        this.balance = balance;
    }
    public long getAcc()
    {
        return accountnumber;
    }
    public String getHolderName()
    {
        return holdername;
    }
    public int getBalance()
    {
        return balance;
    }
    public void display()
    {
        System.out.println("Account Number:"+ accountnumber + "   " + "Holder Name:"+ holdername + "   " + "Balance:"+ balance);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        bankaccount obj = new bankaccount();
        obj.setData(7543895756546L,"Rahul",30000);
        obj.display();
    }
}
