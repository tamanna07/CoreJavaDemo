package my_classes1;

public class Test37
{
    Test37()
    {
        final int age = 1000;
        System.out.println(age);

    }


    public static void main(String[] args)
    {
        Test34 execute1 = new Test34();
        Test36 execute2 = new Test36();

        execute1.vMachine();
        execute1.loop();
        System.out.println(execute1.calculator(2,7));
        System.out.println("***********");
        execute1.newMath(20,30,"Addition");

        System.out.println(execute2.newMath1(10,20,"Subtraction"));


        final String name = "Mohammed";
        //once assigned cannot be changed

        System.out.println(name);

        Test37 ss = new Test37();

    }
}
