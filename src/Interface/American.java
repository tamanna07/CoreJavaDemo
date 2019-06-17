package Interface;

public class American implements Human
{
    public void talk(String fullName)
    {
        System.out.println(fullName);
    }

    public void activity()
    {
        System.out.println("run as fast as you can");
    }

    public int math(int num1, int num2, String action)
    {
        if (action.equalsIgnoreCase("Addition"))
        {
            return num2 + num1;
        }else if (action.equalsIgnoreCase("Subtraction"))
        {
            return num2 - num1;
        }else if (action.equalsIgnoreCase("Multiplication"))
        {
            return num2 * num1;
        }else if (action.equalsIgnoreCase("Division"))
        {
            return num1 / num2;
        }else
            {
                return 0;
            }
    }

}
