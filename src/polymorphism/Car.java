package polymorphism;

public class Car extends Vehicle
{
    @Override
    public void engine()
    {
        System.out.println("This car have v8 engine");
    }

    public void gas(String type1, String type2, String type3)
    {
        System.out.println("This car takes "+type1+","+type2+" and "+type3+" gas.");
    }
}
