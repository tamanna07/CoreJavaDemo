package tutoring_inheritance;

public class SavingsAccount extends CheckingAccount
{
    /*
   You have checking and savings account in your bank. In checking account you can deposit
   & withdraw money. On the other hand, in savings account, you can only deposit money. Make
   sure it shows the name of account owner with current balance of checking and savings account
   and it's customizable from their bank account when they make a withdraw or a deposit. Also
   make sure it shows a message of low balance alert in both checking and savings account if
   they have less then $50.00 in their account with their current balance.
    */

    public void balance(String accountOwner, double currentBalance)
    {
        this.currentBalance = currentBalance;
        this.accountOwner = accountOwner;

        if (currentBalance < 50.00)
        {
            lowBalanceAlert = "WELCOME TO CHASE SAVINGS! Low balance ALERT! You have a balance of $";
            System.out.println("Hello "+accountOwner+"! "+lowBalanceAlert+currentBalance);
        }else
        {
            currentBalanceAlert = "WELCOME TO CHASE SAVINGS! Your current balance is $";
            System.out.println("Hello "+accountOwner+"! "+currentBalanceAlert+currentBalance);
        }
    }


    //-----------------------------------------------------------------------------------------------------------------


    public void withdrawMoney(double currentBalance, double withdrawAmount)
    {
        String decline = "Sorry! unfortunately you cannot make a withdraw from your savings account." +
                         " Please contact with your local CHASE BANK. THANK YOU!";
        System.out.println(decline);
    }
}
