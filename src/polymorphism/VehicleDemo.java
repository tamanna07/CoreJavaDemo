package polymorphism;

public class VehicleDemo
{
    public static void main(String[] args)
    {
        MotorCycle execute1 = new MotorCycle();
        Car execute2 = new Car();

        execute1.engine();
        System.out.println("**********************");
        execute2.engine();
        System.out.println("**********************");
        execute1.gas("83 grade","87 grade");
        System.out.println("**********************");
        execute2.gas("83 grade","87 grade","93 grade");
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");

        Vehicle[] execute3 = new Vehicle[2];

        execute3[0] = new MotorCycle();
        execute3[1] = new Car();

        for (int e = 0; e < execute3.length; e++)
        {
            execute3[e].engine();
            execute3[e].gas("87grade","83 grade");
            execute3[e].gas("87","83,","93");

            Human cc = new Human();
             cc.activity("PIZZA","COKE");

        }

    }
}
