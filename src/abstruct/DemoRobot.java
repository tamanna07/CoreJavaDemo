package abstruct;

public class DemoRobot
{
    public static void main(String[] args)
    {
        T800 execute1 = new T800();

        execute1.walk();
        execute1.activity(+3,9,"Addition");
        execute1.speak("DJ KHALED","RIHANA","CARDI B","CAMILLA CABELLO");

        System.out.println("**************");

        T1000 execute2 = new T1000();

        execute2.activity(30,100,"Subtraction");
        execute2.activity(30,100,"Multiplication");
        execute2.walk();
        execute2.speak("THE WEEKND","JAY-Z","ACE-HOOD","NIPSEY HUSTLE");

    }
}
