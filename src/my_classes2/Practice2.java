package my_classes2;

import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {

//        LetsTalkStatic obj1 = new LetsTalkStatic();
//
//        obj1.landOwner("Sylhet");

        LetsTalkStatic.landSpace(100);
        LetsTalkStatic.thikana("Address: "+"Ozone Park 75th street");

        int calculator1 = LetsTalkStatic.addCalculator(35,45);

        System.out.println(calculator1);

        //odd or even

        int num = 12;

        if (num % 2 == 0)
        {
            System.out.println(num +" is an even number");
        }else {
            System.out.println(num +" is an odd number");
        }

        System.out.println("*******************************");
        //--------------------------------------------------

        int n1 = -43;
        int n2 = -43;

        if (n2 > n1)
        {
            System.out.println(n2+" is the biggest number");
            System.out.println(n1+" is the smallest number");
        }else if (n2 == n1){
            System.out.println(n2+" and "+n1+" are equal");
        }else{
            System.out.println(n1+" is the biggest number");
            System.out.println(n2+" is the smallest number");
        }


        System.out.println("******************************");


        Scanner s = new Scanner(System.in);

        System.out.print("option 1: ");
        int b1 = s.nextInt();
        System.out.print("option 2: ");
        int b2 = s.nextInt();



        if (b2 > b1)
        {
            System.out.println(b2+" is the biggest number");
            System.out.println(b1+" is the smallest number");
        }else if (b2 == b1)
        {
            System.out.println(b2+" and "+b1+" are equal");
        }else
            {
                System.out.println(b2+" is the smallest number");
            }









































        //        int myMaxValue1 = Integer.MAX_VALUE;
//        System.out.println(myMaxValue1);
//        System.out.println(Integer.MIN_VALUE - 1);
//
//        int myMinValue2 = Integer.MIN_VALUE;
//        System.out.println(myMinValue2);
//        System.out.println(Integer.MAX_VALUE + 1);
//
//        int myMaxValue3 = Byte.MAX_VALUE;
//        System.out.println(myMaxValue3);
//
//        int myMinValue4 = Byte.MIN_VALUE;
//        System.out.println(myMinValue4);

        /*
                --Modifiers or Specifiers---
            -Two types.
                -Access Modifiers
                -Non -Access Modifiers

           -Access Modifiers: default, public, private, protected

           default: The default. No Modifiers needed.
           visible to package.

           public: visible to the global.

           private: visible to the class only

           protected: visible to the package and subclasses.



           -Non-Access Modifiers: static, final, abstract, synchronized, volatile.

           static: creating class, variable, methods.

           final: for finalize the implementation of class, methods and variable.
           ex: final String name1 = "hasaan";

           abstract: for creating
           */










    }
}
