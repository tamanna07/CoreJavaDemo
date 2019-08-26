package tutoringTrycatch;

public class ExceptionHandlingUsingThrows
{
    public static void main(String[] args)throws ArithmeticException, ArrayIndexOutOfBoundsException
    {
        String[] locations = new String[3];

        locations[0] = "NY";
        locations[1] = "NJ";
        locations[2] = "PA";

        System.out.println(20/2);
        //Thread.sleep(5000);                //ex: compile time error.
        // Thread.sleep(); to pause the program for an amount of time chosen
        System.out.println("location: "+locations[2]);

        ExceptionHandlingUsingThrows obj = new ExceptionHandlingUsingThrows();

    }

}
