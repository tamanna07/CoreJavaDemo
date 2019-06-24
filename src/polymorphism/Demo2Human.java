package polymorphism;

public class Demo2Human extends Human
{
    String name = "Rahee";

    @Override
    void activity(String eat, String drink)
    {
        System.out.println(eat+" "+drink);
    }

    void activity(String run, String standUp,String sitDown)
    {
        System.out.println(run+" "+standUp+" and "+sitDown);

    }
}
