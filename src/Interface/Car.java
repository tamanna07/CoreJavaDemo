package Interface;

public class Car implements Vehicle
{
    public String engine(){
        return "This is 4 cylinder car.";
    }

    public String brake(){
        return "This is hydraulic brake car";
    }

    public String transmission()
    {
        return "The car has automatic transmission";
    }

    public String wheel(){
        return "This is 4 wheel car.";
    }
}
