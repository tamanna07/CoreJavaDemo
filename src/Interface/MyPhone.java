package Interface;

public class MyPhone
{
    public static void main(String[] args)
    {
        Android execute = new Android();

        System.out.println(execute.chargingPort());
        System.out.println(execute.speaker());
        execute.display();
        int result  = execute.calculatorAdd(2,4);
        System.out.println(result);
        System.out.println(execute.names("Imran", "Kabir"));

    }
}
