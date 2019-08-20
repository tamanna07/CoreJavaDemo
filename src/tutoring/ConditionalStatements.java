package tutoring;

import my_classes1.Car;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        //  if/else statement

        String name1 = "Raihan";

        if (name1 == "Raihan"){
            System.out.println(name1);
        }else
            {
                System.out.println("wrong input");
            }

        String name2 = "fahim";

        if (name2.equalsIgnoreCase("rifath"))
        {
            System.out.println("my name is :"+name2);
        }else if (name2.equalsIgnoreCase("raihan"))
        {
            System.out.println("and i am  "+name2);
        }else
            {
                System.out.println("invalid");
            }

        int employeeId = 112;
        if (employeeId == 2234)
        {
            System.out.println("this is : 2234");
        }else if (employeeId == 5565)
        {
            System.out.println("it is "+ employeeId);
        }else
            {
                System.out.println("invalid");
            }

        /*write a condition that shows if the a person name rifath didn't pay the bill on time, she should
        get charged with a penalty of $35.79 from her current balance. and if she paid the bill on time, she should receive
        a thank you message.
        */
        boolean paidBillOnTime = false;
        String name = "Raihan";
        double currentBalance = 500.75;
        double penalty = 35.79;
        String thankMsg = "Thank you for paying the bill on time";

        if (paidBillOnTime == false && name.equalsIgnoreCase("Raihan"))
        {
            double balanceAfterPenalty = currentBalance - penalty;
            System.out.println("Due to late payment you were charged "+'$'+penalty);
            System.out.println("Your current balance is now "+'$'+ balanceAfterPenalty);
        }else
            {
                System.out.println(thankMsg+ name+'.'+" Your current balance is "+ currentBalance);

            }


        //SwitchCase
        String day = "friday";

        switch (day)
        {
            case "Monday":
                day = "Monday";
                break;
            case "Tuesday":
                day = "Tuesday";
                break;
            case "Wednesday":
                day = "Wednesday";
                break;
            default:
                day = "invalid";

        }
        
    }
}
