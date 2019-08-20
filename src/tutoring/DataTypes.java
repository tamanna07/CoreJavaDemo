package tutoring;

public class DataTypes
{
    public static void main(String[] args)
    {
        /*
        Modifiers/Specifier
            Access Modifiers: default, public, private, protected
            Non-Access Modifiers: static, final, abstract, synchronized, volatile.

        Data types:
            Primitive Data types: byte, short, int, long, float, double, boolean, char
            Non-Primitive Data types: String, Classes, Interface, Arrays
        */

        String name = "Raihan";
        byte extension = 121;       //integer type
        short id = 4253;            //integer type
        int age = 100;              //integer type
        long phnNum = 311377653;    //integer type
        float height = 5.9f;        //floating-point number type
        double salary = 95000.00;   //floating-point number type
        boolean isMale = true;      //boolean type
        char initial = 'R';         //character type

        //print all the variable values with concatenation
        System.out.println("Name: "+name);
        System.out.println("Extension: "+extension);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
        System.out.println("Phone Number: "+phnNum);
        System.out.println("Height: "+height);
        System.out.println("Salary: "+salary);
        System.out.println("Male: "+isMale);
        System.out.println("Initial: "+initial);

        //Show the works of length, uppercase, lowerCase, index, charAt, trim:
        String msg1 = "The tutoring is going well";
        String msg2 = "WElCome tO ClaSs eveRyOne";
        String msg3 = "This topic is about java String";
        String msg4 = "     Read 5 chapters of the java book   ";

        int length = msg1.length();
        System.out.println("Find the length of msg1: "+length);

        int indexChar = msg1.indexOf('g');
        System.out.println("Find the number of a character in msg1: "+indexChar);

        int indexString = msg1.indexOf("well");
        System.out.println("Find the number of a String in msg1: "+indexString);

        char charAt = msg1.charAt(1);
        System.out.println("Find the character of an index in msg1: "+charAt);

        String upperCase = msg2.toUpperCase();
        System.out.println("Make it all UpperCase in msg2: "+upperCase);

        String lowerCase = msg3.toLowerCase();
        System.out.println("Make it all LowerCase in msg3: "+lowerCase);

        String trim = msg4.trim();
        System.out.println("Cut any unnecessary gaps in msg4: "+trim);







    }
}
