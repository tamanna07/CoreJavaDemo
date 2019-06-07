package my_classes;

public class Test28
{
    public static void main(String[] args)
    {
        String heading = "Practice";
        byte q = 10;
        short w = 200;
        int e = 1200;
        long l = 250000;
        float f = 12.20f;
        double d = 123.21d;
        boolean b = 1 < 10;

        //**********************

        q += 2;
        w -= 3;
        l *= 2;
        e /= 3;
        int a = 4 % 3;

        System.out.println(q);
        System.out.println(w);
        System.out.println(l);
        System.out.println(e);
        System.out.println(a);
        System.out.println(heading);

        // **************************

        String msg1 = "This is the world of java";
        String msg2 = "We the BEst Music";

        System.out.println(msg1.length());
        System.out.println(msg2.indexOf("Music"));
        System.out.println(msg1.indexOf('w'));
        System.out.println(msg2.toUpperCase());
        System.out.println(msg1.toLowerCase());

        //***************************

        String name = "Mohammed Raihan";
        System.out.println("Name: "+name+" Kabir");     //concatenation


        //****************************************

        int bag = 20;

        System.out.println(bag <100);
        System.out.println(bag > 100);
        System.out.println(bag >= 100);
        System.out.println(bag <= 100);
        System.out.println(bag != 100);
        System.out.println(bag == 100);

        //******************************************

        String phone = "iPhone";

        if (phone.equalsIgnoreCase("iPhone"))
        {
            System.out.println("This is iPhone");
        }else if (phone.equalsIgnoreCase("Android"))
        {
            System.out.println("This is Android");
        }else if (phone.equalsIgnoreCase("Nokia"))
        {
            System.out.println("This is Nokia");
        }else
            {
                System.out.println("wrong input, sorry");
            }

        //**************************************************






    }
}
