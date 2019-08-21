package tutoring;

public class TestCar
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.brand("Mercedes");
        Car model = new Car("s550");
        car1.engine();
        String gas = car1.gas();
        System.out.println(gas);
        Car.turnOnCar();
        String off = Car.turnOffCar("TURNING OFF");
        System.out.println(off);

        /*
        Make phone class with can have speaker, display, a shape of a rectangle, and also have
        a artificial intelligence feature that speak and also can do basic math such as addition, subtraction
        multiplication, and division. Also the when u turn the phone on, it should say a greeting with the name of
        the phone owner.
         */


    }
}
