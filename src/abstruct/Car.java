package abstruct;

public class Car extends Vehicle
{

    @Override
    public void engine() {
        System.out.println("Car has 4 cylinder engine.");
    }

    @Override
    public void wheel() {
        System.out.println("Car has 4 wheel drive.");
    }


}
