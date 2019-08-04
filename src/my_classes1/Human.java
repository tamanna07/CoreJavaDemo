package my_classes1;

public class Human {

    String name;
    int age;
    int howTall;
    String skinColor;


    public void eat(){
        System.out.println("Eating...");
    }

    public void workout(){
        System.out.println("Running...");
    }

    public void speak (){
        System.out.println("Hi my name is "+name);
        System.out.println("I'm "+ age+" years old.");
        System.out.println("I'm "+howTall+" feet tall");
        System.out.println("Also I'm "+skinColor);
    }



}
