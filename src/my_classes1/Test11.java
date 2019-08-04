package my_classes1;

public class Test11
{
    public static void main(String[] args) {

        // if else method
        String cover = "iphone x";
        if (cover.equalsIgnoreCase("iphone xs")){
            System.out.println("iphone xs is compatible");
        }else if (cover.equalsIgnoreCase("iphone x")){
            System.out.println("iphone x is compatible");
        }else {
            System.out.println("sorry this type of cover won't fit in our compatible phones");
        }

        // lets review everything over one by one

        /*hello everyone this is java
        -target is to get a job within the end of the 3rd month*/


        //java length
        System.out.println(cover.length());

        //java index
        String w = "hey alexa how are you?";
        System.out.println(w.indexOf("are"));
        System.out.println(w.indexOf('y'));

        //java lower case and upper case
        System.out.println(w.toLowerCase());
        System.out.println(w.toUpperCase());

        //numbers

        int x = 12;
        x -= 2;

        int y = 25;
        y += 5;

        int z = 40;
        z *= 2;

        double c = 20.45d;
        c /= 2;

        int m = 20;
        m %= 2;

        boolean h = 20 <= 100;

        boolean g = 80 <= 50;

        boolean o = 200 != 30;

        boolean p = 100 == 40+60;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(m);
        System.out.println(h);
        System.out.println(g);
        System.out.println(o);
        System.out.println(p);
        System.out.println("that was it.");


        // java concatenation

        System.out.println("age: "+x + " 33"+ " Faydee: "+ 22);  //example
        System.out.println(w+ " Hello from the other sidee!"); // another example

    }
}
