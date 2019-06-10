package Interface;

public class Truck implements Vehicle
{
    public String engine(){
        return "This is V8 engine truck.";
    }

    public String brake(){
        return "The truck has 6 hydraulic brakes.";
    }

    public String transmission()
    {
        return "The Truck has automatic transmission";
    }

    public String wheel(){
        return "The truck has 18 wheels.";
    }
}
