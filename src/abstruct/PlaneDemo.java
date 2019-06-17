package abstruct;

public class PlaneDemo
{
    public static void main(String[] args)
    {
        Boeing717 execute1 = new Boeing717();
        Boeing787 execute2 = new Boeing787();

        System.out.println("Pilots:");
        System.out.println(execute1.pilots());
        System.out.println("Tires:");
        execute1.tires("WhiteStone tires");
        System.out.println("Engine:");
        execute1.engine();

        System.out.println("**************************");


        System.out.println("Pilots:");
        System.out.println(execute2.pilots());
        System.out.println("Tires:");
        execute2.tires("Continental tires");
        System.out.println("Engine:");
        execute2.engine();
    }
}
