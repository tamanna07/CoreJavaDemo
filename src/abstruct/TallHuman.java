package abstruct;

public class TallHuman extends Human2
{

    @Override
    public void speak(String name1, String name2, String name3)
    {
        String[] names = new String[3];

        names[0] = name1;
        names[1] = name2;
        names[2] = name3;

        System.out.println("i know few people, their names are: ");
        for (int p = 0; p < names.length; p++)
        {
            System.out.println(names[p]);
        }

    }

    @Override
    public String run()
    {
        String eat = "burger";
        if (eat.equalsIgnoreCase("french fries")||eat.equalsIgnoreCase("fries"))
        {
            System.out.println("eating __french fries while running");
        }else if (eat.equalsIgnoreCase("burger")||eat.equalsIgnoreCase("sandwich"))
        {
            System.out.println("eating____sandwich while running");
        }
        return "";
    }
}
