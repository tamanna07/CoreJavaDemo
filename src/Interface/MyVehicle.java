package Interface;

public class MyVehicle
{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Truck truck = new Truck();

        System.out.println(car.brake());
        System.out.println(truck.brake());
    }
}
