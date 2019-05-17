public class Test10
{
    public static void main(String[]args)
    {
        int a = 200;
        double b = 14.90d;
        int c = 50;
        c -= 3;
        int d = 150;

        System.out.println("speed in mph: "+b);
        System.out.println(c);

        System.out.println("speed: "+b);

        String cup = "coke";

        if (cup == "sprite"){
            System.out.println("give me sprite");
        }else if (cup == "fanta"){
            System.out.println("give me fanta");
        }else if (cup.equalsIgnoreCase("coke")){
            System.out.println("give me coke");
        }else {
            System.out.println("wrong input");
        }

        String headline = "java is a case sensitive language";
        String ending = "thanks for working with us";

        System.out.println(headline.toLowerCase());
        System.out.println(headline.length());
        System.out.println(headline.toUpperCase());
        System.out.println(headline.indexOf("language"));
        System.out.println(headline.indexOf('e'));


    }
}
