package my_classes2;

public class SwitchCase
{
    public static void main(String[] args) {
        String name = "Raihan";

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
        }
        System.out.println(salary);

    }
}
