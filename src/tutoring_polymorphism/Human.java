package tutoring_polymorphism;

public class Human
{
    /*
    Suppose if you are in class room that time you behave like a student, when you are
    in market at that time you behave like a customer, when you at your home at that time
    you behave like a son or daughter, Here one person present in different-different behaviors.
     */

    public void behavior(String behave)
    {
        System.out.println(behave);
    }

    public void behavior(String behave, String address)
    {
        System.out.print(behave);
        System.out.println(address);
    }

    public void behavior(String behave, String address, boolean isSon)
    {
        System.out.println(address);
        System.out.println(behave);
        System.out.println(isSon);
    }

}
