package my_classes1;

public class BuildRobot {

    public static void main(String[] args) {
        Robot v1 = new Robot();

        v1.name = "Alexa";
        v1.memory = 2;
        v1.creator = "amazon";
        v1.message = "I'm an artificial intelligence and i'm everywhere";

        v1.turn_on();

        System.out.println("********");

        v1.speak();
    }



}
