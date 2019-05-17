public class Test8
{
    public static void main(String[] args)

    {
        String headline = "welcome to java";
        String jav = "nafeee is playing ps4";
        int ps4 = 23;
        int ps3 = 24;
        int xbox = 103;
        xbox += 2;
        double kingAge = 102.32d;

        System.out.println("headline: "+ headline);
        System.out.println("sentence: "+ jav);
        System.out.println(headline.length());
        System.out.println(headline.toUpperCase());
        System.out.println(jav.indexOf("ps4"));
        System.out.println(ps3+ps4);
        System.out.println(ps3+3+2);
        System.out.println(xbox!=21);

        String soda = "coke";

        if (soda.equalsIgnoreCase("coke")) {

            System.out.println("right input");

        } else if (soda.equalsIgnoreCase("fanta")){

        } else {
            System.out.println("wrong input sorry");

    }








        String oil = "castrol";

        if (oil.equalsIgnoreCase("castrol")){
            System.out.println("processing now. dispensing Castrol");
        } else if (oil.equalsIgnoreCase("Mobil")){
            System.out.println("processing now. dispensing Mobil");
        }else if (oil.equalsIgnoreCase("Mercedez factory oil")){
            System.out.println("processing now. dispensing Mercedez factory oil");
        }else {
            System.out.println("NOT A COMPATIBLE OIL, PLEASE CHECK AGAIN");
        }

        System.out.println("******************************************");










        String gear = "R";
        String message1 = "car is on parking mode, to change the gear, please hold to" +
                "brake and move the shifter";
        String message2 = "car is on drive mode, release the" +
                "brake to move forward";
        String message3 = "car is on neutral mode, CAUTION! any force can" +
                "move the car backward or forward";
        String message4 = "car is on reverse mode, release the break" +
                "to go backward";
        String message5 = "this mode is unavailable at this moment";

        if (gear.equalsIgnoreCase("P")){
            System.out.println(message1);
        }else if (gear.equalsIgnoreCase("D")){
            System.out.println(message2);
        }else if (gear.equalsIgnoreCase("N")){
            System.out.println(message3);
        }else if (gear.equalsIgnoreCase("R")){
            System.out.println(message4);
        }else {
            System.out.println(message5);
        }


        System.out.println("********************");


        int bills = 100;

        if (bills == 20){
            System.out.println("thank you for $20");
        }else if (bills == 50){
            System.out.println("thank you for $50");
        }else{
            System.out.println("SORRY!!we do not accept any type of bills " +
                    "except $20 and $50");
        }
        System.out.println("/////////////////////");

        char answer = 'b';

        if (answer == 'a'){
            System.out.println(" correct answer");
        }else {
            System.out.println("wrong answer");

        }
    }
}
