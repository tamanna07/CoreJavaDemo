package tutoring_singletonClass;

public class Car
{
    private String makeCar;
    private String modelCar;

    private Car()
    {
        this.makeCar = "Mercedes";
        this.modelCar = "S550";
    }

    private static Car obj = new Car();


    public static Car getInstance()
    {
        System.out.println("HELLO THIS IS GET INSTANCE");
        return obj;
    }

    public void doSomething()
    {
        System.out.println("Activating Launch Control");
    }

}
