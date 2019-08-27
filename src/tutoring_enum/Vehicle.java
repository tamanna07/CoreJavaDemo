package tutoring_enum;

public enum Vehicle
{
    /*
    LIST THE VEHICLE NAMES THAT WE SHOULD DELIVER TO THE MARKET. PUT THEIR MAKE, MODEL, YEAR, COLOR AND PRICE IN THE
    LIST WHERE IT CANNOT BE CHANGED IN ANY CIRCUMSTANCE. THEN IN MARKET MAKE CONDITIONAL STATEMENT WHERE PEOPLE CAN
    SEARCH THE VEHICLE THEY LIKE BY ENTERING A PRICE RANGE BETWEEN $20,000.00 TO $500,000.00.
     */

    TOYOTA("TOYOTA", "CAMRY",2019, "WHITE",22999.99),
    HONDA("HONDA", "PILOT", 2018, "WINE RED", 34999.99),
    ACURA("ACURA", "TLX", 2019,"WHITE", 42999.99),
    CORVETTE("CORVETTE", "C8", 2020, "RED", 62999.99),
    MERCEDES_BENZ("MERCEDES", "E300", 2019, "BLACK", 68999.99),
    BMW("BMW", "M6", 2020, "GOLD", 120999.99),
    LAMBORGHINI("LAMBORGHINI", "AVENTEDOR S", 2019, "SPACE GRAY", 417826.99);

    private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;
    private String vehicleColor;
    private double vehiclePrice;


     Vehicle (String vehicleMake, String vehicleModel, int vehicleYear, String vehicleColor, double vehiclePrice)
    {
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleColor = vehicleColor;
        this.vehiclePrice = vehiclePrice;
    }


    public String getVehicleMake()
    {
        return this.vehicleMake;
    }

    public String getVehicleModel()
    {
        return this.vehicleModel;
    }

    public int getVehicleYear()
    {
        return this.vehicleYear;
    }

    public String getVehicleColor()
    {
        return this.vehicleColor;
    }

    public double getVehiclePrice()
    {
        return this.vehiclePrice;
    }



}
