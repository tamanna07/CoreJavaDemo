package tutoringTrycatch;

import javax.crypto.spec.PSource;

public class UseTryCatch
{
    //Java has categorised exception in Checked Exception and Unchecked
    //RunTimeException is an unchecked exception.
    public static void main(String[] args)
    {
        try {
                String[] locations = new String[3];
                Thread.sleep(5000);

                locations[0] = "NY";
                locations[1] = "NJ";
                locations[2] = "PA";

            System.out.println(20/2);





                System.out.println("location: "+locations[3]);
        }catch (Exception ex)   //catch (ArithmeticException | ArrayIndexOutOfBoundsException e) example of multiple exceptions in one catch
        {
            System.out.println("Sorry! couldn't find location");
        }//catch (ArithmeticException ex)                           can also be used for multiple custom exceptions
        //{
           // System.out.println("Sorry you can't divide 20 by 0");
        //}




        try {
            String[] locations = new String[3];

            locations[0] = "NY";
            locations[1] = "NJ";
            locations[2] = "PA";

            System.out.println(20/0);





            System.out.println("location: "+locations[3]);
    }catch (ArithmeticException ex)
        {
            System.out.println("Unknown location");
        }finally {
            System.out.println("you made it!");
        }

        System.out.println("yo wasssup");

        try
        {
            UseTryCatch obj = new UseTryCatch();

        obj.nullEx(null);
        }catch (NullPointerException ex)
        {
            System.out.println("wrong value for nullEx");
        }finally {
            System.out.println("it works");
        }

    }


    public void nullEx(String s)            //NullpointException is a runtime exception
    {
        System.out.println(s.toLowerCase());
    }




}
