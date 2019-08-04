package my_classes1;

public class Test27 {

    protected void waterNames1()
    {
        String[] waters = new String[3];

        waters[0] = "Aquafina";
        waters[1] = "Poland Spring";
        waters[2] = "Deer Park";


        System.out.println(waters[0]);
        System.out.println(waters[1]);
        System.out.println(waters[2]);
    }

    //*************************************************
    //*************************************************

    protected void waterNames2()
    {
        String[] waters = new String[3];

        waters[0] = "Aquafina";
        waters[1] = "Smart";
        waters[2] = "Voss";

        for (int w2 = 0; w2 < waters.length; w2++)
        {
            System.out.println(waters[w2]);
        }
    }

    //*************************************************
    //*************************************************

    protected String gasbrands()
    {
        String[] brands = new String[3];

        brands[0] = "Shell";
        brands[1] = "Mobil";
        brands[2] = "Speedway";

        for (int g = 0; g < brands.length; g++)
        {
            System.out.println(brands[g]);
        }
        return "";
    }

    //*************************************************
    //*************************************************

    protected String carBrands(String model1, String model2, String model3)
    {
        String [] brands = new String[3];

        brands[0] = model1;
        brands[1] = model2;
        brands[2] = model3;

        for (int b = 0; b < brands.length; b ++)
        {
            System.out.println(brands[b]);
        }
        return "";
    }











//*****************************************************************************************************************
//*****************************************************************************************************************
//*****************************************************************************************************************
//*****************************************************************************************************************
//*****************************************************************************************************************


    public static void main(String[] args) {

        Test27 execute1 = new Test27();

        execute1.waterNames1();

        System.out.println("***********************************");

        execute1.waterNames2();

        System.out.println("***********************************");

        execute1.gasbrands();

        System.out.println("***********************************");

        execute1.carBrands("Mercedes", "Ferrari", "Lamborghini");





    }
}
