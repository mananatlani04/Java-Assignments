/*7. Custom Exception
👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
Test in main:
if(age < 18) throw new InvalidAgeException("Not eligible for voting");*/

import java.util.Scanner;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String msg)
    {
        super("You are less then 18 | Can't vote");
    }
}
class A
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        try
        {
            if( age < 18)
            {
                throw new InvalidAgeException("Not Eligible for Voting");
            }
            else
            {
                System.out.println("You can vote");
            }
        }
        catch(InvalidAgeException e)
        {
            e.printStackTrace();
        }
        finally
        {
            sc.close();
        }
    }
}