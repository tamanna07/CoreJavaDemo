package abstruct;

public class American extends Human
{

    @Override
    protected void vision()
    {
        System.out.println("I have the eyes of an eagle");
    }

    @Override
    protected String speak()
    {
        return "I'm Billy and I'm from New York.";
    }

    @Override
    protected void walk()
    {
        System.out.println("I'm walking and i'm wearing a nike sneaker");
    }
}
