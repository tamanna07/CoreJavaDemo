package my_classes1;

public class Animals extends Animals2
{

    String name = null;
    int age = 0;

    protected void speak()
    {
        System.out.println("Hi my name is "+ name+" and I'm "+ age+" years old.");
    }
}
