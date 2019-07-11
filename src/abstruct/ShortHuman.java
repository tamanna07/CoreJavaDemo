package abstruct;

public class ShortHuman extends Human2
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
        String music = "hip-hop";
        if (music.equalsIgnoreCase("hip-hop")||music.equalsIgnoreCase("rap"))
        {
            System.out.println("playing __station's top hip hop while running");
        }else if (music.equalsIgnoreCase("pop")||music.equalsIgnoreCase("singing song"))
        {
            System.out.println("playing Tylor swift while running");
        }
        return "";
    }
}
