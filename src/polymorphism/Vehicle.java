package polymorphism;

public class Vehicle
{
    void engine()
    {
        System.out.println("This vehicle have engine");
    }

    void gas(String type1,String type2)
    {
        System.out.println(type1+""+type2);
    }

    void gas(String type1, String type2, String type3)
    {
        System.out.println(type1+""+type2+""+type3);
    }
}
