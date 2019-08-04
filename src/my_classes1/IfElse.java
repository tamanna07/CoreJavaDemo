package my_classes1;

public class IfElse
{
    public static void main(String[] args) {

        if(true){
            System.out.println("Give me the Coke");
        }else {
            System.out.println("There is some error...!!!");
        }

        System.out.println("I'm done.");

        System.out.println("******************************************");

        String cup = "Apple Juice";

        if (cup == "Coke"){
            System.out.println("Give me the Coke.");
        }else if (cup == "Sprite"){
            System.out.println("Give me the Sprite");
        }else if (cup == "Fanta"){
            System.out.println("Give me the Fanta.");
        }else if(cup == "Water"){
            System.out.println("Give me the Water");
        }else {
            System.out.println("Hey..!! You put wrong the cup. Please check with the cashier.");
        }
    }
}
