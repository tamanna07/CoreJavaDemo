package tutoring_inheritance;

public class CheckingAccount
{
    /*
   You have checking and savings account in your bank. In checking account you can deposit
   & withdraw money. On the other hand, in savings account, you can only deposit money. Make
   sure it shows the name of account owner with current balance of checking and savings account
   and it's customizable from their bank account when they make a withdraw or a deposit. Also
   make sure it shows a message of low balance alert in both checking and savings account if
   they have less then $50.00 in their account with their current balance.
    */
    String accountOwner;
    double currentBalance;
    double depositAmount;
    double withdrawAmount;
    String lowBalanceAlert;
    String currentBalanceAlert;

    //-----------------------------------------------------------------------------------------------------------------

    public void balance(String accountOwner, double currentBalance)
    {
        this.currentBalance = currentBalance;
        this.accountOwner = accountOwner;

        if (currentBalance < 50.00)
        {
            lowBalanceAlert = "WELCOME TO CHASE CHECKING! Low balance ALERT! You have a balance of $";
            System.out.println("Hello "+accountOwner+"! "+lowBalanceAlert+currentBalance);
        }else
            {
                currentBalanceAlert = "WELCOME TO CHASE CHECKING! Your current balance is $";
                System.out.println("Hello "+accountOwner+"! "+currentBalanceAlert+currentBalance);
            }
    }


    //-----------------------------------------------------------------------------------------------------------------


    public  void depositMoney(double currentBalance, double depositAmount)
    {
        currentBalanceAlert = "DEPOSIT COMPLETE! Your current balance is now $";
        lowBalanceAlert = "Low balance ALERT! ";
        this.depositAmount = depositAmount;

        if (currentBalance+depositAmount < 50.00)
        {
            System.out.print(lowBalanceAlert);
            System.out.println("You've just deposited $"+depositAmount+" in your account.");
            System.out.println(currentBalanceAlert+(currentBalance+depositAmount));
        }else
            {
                System.out.println("You've just deposited $"+depositAmount+" in your account.");
                System.out.println(currentBalanceAlert+(currentBalance+depositAmount));
            }
    }


    //-----------------------------------------------------------------------------------------------------------------


    public void withdrawMoney(double currentBalance, double withdrawAmount)
    {
        currentBalanceAlert = "WITHDRAW COMPLETE! Your current balance is now $";
        lowBalanceAlert = "Low balance ALERT! ";
        this.withdrawAmount = withdrawAmount;

        if (currentBalance-withdrawAmount < 50.00)
        {
            System.out.print(lowBalanceAlert);
            System.out.println("You've just withdrawn $"+withdrawAmount+" from your account.");
            System.out.println(currentBalanceAlert+(currentBalance-withdrawAmount));
        }else
        {
            System.out.println("You've just withdrawn $"+withdrawAmount+" from your account.");
            System.out.println(currentBalanceAlert+(currentBalance-withdrawAmount));
        }
    }



}
