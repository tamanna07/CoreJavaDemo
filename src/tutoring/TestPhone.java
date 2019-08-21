package tutoring;

public class TestPhone
{
    /*
        Make a phone class that can have speaker with bose model, display with touch screen, a shape of a rectangle, and also have
        a artificial intelligence feature that speak and also can do basic math such as addition, subtraction
        multiplication, and division. Also when u turn the phone on, it should say a greeting with the name of
        the phone owner. Make sure all the values are initialized in Main class so that it can be edited if needed anytime there.
         */
    public static void main(String[] args)
    {
        Phone obj = new Phone();
        obj.turnOn("Raihan","WELCOME TO iPhone");
        obj.speaker("Bose");
        obj.display("touch screen!");
        obj.shape(true);
        obj.math(20,10,"mudulus");

    }
}
