package polymorphism;

public class FullDemoHuman
{
    public static void main(String[] args)
    {
        Demo1Human aa =  new Demo1Human();

        aa.activity("i'm eating...","i'm also drinking.....");

        Demo2Human bb = new Demo2Human();

        bb.activity("i'm running","I'm drinking.", "3rd parameter");

        bb.activity("sas","drink");

        //**********************************************************************************

        Parent parent = new Parent();
        System.out.println("Without Override: "+parent.sum());

        Child child = new Child();
        System.out.println(child.sum());
        System.out.println(child.name);
        System.out.println(child.name);
    }
}
