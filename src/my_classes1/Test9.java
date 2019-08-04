package my_classes1;

public class Test9
{
    public static void main(String[] args)
    {
        String usb = "iPhone";

        if (usb.equalsIgnoreCase("iPhone"))
        {
            System.out.println("right input");
        }else if (usb.equalsIgnoreCase("pixel"))
        {
            System.out.println(" right input");
        }else {
            System.out.println("wrong input");
        }


        int banana = 20;
        int apple = 25;
        apple += 5;
        int keys = 50;
        double speed = 200.19d;
        String headline = "shopping for today April 7th 2019";
        String level = "i'm done for today";
        boolean result = apple == banana;

        System.out.println(headline.toUpperCase());
        System.out.println(level.indexOf('r'));
        System.out.println(headline.indexOf("April"));
        System.out.println(level.length());
        System.out.println(headline.toLowerCase());
        System.out.println(speed+" mph");
        System.out.println(banana+" war "+keys);
        System.out.println(keys+apple/banana);
        System.out.println(apple);
        System.out.println(result);
        System.out.println(apple != keys);
        System.out.println(apple >= speed);
        System.out.println(apple <= speed);
        System.out.println(banana >= banana);

    }
}
