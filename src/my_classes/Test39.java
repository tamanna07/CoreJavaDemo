package my_classes;

import Interface.Car2;
import Interface.Truck2;
import abstruct.ShortHuman;
import abstruct.TallHuman;


public class Test39
{
    public static void main(String[] args)
    {
        //data types
        String msg1 = "WELCOME CLASS";      //non-primitive data type
        byte b = 2;                         //primitive data type
        short s = 1;                        //primitive data type
        int i = 100;                        //primitive data type
        long l = 35000000;                  //primitive data type
        float f = 20.1f;                    //primitive data type
        double d = 345.87d;                 //primitive data type
        boolean bool = 2 < 5;               //primitive data type
        char c = 'A';                       //primitive data type


        //operators

            //arithmetic operators
        int a6 = b+s;
        int a5 = b-s;
        int a4 = b*s;
        int a3 = b/s;
        int a2 = b%s;
        int a1 = b++;
        int a7 = b--;

            //assignment operators
        int b1 = 33;
        b += 2;
        s -= 4;
        i *= 33;
        d /= 10;

            //comparison operators
        boolean b2 = 200 == 200;
        boolean b3 = 200 != 200;
        boolean b4 = 10 < 5;
        boolean b5 = 20 > 2;
        boolean b6 = 10 <= 10;
        boolean b7 = 20 >= 22;

            //logical operators
        boolean dd = 33 > 2 && 2 < 22;
        boolean dc = 33 < 2 || 2 < 22;

        System.out.println(dd);
        System.out.println(dc);

            //concatenation
        String msg2 = "THIS IS THE LESSON OF CONCATENATION";
        System.out.println("SUBJECT: "+msg2+'.');

            //UpperCase
        String msg3 = "tHIS IS all UPpER CASe sEntance";
        System.out.println(msg3.toUpperCase());

            //LowerCase
        String msg4 = "ThIs IS aLl LoWer cAse SenTANce";
        System.out.println(msg4.toLowerCase());

            //length
        System.out.println("length: "+msg2.length());

            //index
        System.out.println("USED STRING: "+msg2.indexOf("CONCATENATION"));
        System.out.println("USED CHARACTER: "+msg3.indexOf('n'));

            //if else
        String soda = "coke";
        if (soda.equalsIgnoreCase("coke")|| soda.equalsIgnoreCase("coca-cola"))
        {
            System.out.println("Dispensing coke");
        }else if (soda.equalsIgnoreCase("fanta") && soda.equalsIgnoreCase("sunkist"))
        {
            System.out.println("dispensing fanta");
        }else if (soda.equalsIgnoreCase("ginger ale"))
        {
            System.out.println("dispensing ginger ale");
        }

            //loop
        //while loop

//        int w = 1;
//        while (w <= 10)
//        {
//            System.out.println(w);
//            w++;
//        }

//       //do while
//        int dw = 1;
//        do {
//            System.out.println("this is do while loop:  "+ dw);
//            dw++;
//
//        }while (dw < 5);

        //for loop
//        for (int fo = 0; fo <= 6; fo++)
//        {
//            System.out.println("this is for loop: "+fo);
//        }

            //arrays
        String[] names = new String[4];
         names[0] = "John";
         names[1] = "Decker";
         names[2] = "Phillips";
         names[3] = "Adam";

         for (int num = 0; num < names.length; num++)
         {
             System.out.println(names[num]);
         }


         //methods > return types > parameters > constructors from class Test40

        Test40 execute1 = new Test40();             //example of constructor if u print now

        execute1.talk();

        System.out.println(execute1.run());         /*any return types has to be inside println besides VOID,
                                                    because we assign println inside of VOID, so we don't need to
                                                    reuse it again */
        execute1.math(300,26);

        /////////////////////////////////////////////////////////////////////////////////////////////////
        //interface

        Car2 execute2 = new Car2();

        execute2.wheels("Dunlop","Whitestone","Continental");
        execute2.engine();

        Truck2 execute3 = new Truck2();

        execute3.wheels("continental tire", "bangla tire","autozone tire");
        execute3.engine();

        /////////////////////////////////////////////////////////////////////////////////////////////////
        //abstract

        TallHuman execute4 = new TallHuman();
        ShortHuman execute5 = new ShortHuman();

        execute4.speak("John","Noah","Sierra");
        execute4.run();
        execute4.math("math",23,22);


        execute5.speak("perry","kate","leslie");
        execute5.run();






    }
}
