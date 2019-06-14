package abstruct;

public class Truck extends Vehicle
{

    @Override
    public void engine() {
        System.out.println("The truck has 8 cylinder.");
    }

    @Override
    public void wheel() {
        System.out.println("The truck has 10 wheels.");
    }
}
