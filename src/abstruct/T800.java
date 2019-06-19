package abstruct;

public class T800 extends Robot
{

    @Override
    void walk()
    {
        System.out.println("I maybe old but i can walk almost all day");
    }

    @Override
    int activity(int num1, int num2, String action)
    {
        if (action.equalsIgnoreCase("Addition"))
        {
            System.out.println(num2+num1);
        }else if (action.equalsIgnoreCase("Subtraction"))
        {
            System.out.println(num2-num1);
        }else if (action.equalsIgnoreCase("Multiplication"))
        {
            System.out.println(num2*num1);
        }else if (action.equalsIgnoreCase("Division"))
        {
            System.out.println(num1/num2);
        }else
            {
                System.out.println("INVALID INPUT, PLEASE TRY AGAIN!");
            }
        return 0;
    }

    @Override
    void speak(String name1, String name2, String name3, String name4)
    {
        String[] list = new String[4];

        list[0] = name1;
        list[1] = name2;
        list[2] = name3;
        list[3] = name4;

        for (int s = 0; s < list.length; s++)
        {
            System.out.println(list[s]);
        }
    }
}
