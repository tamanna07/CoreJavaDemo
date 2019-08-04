package Interface;

public class African implements Human2
{
    String name = null;
    int age = 0;
    String location = null;

    @Override
    public void speak() {
        name = "Turner";
        age = 24;
        location = "Nigeria";

        System.out.println("Hi, I'm "+ name);
        System.out.println("I'm "+ age+" years old");
        System.out.println("I live in "+location);

    }

    @Override
    public void sleep() {
        System.out.println("going to sleep");

    }

    @Override
    public int activity(int num1, int num2, String type) {
        if (type.equalsIgnoreCase("Subtraction"))
        {
            int total = num2-num1;
            return total;
        }else
        {
            System.out.println("I can't do anything besides Subtraction");

        }return 0;
    }
}
