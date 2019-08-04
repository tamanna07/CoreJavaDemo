package my_classes2;

public class MakeVehicle
{
    public static void main(String[] args)
    {
        Vehicle mercedes = new Vehicle(2018,"Mercedes Benz","s500");

       int mercedesYear = mercedes.getYear();
        System.out.print(mercedesYear);
       String mercedesBrand = mercedes.getBrand();
        System.out.print(' '+mercedesBrand);
        mercedes.setModel("AMG S550");
        System.out.println(mercedes.getModel());

    }
}
