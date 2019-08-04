package my_classes1;

public class Calculator                 //1st class
{
    //add
    protected int addition(int num1,int num2)
    {
        return num1 + num2;
    }

    //subt
    protected int subtraction(int num3,int num4)
    {
        return num3 - num4;
    }

    //mult
    protected int multiplication(int num5,int num6)
    {
        return num5 * num6;
    }

    //divi
    protected int division(int num7,int num8)
    {
        return num7 / num8;
    }

    //-------------------------------------------------------//

    //2nd class
    public static void main(String[] args)
    {
        Calculator demo1 = new Calculator();
        System.out.println("*Demo1*");

        //add
        int add = demo1.addition(5000,1000);
        System.out.println("Addition: "+add);

        //subtract
        int subtract = demo1.subtraction(50,25);
        System.out.println("Subtraction: "+subtract);

        //multiply
        int multiply = demo1.multiplication(300,2);
        System.out.println("Multiplication: "+multiply);

        //division
        int divide = demo1.division(10,2);
        System.out.println("Division: "+divide);
    }
}

