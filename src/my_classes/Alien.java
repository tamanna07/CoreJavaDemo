package my_classes;

import com.sun.jdi.request.StepRequest;

public class Alien {

    String name = null;
    int age = 0;
    String ability = null;

    public void walk()
    {
        System.out.println("walking");

    }

    //**********************************

    public static void main(String[] args)
    {
        Alien configuration1 = new Alien();
        Alien configuration2 = new Alien();
        Alien configuration3 = new Alien();

        //config1
        configuration1.name = "Starscrem";
        configuration1.age = 300;
        configuration1.ability = "flying jet";

        System.out.println("Name: "+configuration1.name);
        System.out.println("Age: "+configuration1.age);
        System.out.println("Ability: "+configuration1.ability);
        configuration1.walk();

        System.out.println("*************************");

        //config2
        configuration2.name = "Optimus";
        configuration2.age = 500;
        configuration2.ability = "Big truck";

        System.out.println("Name: "+configuration2.name);
        System.out.println("Age: "+configuration2.age);
        System.out.println("Ability: "+configuration2.ability);

        System.out.println("************************");

        //config3
        configuration3.name = "Bumblebee";
        configuration3.age = 100;
        configuration3.ability = "chevy camaro car";

        System.out.println("Name: "+configuration3.name);
        System.out.println("Age: "+configuration3.age);
        System.out.println("Ability: "+configuration3.ability);
    }
}
