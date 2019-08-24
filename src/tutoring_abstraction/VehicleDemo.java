package tutoring_abstraction;

public class VehicleDemo
{
    public static void main(String[] args)
    {
        String welcome = "--WELCOME TO TRAYWAY AUTOS--";
        String msg1 = "Vehicle -> 1 :";
        String msg2 = "Vehicle -> 2 :";
        String msg3 = "";

        System.out.println(welcome);                                            //welcome

        System.out.println(msg1);                                               //vehicle-1
        Vehicle v1 = new Vehicle1("Chevrolet","Camaro",2010);
        v1.engine("V10 supercharged");
        v1.transmission("auTomatic ".trim());
        String v1Sound = v1.soundSystem("Beats","standard");
        System.out.println(v1Sound);
        v1.navigation(true);


        System.out.println(msg3);                                               //space


        System.out.println(msg2);                                               //vehicle-2
        Vehicle v2 = new Vehicle1("Mustang","GT",2013);
        v2.engine("V8 turbo charged");
        v2.transmission("auTomatic".trim());
        String v2Sound = v2.soundSystem("Boose","premium");
        System.out.println(v2Sound);
        v1.navigation(true);
    }
}
