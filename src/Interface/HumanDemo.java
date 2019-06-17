package Interface;

public class HumanDemo
{
    public static void main(String[] args)
    {
        American execute1 = new American();

        execute1.talk("RICK ROSS");
        execute1.activity();
        int result = execute1.math(30,33,"Addition");
        System.out.println(result);
    }
}
