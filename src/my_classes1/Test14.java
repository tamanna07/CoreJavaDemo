package my_classes1;

public class Test14 {

    public static void main(String[] args)
    {
        String cd = "Black diamond";

        if (cd.equalsIgnoreCase("Black Panther")){
            System.out.println("playing Black Panther");
        }else if (cd.equalsIgnoreCase("Avengers")){
            System.out.println("playing Avengers");
        }else {
            System.out.println("wrong input! this item is not in the library..");
        }
    }
}
