package Interface;

public class Truck2 implements Vehicle2
{

    @Override
    public void wheels(String brand1, String brand2, String brand3)
    {
        String[] names = new String[3];
         names[0] = brand1;
         names[1] = brand2;
         names[2] = brand3;

        System.out.println("list of truck tires dfrom CLASS  truck2 without parameters");

         for (int c = 0; c < names.length; c++)
         {
             System.out.println(names[c]);
         }
    }

    @Override
    public String engine()
    {
        String water = "fiji";

        if (water.equalsIgnoreCase("aquafina")||water.equalsIgnoreCase("fiji"))
        {
            System.out.println("dispensing water");
        }else if (water.equalsIgnoreCase("poland spring"))
        {
            System.out.println("dispensing poland spring");
        }else
            {
                System.out.println("you have put the wrong input");
            }
        return "";
    }
}
