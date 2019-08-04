package my_classes1;

public class AnimalZoo
{
    String name = null;
    int age = 0;
    String color;

    AnimalZoo(String name, int age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;

        System.out.println("Hi, my name is "+name+'.');
        System.out.println("I'm "+age+' '+"years old");
        System.out.println("My color is "+color+'.');

    }

    public void eat(String food)
    {
        System.out.println("I eat"+' '+food+'.');
    }

    public String hobby(String activity)
    {
        return activity;
    }

}
