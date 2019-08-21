package tutoring;

public class Phone
{
    /*
        Make a phone class that can have speaker with bose model, display with touch screen, a shape of a rectangle, and also have
        a artificial intelligence feature that speak and also can do basic math such as addition, subtraction
        multiplication, and division. Also the when u turn the phone on, it should say a greeting with the name of
        the phone owner. Make sure all the values are initialized in Main class so that it can be edited if needed anytime there.
         */

    String speakerModel;
    String displayType;
    String greetingMessage;
    String ownerName;

    public void turnOn(String ownerName, String greetingMessage)
    {
        this.ownerName = ownerName;
        this.greetingMessage = greetingMessage;
        System.out.println("Turning on....");
        System.out.println("Hello "+ownerName+'!'+' '+greetingMessage);
    }

    public void speaker(String speakerModel)
    {
        this.speakerModel = speakerModel;
        System.out.println("Your speaker model is "+speakerModel);
    }

    public void display(String displayType)
    {
        this.displayType = displayType;
        System.out.println("This phone's display is "+displayType);
    }


    public boolean shape(boolean isTrue)                            //very important way
    {
        if (isTrue == true)
        {
            System.out.println("It is a rectangle shape iPhone");
            return isTrue;
        }else {
            System.out.println("It is not a rectangle shape iPhone");
            return isTrue;
        }
    }

    public void math(int num1,int num2,String activity)
    {
        if (activity.equalsIgnoreCase("add"))
        {
            System.out.print("Addition result: ");
            System.out.println(num1 + num2);
        }else if (activity.equalsIgnoreCase("subtract"))
        {
            System.out.print("Subtraction result: ");
            System.out.println(num1 - num2);
        }else if (activity.equalsIgnoreCase("multiply"))
        {
            System.out.print("Multiplication result: ");
            System.out.println(num1 * num2);
        }else if (activity.equalsIgnoreCase("divide"))
        {
            System.out.print("Division result: ");
            System.out.println(num1/num2);
        }else
            {
                System.out.println("Sorry! that's out of my capability, please try putting an appropriate function");
            }
    }
}
/*
You have list of items that are oatmeal, chocolates, chips, paper towel, and broom that you need to buy.
Your budget is $20. The price for items:
    oatmeal = $7.76
    chocolate = $3.10
    chips = $1.50
    paper towel = $3.80
    broom = $15.85
So buy the items that fits under your budget
 */