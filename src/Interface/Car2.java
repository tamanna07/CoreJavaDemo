package Interface;

public class Car2 implements Vehicle2
{

    @Override
    public void wheels(String brand1, String brand2, String brand3)
    {
        String[] names = new String[3];

        names[0] = brand1;
        names[1] = brand2;
        names[2] = brand3;
        System.out.println("****************************************");
        System.out.println("WHEELS METHOD FROM CLASS_ CAR2");

        for (int b = 0; b < names.length; b++)
        {
            System.out.println(names[b]);
        }
    }

    @Override
    public String engine()
    {
       final String size = "V6";
        String size2= "6 cylinder";
        if (size.equalsIgnoreCase("V4")||size.equalsIgnoreCase("4 cylinder"))
        {
            System.out.println("THIS IS A FOUR CYLINDER ENGINE FROM CLASS_ CAR2");
        }else if (size.equalsIgnoreCase("V6") && size2.equalsIgnoreCase("6 cylinder"))
        {
            System.out.println("THIS IS SIX CYLINDER ENGINE FROM CLASS_ CAR2");
        }else
            {
                System.out.println("wrong input");
            }
        return "";
    }
}
