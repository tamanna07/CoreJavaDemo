package tutoring_polymorphism;

public class RunHuman
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        Human classroom = new ClassRoom();

        obj.behavior("i act like a decent guy in normal");

       classroom.behavior(" a student");


       classroom.behavior("i have like a student"," in New York");
       classroom.behavior("","",true);
    }
}
