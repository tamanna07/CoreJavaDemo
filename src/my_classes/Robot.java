package my_classes;

public class Robot {

    String name = null;
    int memory;
    String creator = null;
    String message = null;

    public void speak()
    {

        System.out.println("HI! My name is "+name+".");
        System.out.println("I have a memory of "+memory+" TB.");
        System.out.println("My creator is "+creator);
        System.out.println(message);

    }

    public void shut_down()
    {
        System.out.println("shutting down....give it a few seconds");
    }

    public void turn_on()
    {
        System.out.println("WELCOME! ask me anything");
    }


}
