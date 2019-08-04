package my_classes1;

public class Test19
{
    public static void main(String[] args) {
        String coin = "quarter";

        if (coin.equalsIgnoreCase("quarter")){
            System.out.println("this is a quarter");
        }else if (coin.equalsIgnoreCase("dime")){
            System.out.println("this is a dime");
        }else if (coin.equalsIgnoreCase("nickle")){
            System.out.println("this is a nickle");
        }else if (coin.equalsIgnoreCase("penny")){
            System.out.println("this is a penny");
        }else {
            System.out.println("this input in invalid!");
        }
    }

}
