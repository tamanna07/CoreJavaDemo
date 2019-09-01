package tutoring_queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue
{
    public static void main(String[] args)
    {
        Queue<String> patientsLists = new LinkedList<>();

        patientsLists.add("Jakie");
        patientsLists.add("Katy");
        patientsLists.add("Dan");
        patientsLists.add("Travis");
        patientsLists.add("Sam");

        System.out.println(patientsLists.peek());   //peek is to verify which value has last input
        patientsLists.poll();                       //pop is to remove
        System.out.println(patientsLists.peek());
    }
}
