package my_classes;

public class AnimalsExt
{
    public static void main(String[] args)
    {
        Animals execute1 = new Animals();

        execute1.name = "Cat,";
        execute1.age = 5;
        execute1.activity = "Run fast";

        execute1.speak();
        System.out.println(execute1.abilities());
    }
}
