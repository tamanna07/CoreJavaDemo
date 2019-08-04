package abstruct;

public class SpeakerDemo
{
    public static void main(String[] args)
    {
        Alexa aa = new Alexa();
        Siri ss = new Siri();



        Speaker[] obj = new Speaker[2];

        obj[0] = new Alexa();
        obj[1] = new Siri();

        for (int l = 0; l < obj.length; l++)
        {
            obj[l].audio();
            obj[l].talk();
            obj[l].webSearch();

        }
    }
}
