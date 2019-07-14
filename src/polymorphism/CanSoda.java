package polymorphism;

public class CanSoda
{
    public void color()
    {
        System.out.println("Clear Steel default color");
    }

    public void location(String loc1,String loc2)
    {
        String[] places = new String[2];

        places[0] = loc1;
        places[1] = loc2;

        System.out.println("locations where soda's will be available besides the origin location:--");
        for (int p = 0; p < places.length; p++)
        {
            System.out.println(places[p]);
        }
    }

    public void location(String loc1)
    {
        if (loc1.equalsIgnoreCase("Israel"))
        {
            System.out.println("THIS IS THE ORIGINAL LOCATION OF OUR COMPANY");
        }else
            {
                System.out.println("SORRY, NOT A CORRECT ENTRY");
            }
    }
}
