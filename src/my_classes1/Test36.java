package my_classes1;

public class Test36 extends Test35
{

    @Override
    public int calculator(int negetive1, int negetive2) {
        return negetive1 - negetive2;
    }

    @Override
    public void loop()
    {
        String[] names = new String[5];

        names[0] = "John";
        names[1] = "Stewart";
        names[2] = "Jimmy";
        names[3] = "Ellen";
        names[4] = "Daniel";

        for (int n = 0; n < names.length; n++)
        {
            System.out.println(names[n]);
        }
    }

    @Override
    public void newMath(int num1, int num2, String action) {

    }

    @Override
    public int newMath1(int num1, int num2, String action) {

        if (action.equalsIgnoreCase("Addition"))
        {
            return num2 + num1;
        }else if (action.equalsIgnoreCase("Subtraction"))
        {
            return num2 - num1;
        }else if (action.equalsIgnoreCase("Multiplication"))
        {
            return num2 * num1;
        }else if (action.equalsIgnoreCase("Division"))
        {
            return num2 / num1;
        }else
            {
                return 0;
            }

    }

}
