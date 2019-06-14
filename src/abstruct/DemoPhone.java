package abstruct;

public class DemoPhone
{
    public static void main(String[] args)
    {
        IphoneX execute1 = new IphoneX();
        SamsungS10 execute2 = new SamsungS10();

        System.out.println("*iPhoneX Features*");
            System.out.print("Speaker: ");
        execute1.speaker();
            System.out.print("Display: ");
        execute1.display();
            System.out.print("Cellular Coverage: ");
        execute1.cellularNet();
            System.out.print("Additional Features: ");
        execute1.chargingPort();

        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("*******************************");

        System.out.println("*Samsung S10 Features*");
            System.out.print("Speaker: ");
        execute2.speaker();
            System.out.print("Display: ");
        execute2.display();
            System.out.print("Cellular Coverage: ");
        execute2.cellularNet();
            System.out.print("Additional Features: ");
        execute2.chargingPort();
    }
}
