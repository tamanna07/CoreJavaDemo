package my_classes1;

public class Tutotial1

                                    //Hello Class!
    /* Today I'll be showing you guys the basic tutorial of Java and how it works */

/* Let's start with figuring out what is JAVA?
    --- Well, Java is a programming language such as all other
    programming languages out there such as like php, python, c++, java script, etc.

   *REMEMBER: JAVA AND JAVA SCRIPT ARE TOTALLY DIFFERENT. THEY ARE NOT THE SAME.

 - All the code that is going to be written on java must be inside of a CLASS.

 - You will need a main() method to begin any type of code.

 - This is your first step: public class Tutorial

   *ALWAYS REMEMBER, THE CLASS NAME SHOULD ALWAYS START WITH AN UPPER CASE LETTER.

 - After that you will need a main method to start. So I decided to show you guys how to
 print something out from the output after running your codes.

                             * NOW LETS GET STARTED!
 */

{                                   // you will need this { to begin before the main method.

    public static void main(String[] args)      // this is your main method

    { // your codes will be inside of this bracket and when you end, you will close it with }.

        //lets start by printing HELLO EVERYONE, I'M JAVA!

        System.out.println("HELLO EVERYONE, I'M JAVA!");

        /* inside of "this quotation you will write what you
        want to print and end with the quotation again" */

        // everything looks good now lets run it!

        // and there you have it.
        // the system printed out "HELLO EVERYONE, I'M JAVA!" for you.

        /* SIDE NOTE: anytime you need to comment or leave a side node
        during you are writing your codes:
        -USE: // for single line comment
        -USE: /* for multiline comments.
        but make sure when you done you need to end it with */



        // On the next topic we will talk about data types, variables and values.


        /* Variables: variables are containers for storing the data values that
           are in the data type. you can name anything you want for the variable
           but it must not match with any class name or any data types or any keyword*/
        // ex: DataType nameOfTheVariable = value

        /*Note: JAVA IS A CASE SENSITIVE LANGUAGE TUTORIAL1 AND tutorial1
        have different meaning so we have to be careful with that.
         */


        /* Data types: there are two types of data types.
        1: Primitive data types
        2: Non-primitive data types

        Primitive data types:
        They are divided into 4 families.

        byte
        short         //These four types are used for whole numbers uses,
        int           each of them have different types of space to
        long          put numbers inside.

        float         // They used for decimal uses, each of them
        double        have different types of space to put numbers inside.

        char          //it used for characters uses, such as A, B, C, D, E, etc.

        boolean       //it used for declaring TRUE or FALSE uses.


        Non- Primitive data types:
        There are 3 types.

        String
        Arrays
        Classes

        // String is used for writing names and etc. There are lots of stuffs we can
        do with String, Arrays, Classes but we will get to that later on
        but now all you need to know that you can use String to write names or almost
        anything.


        --- Now lets do some practice:
    */

        String Name = "Imran Kabir";
        byte age = 34;
        short miles = 1000;
        int cars = 6;
        long money = 586578135;
        float height = 5.9f;  // float's value always should end with f at the end.
        double phoneVersion = 12.23d;  //double's value should end with d at the end.
        char examResult = 'A';  /* instead of double quotation like string value,
                                char value should always be inside of single quotation. */

        //now lets put them in order to run them

        System.out.println(Name);
            System.out.println(age);
                System.out.println(miles);
            System.out.println(cars);
        System.out.println(money);
            System.out.println(height);
                System.out.println(phoneVersion);
            System.out.println(examResult);
        System.out.println("This is so incredible!");

        // now lets run them and see how it looks.

        // now we discuss about java operators.

        /* java operators are used to perform operations on variables ands values */

        //


    }


}                               /* as shown on line 26 about {, you will need this }
                                      to end anything that you were working on. */
