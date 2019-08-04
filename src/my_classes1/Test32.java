package my_classes1;

public class Test32
{
    protected String waters(String brand1, String brand2, String brand3)
    {
        String[] brands = new String[3];

        brands[0] = brand1;
        brands[1] = brand2;
        brands[2] = brand3;

        for (int b = 0; b < brands.length; b++)
        {
            System.out.println(brands[b]);
        }return "";

    }


//    ************************

    public static void main(String[] args)
    {
        Test32 execute = new Test32();
        execute.waters("Aquafina","Aquafina","Poland Spring");
    }
}
