package tutoring;

public class Car
{
    public void engine()                                //void method without parameter
    {
        System.out.println("The car has V8 engine");
    }

    public String gas()                                 //return method without parameter
    {
        String type = "type: ";
        return type+"This car takes 93 grade gasoline";
    }

    public String brandName;
    public void brand(String brandName)                 //void method with parameter
    {
        this.brandName = brandName;
        System.out.println(brandName);
    }

    public static void turnOnCar()                      //static void method without parameter
    {
        System.out.println("Turning on");
    }

    static String button;
    public static String turnOffCar(String button)      //static return type method with parameter
    {
        Car.button = button;
        return button;
    }

    public Car ()                                       //default constructor
    {
        System.out.println("car building is in progress");
    }

    public Car(String modelName)                        //constructor with parameter
    {
        System.out.println(modelName);
    }




}
