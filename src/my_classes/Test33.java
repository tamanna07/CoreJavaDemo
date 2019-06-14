package my_classes;

public class Test33
{

    String shampoo = "axe";

    protected void demo1()
    {
        if (shampoo.equalsIgnoreCase("Head and shoulders"))
        {
            System.out.println("This is Head and Shoulders");
        }else if (shampoo.equalsIgnoreCase("Garnere"))
        {
            System.out.println("This is Garnere");
        }else
            {
                System.out.println("wrong input");
            }
    }

    private String demo2()
    {
        if (shampoo.equalsIgnoreCase("Head and shoulders"))
        {
            System.out.println("this is head and shoulders");
        }else if (shampoo.equalsIgnoreCase("Garnere"))
        {
            System.out.println("This is Garenre");
        }else
            {
                System.out.println("wrong input");
            }
        return "";
    }

    //*******************************************************************
    //*******************************************************************
    //*******************************************************************

    public static void main(String[] args)
    {
        Test33 execute1 = new Test33();

        System.out.print("1st demo: ");
        execute1.demo1();
        System.out.println("*******");
        System.out.print("2nd demo: ");
        execute1.demo2();
    }

}
