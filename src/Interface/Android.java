package Interface;

public class Android implements Phone
{
    public String speaker()
    {
        return "this is the speaker for android";
    }

    public String chargingPort()
    {
        return "this is the charging port for android";
    }

    public void display()
    {
        System.out.println("this is the display for android");
    }

    public int calculatorAdd(int num1, int num2)
    {
        return num1 + num2;
    }

    public String names(String firstName, String lastName)
    {
        return "User's Full Name: "+firstName+" "+lastName+".";
    }

    public void engine()
    {
        System.out.println("The engine is big");
    }

}
