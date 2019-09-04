package tutoring_map;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap
{
    public static void main(String[] args)
    {
        Map <String,Integer> people = new HashMap <String,Integer>();

        //Map  people = new HashMap ();         --->>RAW TYPES: means you can put any type of info in key and values

        people.put("Jakie",34);
        people.put("Paul",15);
        people.put("Bonnie",25);
        people.put("Arnold",39);
        people.put("Frank",48);
        people.put("Jonathan",60);
        people.put("Randy",54);

        for (Map.Entry<String,Integer> entry : people.entrySet())
        {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
