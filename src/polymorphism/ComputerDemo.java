package polymorphism;

public class ComputerDemo
{
    public static void main(String[] args)
    {
        System.out.println("------------------------------------------------------");


        Computer polymorphicArrays[] = new Computer[2];

        polymorphicArrays[0] = new Windows();
        polymorphicArrays[1] = new Mac();

        for (int p = 0; p < polymorphicArrays.length; p++)
        {
            polymorphicArrays[p].type();
            System.out.println(polymorphicArrays[p].speak("GOOD-BYE","TAA-TAA"));
            polymorphicArrays[p].speak("HELLO THERE","HI","WASSUP");
        }
    }
}
