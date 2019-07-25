package my_classes;

public class Zoo
{
    public static void main(String[] args)
    {
        AnimalZoo animal1 = new AnimalZoo("Tiger",10,"Striped black and orange");
        animal1.eat("any types of meat");
        System.out.print("What i like to is ");
        System.out.println(animal1.hobby("kill for living anything moves."));
        System.out.println("");

        AnimalZoo animal2 = new AnimalZoo("Lion",15,"yellow");
        animal2.eat("any types of meat");
        animal2.hobby("");
        System.out.print("What i like to is ");
        System.out.println(animal2.hobby("kill em all cz i'm the king of the jungle dawg."));
        System.out.println("");

        AnimalZoo animal3 = new AnimalZoo("Zebra",5,"stripped black and white");
        animal3.eat("all the greens");
        animal3.hobby("");
        System.out.print("What i like to is ");
        System.out.println(animal3.hobby("i want to run faster when i see any predator coming toward me."));




    }
}
