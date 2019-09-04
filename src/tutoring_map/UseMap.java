package tutoring_map;

import java.util.HashMap;
import java.util.Map;

public class UseMap
{
    public static void main(String[] args)
    {
        Map<String,String> earth = new HashMap<String, String>();
        // <KEY  , VALUES>

        earth.put("United States","New York");               //put() is used for to add key and values
        earth.put("England","London");
        earth.put("Bangladesh","Sylhet");
        earth.put("Russia","Moscow");
        earth.put("Spain","Real Madrid");

        System.out.println(earth.get("United States"));

        for (Map.Entry<String, String> e: earth.entrySet())
        {
            System.out.println(e.getKey()+ "-> "+ e.getValue());
        }
        for(String i:earth.keySet()){
            System.out.println(i);
        }
        for(String i:earth.values()){
            System.out.println(i);
        }

    }
}
