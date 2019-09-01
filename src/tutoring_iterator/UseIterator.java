package tutoring_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseIterator
{
    public static void main(String[] args)
    {
        List<String> locations = new ArrayList<String>();

        locations.add("NY");
        locations.add("AZ");
        locations.add("CA");
        locations.add("FL");
        locations.add("KY");

        Iterator list = locations.iterator();       //It allows us to traverse the collection, access
                                                    //the data element and remove the data elements
                                                    //of the collection.
        while (list.hasNext())
        {
            System.out.println(list.next());
        }

        System.out.println("---------");


        //to remove
        locations.remove("KY");
        Collections.sort(locations);                //used sort for practice.
        Iterator list2 = locations.iterator();

        while (list2.hasNext())
        {
            System.out.println(list2.next());
        }



    }
}
