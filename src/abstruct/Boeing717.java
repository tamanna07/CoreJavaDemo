package abstruct;

public class Boeing717 extends Plane
{
    protected void engine()
    {
        System.out.println("the engine is V15");
    }

    protected void tires(String model)
    {
        if (model.equalsIgnoreCase("WhiteStone tires"))
        {
            System.out.println("This Tire is compatible with this plane");
        }else
        {
            System.out.println("Wrong input");
        }
    }

    protected String pilots()
    {
        String[] names = new String[5];
        names[0] = "Gonzales";
        names[1] = "James";
        names[2] = "Rodriguez";
        names[3] = "Kabir";
        names[4] = "John";

        for (int n = 0; n < names.length; n++)
        {
            System.out.println(names[n]);
        }
        return "";
    }
}
