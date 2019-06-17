package abstruct;

public class Boeing787 extends Plane
{
    protected void engine()
    {
        System.out.println("the engine is V30");
    }

    protected void tires(String model)
    {
        if (model.equalsIgnoreCase("Continental tires"))
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
        names[0] = "Eddie";
        names[1] = "Peter";
        names[2] = "Ozuna";
        names[3] = "Jay";
        names[4] = "Lexi";

        for (int n = 0; n < names.length; n++)
        {
            System.out.println(names[n]);
        }
        return "";
    }
}
