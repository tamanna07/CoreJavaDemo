package tutoring_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListOfCars
{
    public static void main(String[] args)
    {
        List<String> cars = new ArrayList<String>();

        cars.add("Mercedes");
        cars.add("Acura");
        cars.add("Corvette");
        cars.add("Ferarri");
        cars.add("Lamborghini");

        //ex1
        System.out.println(cars.get(4));
        cars.remove(3);


        //ex2
        System.out.println(cars);

        //ex3
        for (int i = 0; i< cars.size();i++)
        {
            System.out.println(cars.get(i));
        }

        System.out.println("------------");

        //ex4
        for (String c: cars)
        {
            System.out.println(c);
        }
        System.out.println("------------");
        //ex4
        Collections.sort(cars);
        Iterator iterator101 = cars.iterator();
        while (iterator101.hasNext())
        {
            System.out.println(iterator101.next());
        }


    }
}
