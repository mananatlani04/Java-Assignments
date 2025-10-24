/*1. Banking System – Insufficient Balance
You are building a banking system. A user tries to withdraw more money than available in their account.
Which exception would you throw?
Will you use a checked or unchecked exception? Why?
Write a custom exception InsufficientBalanceException.*/

class  InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String msg)
    {
        super("InsufficientBalance in your bank account");
    }
}
class Bank
{
    private double balance;
    public Bank()
    {
        balance = 10000;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Amount Deposited");
    }
    public void withdraw(int amount) throws InsufficientBalanceException
    {
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Cannot withdraw more than the balance available");
        }
        else
        {
            balance -= amount;
            System.out.println("Amount Withdrawal Successful (" + amount + ")");
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Bank obj1 = new Bank();
        try
        {
            obj1.deposit(5000);
            System.out.println("Balance:" + obj1.getBalance());
            obj1.withdraw(15000);
            System.out.println("Balance:" + obj1.getBalance());
            obj1.withdraw(1);
            System.out.println("Balance:" + obj1.getBalance());
        }
        catch(InsufficientBalanceException e)
        {
            e.printStackTrace();
        }
    }
}