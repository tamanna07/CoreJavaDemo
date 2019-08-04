package my_classes1;

public class Practice3
{
    // Modifiers:
    /*
    Access Modifiers:
        default, public, protected, private

    Non-Access Modifiers:
        static, final, abstract, synchronized and volatile
     */

    public static void main(String[] args)
    {
        //data types:

        /*
        Primitive data types:
            byte, short, int, long, float, double, char, boolean.

        Non-Primitive data types:
            String, Arrays, Classes, Interface, etc.
         */

        int a1 = 20;
        int a2 = 50;
        long a3 = 10;
        boolean a4 = a1 == a2;
        float a5 = 20.50f;
        double a6 = 50.21d;

        System.out.println("float: "+a5);
        System.out.println("double: "+a6);
        System.out.println("boolean: "+a4);

        int add = a1 + a2;
        int subtract = a2 - a1;
        long multiply = a2 * a3;
        int divide =  a2 / a1;
        int reminder = a2 % a1;
        boolean isTrue = a3 < 10;
        boolean isFalse = a2 > a6;
        boolean isWhat = a2 <= 50;
        int increment = ++a1;
        int decrement = -- a2;

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(reminder);
        System.out.println(isFalse);
        System.out.println(isTrue);
        System.out.println(isWhat);
        System.out.println(increment);
        System.out.println(decrement);

        a1 += 2;
        a2 -= 1;
        a3 /= 2;
        a1 *= 1;
        a2 %= 2;

        boolean b1 = 1 != 10;
        boolean b2 = 1 == 12;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);


        //Upper and lower cases

        String msg1 = "WelCoME to PrActice THree";
        String upperCase = msg1.toUpperCase();
        System.out.println(upperCase);

        String msg2 = "Is EvEryOne Alright?";
        String lowerCase = msg2;
        System.out.println(lowerCase.toLowerCase());

        //find the length
        System.out.println(msg1.length());

        //find index

        System.out.println(msg2.indexOf('O'));
        System.out.println(msg2.indexOf("Alright"));

        //if else
        String drink = "Coca cola";

        if (drink.equalsIgnoreCase("Coke")||drink.equalsIgnoreCase("Coca cola"))
        {
            System.out.println("dispensing Coke");
        }else if (drink.equalsIgnoreCase("Sprite"))
        {
            System.out.println("dispensing Sprite");
        }else if (drink.equalsIgnoreCase("Fanta"))
        {
            System.out.println("dispensing Fanta");
        }else
            {
                System.out.println("wrong input, try an appropriate option");
            }


        //loop
         int w = 0;
        while (w <= 5)
        {
            System.out.println(w);
            w++;
        }

        System.out.println("*********");

        int q = 1;
        do {
            System.out.println(q);
            q++;

        }while (q < 5);

        System.out.println("***********");

        for (int e = 0; e <= 7; e++)
        {
            System.out.println(e);
        }

        //arrays
        String[] names = new String[3];
        System.out.println(names.length);

        names[0] = "Corvette";
        names[1] = "BMW";
        names[2] = "Mercedes";

        System.out.println(names[1]);

        System.out.println("**********");

        String[] models = {"Stingray","750","s550"};
        System.out.println(models[1]);
        models[2] = "AMG s550";
        System.out.println(models[2]);

        System.out.println("2020 "+names[0]+' '+models[0]);

        System.out.println("*******");
        for (int f = 0; f < names.length; f++)
        {
            System.out.println(names[f]);
        }










    }
}
