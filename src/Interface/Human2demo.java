package Interface;

import java.time.Year;

public class Human2demo
{
    public static void main(String[] args)
    {
        Hispanic demo1 = new Hispanic();
        African demo2 = new African();

        demo1.speak();
        demo1.sleep();
        System.out.println(demo1.activity(12,20,"addition"));

        System.out.println("********");

        demo2.speak();
        demo2.sleep();
        int subtract = demo2.activity(10,20,"subtraction");
        System.out.println(subtract);

    }
}

