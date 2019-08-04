package my_classes1;

public class Test17
{
    protected void sodaVender()
    {
        String soda = "coke";

        if (soda.equalsIgnoreCase("Coke")){
            System.out.println("Dispensing Coke");
        }else if (soda.equalsIgnoreCase("Sprite")){
            System.out.println("Dispensing Sprite");
        }else if(soda.equalsIgnoreCase("Fanta")){
            System.out.println("Dispensing Fanta");
        }else {
            System.out.println("sorry! choose only from the item we have on SODA, Thank You!");
        }
    }

    protected String waterVender()
    {
        String water = "kjkjk";

        if (water.equalsIgnoreCase("Poland Spring")){
            return water;
        }else if (water.equalsIgnoreCase("Aquaafina")) {
            return water;
        }else{
            return "Error msg.....!!!";
        }
    }

    //***************************************************

    //execute
    public static void main(String[] args)
    {
        Test17 vender1 = new Test17();

        vender1.sodaVender();

        String msg = vender1.waterVender();
        System.out.println(msg);

    }
}
