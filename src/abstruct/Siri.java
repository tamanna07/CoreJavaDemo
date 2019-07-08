package abstruct;

public class Siri extends Speaker
{

    @Override
    void audio() {
        String music = "hip-hop";
        if (music.equalsIgnoreCase("hip-hop")||music.equalsIgnoreCase("rap"))
        {
            String[] playlist = new String[3];
            playlist[0] = "RAP GOD";
            playlist[1] = "STARTED FROM THE BOTTOM";
            playlist[2] = "Bugatti";
            System.out.println("Siri Now Playing: "+playlist[0]);
            System.out.println(playlist[1]);
            System.out.println(playlist[2]);
        }else if (music.equalsIgnoreCase("pop"))
        {
            System.out.println("Siri Now Playing: One Right Thing");
            System.out.println("I Don't care");
            System.out.println("Summer Days");
        }else
        {
            System.out.println("you've entered invalid input, please try again!");
        }
    }

    @Override
    void talk()
    {
        String names[] = new String[2];
         names[0] = "tim";
         names[1] = "cook";

        System.out.println("Hi this is siri, these are the people i know");

         for (int n = 0; n < names.length; n++)
         {
             System.out.println(names[n]);
         }
    }
}
