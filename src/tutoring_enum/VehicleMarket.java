package tutoring_enum;

import java.util.Scanner;

public class VehicleMarket
{
    public static void main(String[] args) throws InterruptedException {
        /*
        PLEASE CHOOSE ONE OF THE PRICE RANGE OPTIONS DOWN
        BELOW TO FIND THE VEHICLES WITHIN THAT PRICE RANGE.
         */
//<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>
        /*
        RANGE 1: $20000 to $40000.00
        RANGE 2: $41000 to $65000.00
        RANGE 3: $66000 to $125000.00
        RANGE 4: $126000 to $500000.00
         */
/*<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>>>>>>
 */



        //messages
        String welcome = "--WELCOME TO THE AUTO SHOW CENTER--";
        String msg1 = "As mentioned in our range options above, Please enter your price range here to find your vehicles: ";
        String declined = "Invalid Entry!! There are no vehicles in the database within that price range";
        String msg2 = "Starting price: $";
        String msg3 = "Ending price: $";

        //show up in console before user input
        Thread.sleep(1000);
        System.out.println(welcome);
        Thread.sleep(4000);
        System.out.println(msg1);
        Thread.sleep(7000);
        System.out.print(msg2);

        Scanner startingRange = new Scanner(System.in);
        Scanner endingRange = new Scanner(System.in);

        double startingPrice = startingRange.nextDouble();
        System.out.print(msg3);
        double endingPrice = endingRange.nextDouble();

        //conditions of price ranges
        if (startingPrice >= 20000.00 && endingPrice <= 40000.00)
        {
            Thread.sleep(1000);
            System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.TOYOTA.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.TOYOTA.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.TOYOTA.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.TOYOTA.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.TOYOTA.getVehiclePrice());

            Thread.sleep(1000);
            System.out.print("\nVehicle_2:"+"\nMake: "+Vehicle.HONDA.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.HONDA.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.HONDA.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.HONDA.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.HONDA.getVehiclePrice());
        }else if (startingPrice >= 41000.00 && endingPrice <= 65000.00)
        {
            Thread.sleep(1000);
            System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.ACURA.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.ACURA.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.ACURA.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.ACURA.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.ACURA.getVehiclePrice());

            Thread.sleep(1000);
            System.out.print("\nVehicle_2:"+"\nMake: "+Vehicle.CORVETTE.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.CORVETTE.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.CORVETTE.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.CORVETTE.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.CORVETTE.getVehiclePrice());
        }else if (startingPrice >= 66000.00 && endingPrice <= 125000.00)
        {
            Thread.sleep(1000);
            System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.MERCEDES_BENZ.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.MERCEDES_BENZ.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.MERCEDES_BENZ.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.MERCEDES_BENZ.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.MERCEDES_BENZ.getVehiclePrice());

            Thread.sleep(1000);
            System.out.print("\nVehicle_2:"+"\nMake: "+Vehicle.BMW.getVehicleMake()+" || ");
            System.out.print("Model: "+Vehicle.BMW.getVehicleModel()+" || ");
            System.out.print("Year: "+Vehicle.BMW.getVehicleYear()+" || ");
            System.out.print("Color: "+Vehicle.BMW.getVehicleColor()+" || ");
            System.out.println("Price: "+'$'+Vehicle.BMW.getVehiclePrice());
        }else if (startingPrice >= 126000.00 && endingPrice <= 500000.00)
            {
                Thread.sleep(1000);
                System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.LAMBORGHINI.getVehicleMake()+" || ");
                System.out.print("Model: "+Vehicle.LAMBORGHINI.getVehicleModel()+" || ");
                System.out.print("Year: "+Vehicle.LAMBORGHINI.getVehicleYear()+" || ");
                System.out.print("Color: "+Vehicle.LAMBORGHINI.getVehicleColor()+" || ");
                System.out.println("Price: "+'$'+Vehicle.LAMBORGHINI.getVehiclePrice());
            }else
                {
                    Thread.sleep(1000);
                    System.out.println(declined);
                }




    }
}
