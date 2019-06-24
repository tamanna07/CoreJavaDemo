package Interface;

public class Siri implements Speaker, SpeakerDesign
{

    @Override
    public void audio()
    {
        String music = "pop music";

        if (music.equalsIgnoreCase("pop music")|| music.equalsIgnoreCase("singing music") )
        {
            System.out.println("Now playing pop music");
        }else if (music.equalsIgnoreCase("Hip-Hop Music")|| music.equalsIgnoreCase("rap music"))
        {
            System.out.println("Now playing hip-hop music");
        }else
            {
                System.out.println("Sorry, i'm not sure what you want me to play!");
            }
    }

    @Override
    public void talk()
    {
        String[] names = new String[3];
         names[0] = "Teisto";
         names[1] = "Post Malone";
         names[2] = "Offset";

         for (int n = 0; n < names.length; n++)
         {
             System.out.println("Hi, This is Siri! here are the peoples i know: "+names[n]);
         }
    }

    @Override
    public String webSearch(String search)
    {
        return "Here's the result for: "+search;
    }

    @Override
    public void color()
    {
        System.out.println("MY COLOR IS WHITE");
    }

    @Override
    public String shape(String looks) {
        return "I look like a "+looks;
    }
}
