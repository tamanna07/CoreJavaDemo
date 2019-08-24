package tutoring_abstraction;

public abstract class Vehicle
{
    /*
    Make two brands of vehicles "Chevrolet" and "Mustang" that meets the features like engine, transmission, and
    soundSystem. For each cars the feature's type can be different. But one feature "navigation" has been implemented on
    the list that must have to be in all model vehicles. Make sure to provide Make, Model, and Year of the car that you
    work on.
     */

    public String makeVehicle;
    public String modelVehicle;
    public int yearVehicle;

    public abstract void engine(String size);

    public abstract void transmission(String type);

    public abstract String soundSystem(String brand, String type);

    public void navigation(boolean navigationMode) {
        String msgTrue = "This car comes with a fully functional navigation system that " +
                         "also includes an artificial intelligence. READY FOR A COMMAND...";

        String msgFalse = "Sorry! this function doesn't come with this vehicle.";

        if (navigationMode != false) {
            System.out.println(msgTrue);
        }else {
            System.out.println(msgFalse);
            }
    }
}
