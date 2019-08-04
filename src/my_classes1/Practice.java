package my_classes1;

public class Practice
{
    public static void main(String[] args)
    {
        //data types

        //primitive data types
        byte b = 2;
        short s = 4;
        int i = 10;
        long l = 1000;
        double d = 20.50d;
        float f = 33.12f;
        char c = 'C';
        boolean t = 12 < 15;

        //non primitive data types
        String name = "Kabir";
        //Array
        //null
        //Interface
        //Classes

        // Arithmetic operators
        int plus = b + s;
        int minus = s - b;
        int multiply = s * b;
        int division = b / s;
        int modulus = b % s;
        int increment = b++;
        int decrement = b--;

        // Assignment operators
        int o = 20;
        b += 3;
        i -= 3;
        l *= 2;
        s /= 2;
        l %= 2;

        // Comparision operators

        boolean b1 = b < 10;
        boolean b2 = c > 10;
        boolean b3 = b <= 10;
        boolean b4 = b >= 10;
        boolean b5 = c == 30;
        boolean b6 = s != 10;


        //concentration
        System.out.println("FULL NAME: "+"Mohammed Raihan "+name);

        //UpperCase
        String msg1 = "The earth is bigger than moon";

        System.out.println("UpperCase: "+ msg1.toUpperCase());

        //LowerCase
        String msg2 = "This IS the MonTh of JUne";
        System.out.println("LowerCase: "+msg2.toLowerCase());

        //length
        System.out.println("Length of ms1: "+msg1.length());

        //index
        System.out.println("Index of msg2 char: "+msg2.indexOf('M'));
        System.out.println("Index of msg2 String: "+ msg2.indexOf("JUne"));


        // if/else
        String soda = "Coke";
        if (soda.equalsIgnoreCase("Coke"))
        {
            System.out.println("sending Coke");
        }else if (soda.equalsIgnoreCase("Fanta"))
        {
            System.out.println("sending Fanta");
        }else if (soda.equalsIgnoreCase("Sprite"))
        {
            System.out.println("sending Sprite");
        }else
            {
                System.out.println("Wrong input! please try again");
            }


        //loop
//       int w = 1;
//        while(w <= 10)
//        {
//            System.out.println("WHILE LOOP: "+ w);
//            w++;
//        }

//        int dw = 1;
//        do {
//            System.out.println("DO WHILE LOOP: " +dw);
//            dw++;
//        }while(dw <= 10);

        for (int fl = 1; fl <= 10; fl++)
        {
            System.out.println("FOR LOOP: "+fl);
        }


        //method: making an object in this class from a concrete class---

        Practice2 demo1 = new Practice2();              //also used as constructor from diff class
        Practice2 demo2 = new Practice2();              //also used as constructor from diff class

        demo1.name = "CHRISTIANO RONALDO";
        demo1.age = 33;
        demo1.country = "PORTUGAL";

        demo1.speak();
        System.out.println("*********************");
        System.out.println(demo1.doAddMath(20,50));
        System.out.println("*******************");
        demo1.fullName("CHRISTIANO","RONALDO");

        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("**********************");


        demo2.name = "LEONEL MESSI";
        demo2.age = 35;
        demo2.country = "ARGENTINA";

        demo2.speak();
        System.out.println("************************");
        System.out.println(demo2.doAddMath(10,40));
        System.out.println("************************");
        demo2.fullName("LEONEL","MESSI");


        //arrays

        String[] names = new String[5];

        names[0] = "DRAKE";
        names[1] = "FRENCH MONTANA";
        names[2] = "DJ KHALED";
        names[3] = "EMINEM";
        names[4] = "CHRIS BROWN";

        for (int n = 0; n < names.length; n++)
        {
            System.out.println(names[n]);
        }


        //interface and abstract practices are in different packages










    }

}
