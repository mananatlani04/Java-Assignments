/*5. ATM PIN Validation
If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.
Which exception handling mechanism will you use?
Should it be checked (force the programmer to handle) or unchecked?*/

import java.util.Scanner;
class AccountLockedException extends Exception
{
    public AccountLockedException(String msg)
    {
        super(msg);
    }
}
class A
{
    private int Pin = 1234;
    public void getCheck()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter Pin");
            int p = sc.nextInt();
            try
            {
                if( p == Pin )
                {
                    System.out.println("Correct Pin Entered");
                    break;
                }
                if( i == 2 )
                {
                    throw new AccountLockedException("Too Many Wrong Attempts | Your Account is Locked");
                }
                else
                {
                    System.out.println("Wrong Pin Entered");
                }
            }
            catch(AccountLockedException e)
            {
                e.printStackTrace();
            }
            finally
            {
                sc.close();
            }
        }
    }
}
class Testmain
{
        public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.getCheck();

    }   
}