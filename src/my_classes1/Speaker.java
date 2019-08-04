package my_classes1;

public class Speaker
{
    public String power(String powerButton)
    {
        return powerButton;
    }

    public String sleep(String sleepMode)
    {
        return sleepMode;
    }

    public void antena()
    {
        String msg = "currently unavailable";
        System.out.println(msg);
    }

    //*****************************************
    //*****************************************
    //*****************************************

    public static void main(String[] args)
    {
        Speaker production = new Speaker();

        //example1
        String msg1 = production.power("Powering off");
        System.out.println(msg1);

        //********************************************************

        //example2
        System.out.println(production.sleep("going to sleep"));

        //********************************************************

        //example3
        production.antena();
    }
}
