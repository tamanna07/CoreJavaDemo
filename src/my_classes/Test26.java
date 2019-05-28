package my_classes;

public class Test26 {

    protected void mthd1()
    {
        String[] cars = new String[5];

        cars[0] = "Toyota";
        cars[1] = "Honda";
        cars[2] = "Lexus";
        cars[3] = "Acura";
        cars[4] = "BMW";

        for (int c = 0; c < cars.length; c++)
        {
            System.out.println(cars[c]);
        }
    }

    protected String mthd2()
    {
        System.out.println("************************************");
        String[] equipment = new String[5];

        equipment[0] = "Table";
        equipment[1] = "Chair";
        equipment[2] = "Pipe";
        equipment[3] = "Hammer";
        equipment[4] = "Nails";


        for (int i = 0; i < equipment.length; i++){
            System.out.println(equipment[i]);
        }

        return "";
    }

    protected String mthd3(String param1,String param2, String param3, String param4,
                           String param5)
    {
        System.out.println("************************************");
        String[] equipment = new String[5];

        equipment[0] = param1;
        equipment[1] = param2;
        equipment[2] = param3;
        equipment[3] = param4;
        equipment[4] = param5;


        for (int i = 0; i < equipment.length; i++){
            System.out.println(equipment[i]);
        }

        return "";
    }

//********************************************************************************************************
//********************************************************************************************************
//********************************************************************************************************


    public static void main(String[] args) {
        Test26 execute1 = new Test26();

        execute1.mthd1();

        Test26 execute2 = new Test26();

        //String container1 = execute2.mthd2();
        //System.out.println(container1);

        System.out.println(execute1.mthd2());

        System.out.println(execute1.mthd3("White Board","Bottle", "Pipe","Hammer", "Nails"));

    }
}
