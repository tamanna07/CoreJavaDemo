package my_classes1;

public class Practice2
{
    String name = null;
    int age = 0;
    String country = null;

    protected void speak()
    {
        System.out.println("Hi, my name is: "+name+'.');
        System.out.println("I'm "+age+" years old.");
        System.out.println("I'm originally from: "+ country+'.');
    }

    protected int doAddMath(int add1, int add2)
    {
        return add1+add2;
    }

    protected void fullName(String frstName, String lstName)
    {
        System.out.println("FULL NAME: "+frstName+' '+lstName+'.');
    }



    //constructor
    Practice2()
    {
        String[] waters = new String[3];
        waters[0] = "POLAND SPRING";
        waters[1] = "AQUAFINA";
        waters[2] = "DEER PARK";

        System.out.println("**************");
        System.out.println("constructor from a different class:");

        for (int w = 0; w < waters.length; w++)
        {
            System.out.println(waters[w]);
        }
    }
}
