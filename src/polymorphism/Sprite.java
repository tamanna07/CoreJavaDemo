package polymorphism;

public class Sprite extends CanSoda
{
    @Override
    public void color()
    {
        System.out.println("Green Steel default color with Sprite design");
    }

    public Sprite()
    {
        System.out.println("PRODUCED BY PITBULL");
    }
}
