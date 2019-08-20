package my_classes2;

import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
//        String name;
//        int age;
//        //Create a Scanner object to read input.
//        Scanner keyboard = new Scanner(System.in);              //instantiate
//
//
//        //Get the name
//        System.out.println("What is your name? ");
//        name = keyboard.nextLine();   //returns input
//
//        /**
//         * NOTE:
//         * byte    keyboard.nextByte();
//         * double  keyboard.nextDouble();
//         * Float   keyboard.nextFloat();
//         * int     keyboard.nextInt();
//         * Long    keyboard.nextLong();
//         * Short   keyboard.nextShort();
//         *String   keyboard.nextLine();
//         */
//
//
//        //get the age
//        System.out.println("What is your age? ");
//        age = keyboard.nextInt();

        System.out.println("To access the banking system please enter the password");
        Scanner obj = new Scanner(System.in);
        obj.nextInt();

        System.out.println("WELCOME!!");

        System.out.println("add income and bonuses");

        System.out.print("income: ");

        int num1 = obj.nextInt();

        System.out.print("bonus: ");
        int num2 = obj.nextInt();

        int result = num1 + num2;

        obj.close();

        System.out.println("THE TOTAL IS: "+ result);

    }

}
