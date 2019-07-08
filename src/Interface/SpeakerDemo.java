package Interface;

public class SpeakerDemo
{
    public static void main(String[] args)
    {

        Siri sir = new Siri();
        Alexa alex = new Alexa();

        sir.webSearch("google.com");
        alex.webSearch("yahoo.com");


        Speaker[] ss = new Speaker[2];
        ss[0] = new Siri();
        ss[1] = new Alexa();

        for (int s = 0; s < ss.length; s++)
        {
            System.out.println(ss[s].webSearch(""));
            ss[s].audio();
            ss[s].talk();
            System.out.println("***********");
        }
    }
}
