package abstruct;

public class HumanDemo
{
    public static void main(String[] args)
    {
        Hispanic execute1 = new Hispanic();
        American execute2 = new American();

        System.out.print("TALK: ");
        System.out.println(execute1.speak());
        System.out.print("ACTIVITY: ");
        execute1.walk();
        System.out.print("Vision");
        execute1.vision();
        System.out.println("Run: ");
        execute1.run();

        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");

        System.out.print("TALK: ");
        System.out.println(execute2.speak());
        System.out.print("ACTIVITY: ");
        execute2.walk();
        System.out.print("Vision");
        execute2.vision();
        System.out.println("Run: ");
        execute2.run();


    }
}
