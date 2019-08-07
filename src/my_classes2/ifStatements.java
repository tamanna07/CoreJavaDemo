package my_classes2;

public class ifStatements
{
    public static void main(String[] args)
    {
//        boolean paidBillOnTime = false;
//        String name = "Raihan";
//        double currentBalance = 500.75;
//        double penalty = 35.79;
//        String thankMsg = "Thank you for paying the bill on time";
//
//        if (paidBillOnTime == false && name.equalsIgnoreCase("Raihan"))
//        {
//            double balanceAfterPenalty = currentBalance - penalty;
//            System.out.println("Due to late payment you were charged "+'$'+penalty);
//            System.out.println("Your current balance is now "+'$'+ balanceAfterPenalty);
//        }else
//            {
//                System.out.println(thankMsg+ name+'.'+" Your current balance is "+ currentBalance);
//
//            }

        //--------------------------------------------------------------------------------------------------------------


        boolean excellentCreditScore = true;

        String name = "Imran";

        double yearlyIncome = 80000.00;

        boolean minIncome = yearlyIncome >= 90000.00;

        String approvalMsg = "Congratulations, "+name+'!'+ " You've been approved for Auto Loan with us.";

        String declinedMsg = "Sorry "+name+'!'+ " unfortunately you weren't approved for a auto loan " +
                             "because you do not meet with our requirements.";


        if (minIncome == false && name.equalsIgnoreCase("Raihan Kabir") && excellentCreditScore == false)
        {
            System.out.println(declinedMsg);
        }else if (minIncome == false)
        {
            System.out.println(declinedMsg);
        }else if (excellentCreditScore == false)
        {
            System.out.println(declinedMsg);
        }else
                {
                    System.out.println(approvalMsg);
                }



    }
}
