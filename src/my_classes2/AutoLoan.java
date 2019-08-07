package my_classes2;

public class AutoLoan
{

    public static void getQuote(String name, int creditScore, double salary)
    {
        boolean minYearlySalary = salary >= 95000.00;

        boolean creditScoreRange = creditScore >= 700;

        String approvalMsg = "Congratulations, "+name+'!'+ " You've been approved for Auto Loan with us.";

        String declinedMsg = "Sorry "+name+'!'+ " unfortunately you weren't approved for a auto loan " +
                "because you do not meet with our requirements.";


        if (minYearlySalary == false || creditScoreRange == false){
            System.out.println(declinedMsg);
        }else{
            System.out.println(approvalMsg);
        }
    }
}
