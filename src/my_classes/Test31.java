package my_classes;

public class Test31
{
    protected void run()
    {
      String [] phone = new String[4];

      phone[0] = "iPhone";
      phone[1] = "Android";
      phone[2] = "Nokia";
      phone[3] = "Sony";

      for (int x = 0; x < phone.length; x++)
      {
          System.out.println(phone[x]);
      }
    }

    //********************************************

    protected String phones(String model1, String model2, String model3)
    {
        String[] brands = new String[3];

        brands [0] = model1;
        brands [1] = model2;
        brands [2] = model3;

        for (int c = 0; c < brands.length; c++)
        {
            System.out.println(brands[c]);
        }return "";
    }

    //********************************************

    public String waters()
    {
        String [] waterBrands = new String[3];

        waterBrands[0] = "Aquafina";
        waterBrands[1] = "Poland Spring";
        waterBrands[2] = "Fiji";

        for (int v = 0; v < waterBrands.length; v++)
        {
            System.out.println(waterBrands[v]);
        }return "";
    }


    //*******************************************
    //*******************************************
    //*******************************************
    //*******************************************


    //execute

    public static void main(String[] args)
    {
        Test31 execute1 = new Test31();

        execute1.run();
        System.out.println("*************************");
        execute1.phones("iPhone", "Android", "Nokia");
        System.out.println("*************************");
        execute1.waters();
    }
}
