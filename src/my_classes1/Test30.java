package my_classes1;

public class Test30
{
    protected void demo1()
    {
        String[] list = new String[3];

        list[0] = "Post malone";
        list[1] = "Travis Scott";
        list[2] = "DJ khaled";

        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);

    }

    protected void demo2()
    {
        String[] list = new String[3];

        list[0] = "Post malone";
        list[1] = "Travis Scott";
        list[2] = "DJ khaled";

        for (int x = 0; x < 3; x++)
        {
            System.out.println(list[x]);
        }

    }

    //********************************************************
    //********************************************************
    //********************************************************
    //********************************************************
    //********************************************************

    //diff class

    public static void main(String[] args)
    {
        Test30 execute1 = new Test30();
        execute1.demo1();

        System.out.println("***********");

        execute1.demo2();
    }



}
