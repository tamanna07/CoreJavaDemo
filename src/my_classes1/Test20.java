package my_classes1;

public class Test20
{
    String name = null;
    int age = 0;
    String birthPlace = null;

    protected void walk()
    {
        System.out.println("walking...");
    }


    protected String run()
    {
        return "running";
    }

    protected void talk()
    {
        System.out.println("Hi! I am "+name);
        System.out.println("I'm "+age+" years old.");
        System.out.println("My birth place is in planet "+birthPlace);
    }

    protected String work(String cmnd1){
        return cmnd1;
    }

    protected int add_math(int add1,int add2)
    {
        return add1+add2;
    }

    //*****************************************************
    //*****************************************************
    //*****************************************************

    public static void main(String[] args)
    {
        Test20 prototype1 = new Test20();
        prototype1.name = "Optimus Prime";
        prototype1.age = 1000;
        prototype1.birthPlace = "cybertron";

        System.out.println("1- Run: "+prototype1.run());

        System.out.print("2- Walk: ");
        prototype1.walk();

        System.out.print("3- Talk: ");
        prototype1.talk();

        System.out.print("4- Work: ");
        System.out.println(prototype1.work("Stand up"));

        System.out.println("5- Can you do adding math?");
        System.out.print("Yes! ");
        int adding = prototype1.add_math(10070,30030);
        System.out.println(adding);

        System.out.println("********************");

        Test20 prototype2 = new Test20();
        prototype2.name = "Megatron";
        prototype2.age = 999;
        prototype2.birthPlace = "the bad side of cybertron";

        System.out.println("1- Run: "+prototype2.run());

        System.out.print("2- Walk: ");
        prototype2.walk();

        System.out.print("3- Talk: ");
        prototype2.talk();

        System.out.print("4- Work: ");
        System.out.println(prototype2.work("Sit down"));

        System.out.println("5- Can you do adding math?");
        System.out.print("Yes! ");
        int adding2 = prototype2.add_math(1111,330);
        System.out.println(adding);


    }
}
