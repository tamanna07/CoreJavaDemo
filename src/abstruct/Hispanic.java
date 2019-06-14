package abstruct;

public class Hispanic extends Human
{

    @Override
    protected void vision()
    {
        System.out.println("I have night vision eyes");
    }

    @Override
    protected String speak()
    {
        return "This is Antonio and I am from dominican republic";
    }

    @Override
    protected void walk()
    {
        System.out.println("I am walking but i'm injured by playing soccer");
    }
}
