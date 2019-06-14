package abstruct;

public abstract class Phone
{
    protected abstract void speaker();
    protected abstract void display();
    protected abstract void cellularNet();
    public void chargingPort()
    {
        System.out.println("This phone have charging port");
    }
}
