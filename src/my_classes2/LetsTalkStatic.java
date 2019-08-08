package my_classes2;

public class LetsTalkStatic
{
    String landName;           //instance variable declared

    protected void landOwner(String landName)
    {
        this.landName = landName;
        System.out.println(landName);
    }

     static int landSize;

    public static void landSpace(int landSize)
    {
        LetsTalkStatic.landSize = landSize;
        System.out.println(landSize);
    }


    public static void thikana(String address)
    {

        System.out.println(address);
    }

    public static int addCalculator(int num1, int num2)
    {
        return num2 + num1;
    }
}
