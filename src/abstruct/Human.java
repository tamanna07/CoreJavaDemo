package abstruct;

public abstract class Human
{
    protected abstract void vision();
    protected abstract String speak();
    protected abstract void walk();

    public void run()
    {
        System.out.println("I am running really fast...");
    }
}
