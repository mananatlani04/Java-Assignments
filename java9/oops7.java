import java.util.ArrayList;
import java.util.Scanner;
class Account
{
    private String holderName;
    private String contact;
    private int balance;
    public Account(String holderName,String contact, int balance){
        this.holderName = holderName;
        this.contact = contact;
        this.balance = balance;
    }
    public Account(){}
    public String getFullAccountDetails()
    {
        return holderName+" : "+contact+" : "+balance;
    }
    public void Withdrawal(int withdraw)
    {
        if(withdraw < balance)
        {
            balance = balance - withdraw;
            System.out.println("balance withdrawal successful....in " + holderName);
        }
        else
        System.out.println("insufficient balance....");
    }
    public void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("amount deposited in " + holderName + "\nbalance:" + balance);
    }
}
class Bank
{
    ArrayList<Account> Al = new ArrayList<Account>();

    public void addAccount(Account account)
    {
        Al.add(account);
    }
    public void removeAccount(Account account)
    {
        Al.remove(account);
    }
    public void displayAccDetails()
    {
        for(Account account : Al)
        {
            System.out.println(account.getFullAccountDetails());
        }
    }
}
class Testmain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Account obj1 = new Account("Cheeku","9009111222",50000);
        Account obj2 = new Account("Peeku","9009111333",100000);
        Account obj3 = new Account("Rinku","9009111444",70000);

        Bank icici = new Bank(); // icici
        icici.addAccount(obj1);
        icici.addAccount(obj2);
        icici.addAccount(obj3);
        
        icici.displayAccDetails();
        System.out.println("-------------------------------------");
        System.out.println("enter withdrawal amount");
        int withdraw = sc.nextInt();
        obj2.Withdrawal(withdraw);
        System.out.println(obj2.getFullAccountDetails());
        System.out.println("enter Deposit amount");
        int deposit = sc.nextInt();
        obj3.deposit(deposit);
        icici.removeAccount(obj1);
        System.out.println("--------------------------------------------");
        icici.displayAccDetails();
    }
}