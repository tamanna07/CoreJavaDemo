package tutoring_encapsulation;

public class VehicleDatabase
{
    public static void main(String[] args)
    {
        String welcomeMsg = "--WELCOME TO WESTSIDE AUTOS--";
        System.out.println(welcomeMsg);

        System.out.println("Vehicle 1: ");
        Vehicle vehicle1Info = new Vehicle("Mercedes","S550",2019,"White");
        System.out.println("BRAND: "+vehicle1Info.getVehicleBrand());
        System.out.println("MODEL: "+vehicle1Info.getVehicleModel());
        System.out.println("YEAR: "+vehicle1Info.getVehicleYear());
        System.out.println("COLOR: "+vehicle1Info.getVehicleColor());

        System.out.println("");

        System.out.println("Vehicle 2: ");
        Vehicle vehicle2Info = new Vehicle("BMW","M5",2018,"Black");
        System.out.println("BRAND: "+vehicle2Info.getVehicleBrand());
        vehicle2Info.setVehicleModel("M4");
        System.out.println("MODEL: "+vehicle2Info.getVehicleModel());
        vehicle2Info.setVehicleYear(2020);
        System.out.println("YEAR: "+vehicle2Info.getVehicleYear());
        System.out.println("COLOR: "+vehicle2Info.getVehicleColor());

    }
}
