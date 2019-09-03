package tutoring_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeArrayList
{


    public static void main(String[] args)
    {
        List<String> location = new ArrayList<String>();

        location.add("NEW YORK");
        location.add("FLORIDA");
        location.add("LAS VEGAS");
        location.add("LOS ANGELES");
        location.add("ARIZONA");
        location.add("Texas");
        location.add("Colorado");
        location.add("Illinois");

        System.out.println(location.get(3));
        System.out.println(location);

        for (int i = 0; i < location.size(); i++)
        {
            System.out.println(location.get(i));
        }

        Collections.sort(location);
        System.out.println("****************");

        for(String loc: location)                           //for each loop
        {
            System.out.println(loc);
        }

        System.out.println("************************");



        Iterator it = location.iterator();                  //use of Iterator

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
