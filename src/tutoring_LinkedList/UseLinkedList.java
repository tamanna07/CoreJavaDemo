package tutoring_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//they all come as a pack. can't print one by one. gotta print them all

public class UseLinkedList
{
    public static void main(String[] args)
    {
        List<String> guests = new LinkedList<String>();

        guests.add("DJ KHALED");
        guests.add("French Montana");
        guests.add("Drake");
        guests.add("Chris Brown");
        guests.add("Tyga");

        guests.remove("Tyga");
        Iterator i = guests.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }






    }
}
