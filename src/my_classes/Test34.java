package my_classes;

public class Test34 extends Test35
{


    protected void vMachine()
    {
        String soda = "coke";

        if (soda.equalsIgnoreCase("coke"))
        {
            System.out.println("the coke is one dollar, please insert the money-->");
        }else if (soda.equalsIgnoreCase("fanta"))
        {
            System.out.println("this fanta is 2 dollars, please insert the money-->");
        }else
            {
                System.out.println("this is a wrong input, please try again!");
            }
    }



    @Override
    public int calculator(int add1, int add2) {
        return add1 + add2;
    }

    @Override
    public void loop()
    {
        int w = 1;

        while (w <= 10){
            System.out.println(w);
            w++;
        }
    }

    @Override
    public void newMath(int num1, int num2, String action)
    {
        if (action.equalsIgnoreCase("Addition"))
        {
            System.out.println(num2 + num1);
        }else if (action.equalsIgnoreCase("Subtraction"))
        {
            System.out.println(num2 - num1);
        }else if (action.equalsIgnoreCase("Multiplication"))
        {
            System.out.println(num2 * num1);
        }else if (action.equalsIgnoreCase("Division"))
        {
            System.out.println(num2 / num1);
        }else
            {
                System.out.println("wrong input");
            }
    }

    @Override
    public int newMath1(int num1, int num2, String action) {
        return 0;
    }
}
