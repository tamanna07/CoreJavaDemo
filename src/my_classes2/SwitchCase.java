package my_classes2;

public class SwitchCase
{
    public static void main(String[] args) {
        String name = "Sifath";

        double salary;

        switch (name){
            case "Rifath":
                 salary = 120833.00;
            case "Raihan":
                 salary = 168918.98;
                 break;
            case "Sifath":
                 salary =187399.09;
                 break;
            default:
                salary = 00.0;
                break;
        }
        System.out.println(salary);

        //--------------------------------------------------------------------------------------------------------------

        int age = 25;

        switch (age) {
            case 2:
                System.out.println("Johnny, Jackie, tudor");
                break;
            case 18:
                System.out.println("Fresh, Danny, Nick");
                break;
            case 25:
                System.out.println("Wayne, 21 Savage, Lauren");
                break;
            default:
                System.out.println("Unknown input");
                break;
        }
                //-----------------------------------------------------------------------



                String location = "PHOENIX";

                String employeeName;

                switch (location)
                {
                    case "LOS ANGELES":
                        employeeName = "Brad";
                        break;
                    case "PHOENIX":
                        employeeName = "Jamie";
                        break;
                    case "MIAMI":
                        employeeName = "Dewayne";
                        break;
                    default:
                        employeeName = "Sorry! No employees are from this location";
                        break;
                }
                System.out.println(employeeName);
































    }
}
