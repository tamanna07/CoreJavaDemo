package my_classes1;

public class Test6 {
    public static void main(String[] args) {

        if (true) {
            System.out.println("hello, welcome to if else");
        } else {
            System.out.println("sorry you are in the wrong class");
        }
        System.out.println("*****************");

        if (false) {
            System.out.println("hello, welcome to if else");

        } else {
            System.out.println("Wrong Option");
        }
        System.out.println("***********");

        if (true) {
            System.out.println("welcome to inteliJ");
        } else {
            System.out.println("wrong page please try again");
        }

        System.out.println("**************");

        if (1 == 2) {
            System.out.println("welcome to apple");
        } else {
            System.out.println("ERROR 404");
        }

        System.out.println("**************");

        String usb = "apple";

        if (usb == "apple") {
            System.out.println("charging apple");
        } else if (usb == "samsung") {
            System.out.println("charging samsung");
        } else if (usb == "pixel") {
            System.out.println("charging pixel");
        } else {
            System.out.println("WRONG INPUT!! PLEASE CHECK THE CHARGER AND INSERT AGAIN");
        }
        System.out.println("----------------second example: ***********************");







        if (usb.equalsIgnoreCase("nokia")) {
            System.out.println("charging apple");
        } else if (usb.equalsIgnoreCase("samsung")) {
            System.out.println("charging samsung");
        } else if (usb.equalsIgnoreCase("pixel")) {
            System.out.println("charging pixel");
        } else {
            System.out.println("WRONG INPUT!! PLEASE CHECK THE CHARGER AND INSERT AGAIN");
        }







        System.out.println("******************");

        String cd = "JUST CASE 4 PS4";

        if (cd == "GTA PS4") {
            System.out.println("NOW PLAYING GTA");
        } else if (cd == "WWE PS4") {
            System.out.println("NOW PLAYING WWE");
        }else if (cd == "FIFA PS4"){
            System.out.println("NOW PLAYING FIFA");
        }else{
            System.out.println("AN ERROR OCCURRED, PLEASE CHECK THE DISK AND TRY AGAIN");
        }

        System.out.println("*****************************");


        String headline = "WELCOME TO THE MUNICIPAL PARKING";
        String message1 = "PLEASE INSERT THE APPROPRIATE COINS TO GET YOUR TICKET";
        String border1 = "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-";
        String message2 = "Thank You! Your ticket will expire in 15 minutes.";
        String message3 = "Insert more to extend your stay!";
        String message4 = "Thank You! Your ticket will expire in 7 minutes.";
        String message5 = "!!YOU HAVE PUT THE WRONG COIN!!";
        String message6 = "PLEASE USE THE APPROPRIATE COIN AND TRY AGAIN";
        String message7 = "**WE ONLY ACCEPT US QUARTERS AND DIMES**";

        System.out.println(headline);
        System.out.println(message1);
        System.out.println(border1);

        String coin = "US PENNY";

        if (coin == "US Quarter"){
            System.out.println(message2);
            System.out.println(message3);
        }else if (coin == "US Dime"){
            System.out.println(message4);
            System.out.println(message3);
        }else {
            System.out.println(message5);
            System.out.println(message6);
            System.out.println(message7);
        }

    }
}