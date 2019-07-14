package polymorphism;


public class Computer
{
    public void type()
    {
        System.out.println("WE USE REGULAR KEYBOARD");
    }

    public void speak(String greeting1, String greeting2, String greeting3)
    {
        String[] msg = new String[3];
        msg[0] = greeting1;
        msg[1] = greeting2;
        msg[2] = greeting3;

        for (int m = 0; m < msg.length; m++)
        {
            System.out.println(msg[m]);
        }
    }

    public String speak(String buzzOff1, String buzzOff2)
    {
        if (buzzOff1.equalsIgnoreCase("GOOD-BYE")||buzzOff1.equalsIgnoreCase("TAA-TAA"))
        {
            String msg1 = "Thanks, GOOD-BYE";
            System.out.println(msg1);
        }else if (buzzOff1.equalsIgnoreCase("See you")&& buzzOff2.equalsIgnoreCase("Next Time"))
        {
            String msg2 = "Thanks, See you Next time";
            System.out.println(msg2);
        }else
            {
                String msg3 = "error occurred, please try again";
                System.out.println(msg3);
            }
        return "";
    }
}
