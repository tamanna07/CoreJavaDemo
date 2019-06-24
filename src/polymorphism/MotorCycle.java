package polymorphism;

public class MotorCycle extends Vehicle
{
    @Override
    public void engine()
    {
        System.out.println("This MotorCycle have 2 cylinder engine");
    }

    public void gas(String type1,String type2)
    {
        System.out.println("this MotorCycle takes "+type1+" and "+type2+" gas.");
    }
}
