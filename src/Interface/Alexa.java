package Interface;

public class Alexa implements Speaker, SpeakerDesign
{

    @Override
    public void audio() {
        String music = "pop music";

        if (music.equalsIgnoreCase("pop music")|| music.equalsIgnoreCase("singing music") )
        {
            System.out.println("Now playing "+"\""+"I don't care"+"\""+" by Ed Shareen");
        }else if (music.equalsIgnoreCase("Hip-Hop Music")|| music.equalsIgnoreCase("rap music"))
        {
            System.out.println("Now playing "+"\""+"Rap God"+"\""+" by Eminem");
        }else
        {
            System.out.println("Sorry, i'm not sure what you want me to play!");
        }
    }

    @Override
    public void talk() {
        String[] names = new String[3];
        names[0] = "DRAKE";
        names[1] = "EMINEM";
        names[2] = "DJ KHALED";

        for (int n = 0; n < names.length; n++)
        {
            System.out.println("Hi, This is Alexa! these are the peoples i know: "+names[n]);
        }
    }

    @Override
    public String webSearch(String search) {
        return "here are the result for "+ search;
    }

    @Override
    public void color() {
        System.out.println("MY COLOR IS BLACK");
    }

    @Override
    public String shape(String looks) {
        return "i look like a "+looks;
    }
}
