package my_classes;

public class VehicleBuild
{
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();
        Vehicle car3 = new Vehicle();
        Vehicle car4 = new Vehicle();


        // lets build car 1
        car1.brand = "Lexus";
        car1.color = "White";
        car1.fuelType = "Gasoline";
        car1.seat = "5";
        car1.tireSize = "17 inch";


        // now lets build car 2
        car2.brand = "Acura";
        car2.color = "Black";
        car2.fuelType = "Gasoline";
        car2.seat = "5";
        car2.tireSize = "19 inch";


        // now lets build car 3
        car3.brand = "Jeep";
        car3.color = "Gray";
        car3.fuelType = "Disel";
        car3.seat = "7";
        car3.tireSize = "20 inch";

        // now lets build car 4
        car4.brand = "Infiniti";
        car4.color = "Charcoal";
        car4.fuelType = "Hybrid";
        car4.seat = "5";
        car4.tireSize = "18 inch";


        //car1
        System.out.println("Model: "+car1.brand);
        System.out.println("Color: "+car1.color);
        System.out.println("Fuel type: "+car1.fuelType);
        System.out.println("Seating Capacity: "+car1.seat);
        System.out.println("Tire Size: "+car1.tireSize);
        System.out.print("Message: ");
        car1.message();

        System.out.println("******************************");

        //car2
        System.out.println("Model: "+car2.brand);
        System.out.println("Color: "+car2.color);
        System.out.println("Fuel type: "+car2.fuelType);
        System.out.println("Seating Capacity: "+car2.seat);
        System.out.println("Tire Size: "+car2.tireSize);
        System.out.print("Message: ");
        car2.message();

        System.out.println("*******************************");

        //car3
        System.out.println("Model: "+car3.brand);
        System.out.println("Color: "+car3.color);
        System.out.println("Fuel type: "+car3.fuelType);
        System.out.println("Seating Capacity: "+car3.seat);
        System.out.println("Tire Size: "+car3.tireSize);
        System.out.print("Message: ");
        car3.message();

        System.out.println("********************************");

        //car4
        System.out.println("Model: "+car4.brand);
        System.out.println("Color: "+car4.color);
        System.out.println("Fuel type: "+car4.fuelType);
        System.out.println("Seating Capacity: "+car4.seat);
        System.out.println("Tire Size: "+car4.tireSize);
        System.out.print("Message: ");
        car4.message();
    }
}
