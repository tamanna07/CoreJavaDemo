package tutoring_encapsulation;

public class Vehicle
{
    /*
    Make a list of vehicle brands, models, years, and colors that can only be added and edited anytime
    if needed on the Vehicle Database. Make sure those data are private on concrete class but also
    can access them from the Main class.
     */

    private String vehicleBrand;
    private String vehicleModel;
    private int vehicleYear;
    private String vehicleColor;


    public Vehicle()
    {

    }

    public Vehicle(String vehicleBrand, String vehicleModel, int vehicleYear, String vehicleColor)
    {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleBrand()
    {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand)
    {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel()
    {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleYear()
    {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear)
    {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleColor()
    {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }
}
