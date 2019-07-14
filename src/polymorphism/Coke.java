package polymorphism;

public class Coke extends CanSoda
{
    @Override
    public void color()
    {
        System.out.println("Red Steel default color with Coke design");
    }

    public Coke()
    {
        System.out.println("PRODUCED BY JOHNNY");
    }
}
