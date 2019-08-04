package my_classes1;

public class Test29 {

    String name = null;
    int age = 0;
    String origin = null;

    protected void walk()
    {
        System.out.println("walking");
    }

    public  void speak()
    {
        System.out.println("Hi, my name is "+name+".");
        System.out.println("I'm "+age+ " years old.");
        System.out.println("I'm from "+origin+".");

    }

    //***************************************************

    // diff class

    public static void main(String[] args)
    {
        Test29 execute1 = new Test29();
        Test29 execute2 = new Test29();

        execute1.name = "Brad";
        execute1.age = 20;
        execute1.origin = "Texas";

        execute2.name = "Chris";
        execute2.age = 25;
        execute2.origin = "Florida";

        execute1.walk();
        execute1.speak();
        System.out.println("**********");

        execute2.walk();
        execute2.speak();



        //loop
        int q = 0;

        while (q < 10){
            System.out.println(q);
            q++;
        }

        System.out.println("**************");

        for (int w = 0; w <= 5; w++ )
        {
            System.out.println(w);
        }

        System.out.println("*******************");

        int r = 0;
        do {
            System.out.println(r);

        }while (r > 10);


        // arrays

        String [] shoes = new String[3];

        shoes[0] = "addidas";
        shoes[1] = "jordan";
        shoes[2] = "puma";

        System.out.println(shoes[0]);
        System.out.println(shoes[1]);
        System.out.println(shoes[2]);

        int [] num = new int[3];

        num[0] = 20;
        num[1] = 10;
        num[2] = 5 ;


        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);



    }

}
