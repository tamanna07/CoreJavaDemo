package my_classes2;

import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        String name;
        int age;
        //Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);              //instantiate


        //Get the name
        System.out.println("What is your name? ");
        name = keyboard.nextLine();   //returns input

        /**
         * byte    keyboard.nextByte();
         * double  keyboard.nextDouble();
         * Float   keyboard.nextFloat();
         * int     keyboard.nextInt();
         * Long    keyboard.nextLong();
         * Short   keyboard.nextShort();
         *String   keyboard.nextLine();
         */


        //get the age
        System.out.println("What is your age? ");
        age = keyboard.nextInt();

    }

}
