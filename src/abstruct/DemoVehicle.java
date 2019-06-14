package abstruct;

public class DemoVehicle
{
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        car.engine();
        truck.engine();

        car.myNewMethod();
    }
}
