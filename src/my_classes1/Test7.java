package my_classes1;

public class Test7
{
    public static void main(String[] args) {

        int x = 4;
        int y = 60;
        int z = 100;

        System.out.println(z-x+y);

        x+= 3;
        y%= 5;
        z/= 4;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        String comment1 = "Mac and windows are not the same";
        String comment2 = "iPhone, and iPads are apple products";

        System.out.println(">now lets make comment 1 all upper case<");

        System.out.println(comment1.toUpperCase());

        // lets try lower case
        String small = comment1.toLowerCase();
        System.out.println(comment1.toLowerCase());
        System.out.println(small);
        System.out.println("****************************");

        // lets find the length of comment2

        int howManyLetters = comment2.length();

        System.out.println(howManyLetters);
        System.out.println(comment2.length());

        System.out.println("/////////////////////////");

        // example of index

        String comment3 = "I wonder car is the fastest out there";
        int container = comment3.indexOf("out");


        System.out.println(comment3.indexOf("out"));
        System.out.println(container);

        System.out.println("/////////////");

        String go = "audi goes with bmw";
        int ho = 45;
        String location = "ozone park";
        String bo = "audi goes with bmw";

        System.out.println("comment: "+go);
        System.out.println("age: "+ho);
        System.out.println("address: "+location);

        boolean stark = go.equalsIgnoreCase(location);

        System.out.println(stark);
        System.out.println(go.equalsIgnoreCase(bo));

        if (go.equalsIgnoreCase(bo)){
            System.out.println("welcome world");
        } else{
            System.out.println("Sorry, Wrong entry");
        }

        int chair = 20;
        int table = 30;
        int spoon = 80;
        int fork = 100;

        System.out.println(chair+table);
        System.out.println(table-chair);
        System.out.println(spoon*fork);
        System.out.println(fork/table);
        System.out.println(table%chair);
        System.out.println("hello: "+table+". "+chair+" hi: "+fork); //string concatenation
        System.out.println(table > chair);
        System.out.println(table >= chair);
        System.out.println(fork == spoon);
        System.out.println(spoon != chair);
        System.out.println(spoon += chair);
        System.out.println(chair -= fork);
        System.out.println(fork *= table);
        System.out.println(++table-table);
        System.out.println(--table+-10);





    }

}
