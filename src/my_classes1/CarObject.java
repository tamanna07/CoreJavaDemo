package my_classes1;

public class CarObject
{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();


        car1.brand = "BMW";
        car2.brand = "Mercedes";
        car3.brand = "Audi";

        car1.color = "White";
        car2.color = "Black";
        car3.color = "Silver";

        car1.config = "Auto";
        car2.config = "Manual";
        car3.config = "Auto";

        String car1Act = car1.activity();
        String car2Act = car2.activity();
        String car3Act = car3.activity();


        System.out.println("Model: "+ car1.brand);
        System.out.println("Color: "+car1.color);
        System.out.println("Configuration: "+car1.config);
        System.out.println("Activity: "+car1Act);


        System.out.println("*****************");


        System.out.println("Model: "+ car3.brand);
        System.out.println("Color: "+car3.color);
        System.out.println("Configuration: "+car2Act);
        car2.activity();

        System.out.println("****************");

        System.out.println("Model: "+ car2.brand);
        System.out.println("Color: "+car2.color);
        System.out.println("Configuration: "+car2.config);
        System.out.print("Activity: "+ car3Act);
    }
}
