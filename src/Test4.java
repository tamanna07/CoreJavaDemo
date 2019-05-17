public class Test4
{
    public static void main(String[] args)

    {
        String headline = "Java String";

        int result = headline.length();

        System.out.println(headline.length());
        System.out.println(result);

        String big = headline.toUpperCase();

        System.out.println(big);
        System.out.println(headline.toUpperCase());

        String small = headline.toLowerCase();

        System.out.println(headline.toLowerCase());
        System.out.println(small);

        int heat = headline.indexOf('g');

        System.out.println(heat);
        System.out.println(headline.indexOf('g'));

        int cold = headline.indexOf("String");

        System.out.println(headline.indexOf("String"));
        System.out.println(cold);

        //back to operators

        int sum = 90;
        int gum = 60;
        int num = 2;
        boolean total = 40 == gum+sum;

        System.out.println(sum/gum);
        System.out.println(sum%gum);
        System.out.println(gum == num);
        System.out.println(gum != num);
        System.out.println(total);
        System.out.println(gum != num);

        // example 2

        int ci = 45;
        ci += 5;

        int bi = 10;
        bi -= ci;

        double ki = 20.80d;
        ki *= 2;

        boolean answer = 41.60d == ki;

        System.out.println(ci);
        System.out.println(bi);
        System.out.println(++ki);
        System.out.println(answer);
        System.out.println(ki != bi);
        System.out.println(bi >= ki);
        System.out.println(ci <= 67);

        // string demo

        String fender = "i broke my car's fender";

        int piece = fender.length();

        System.out.println(piece);
        System.out.println(fender.length());


        String bigSize = fender.toUpperCase();

        System.out.println(bigSize);
        System.out.println(fender.toUpperCase());

        String smallSize = fender.toLowerCase();

        System.out.println(smallSize);
        System.out.println(fender.toLowerCase());

        System.out.println(smallSize != bigSize);

        int keys = fender.indexOf("fender");

        System.out.println(keys);
        System.out.println(fender.indexOf("fender"));
        System.out.println(fender.indexOf('e'));

        String firstName = "Raihan";
        String lastName = "Kabir";
        int age = 23;
        //"Raihan""Kabir"

        System.out.println("Full Name: "+firstName+" "+lastName+".  Age: "+age);


        String ko = "hamza";
        String lo = "habib";
        int mo = 90;
        String ho = ko+" "+lo+" "+mo;
        String go = "Full name: "+ko+" "+lo+". Age: "+mo;

        System.out.println(ko+" "+lo+" "+mo);
        System.out.println("Full name: "+ko+" "+lo+". Age: "+mo);
        System.out.println(ho);
        System.out.println(go);

        // repeat

        String qo = "school is open tomrrow";
        int po = go.length();

        System.out.println(go.length());
        System.out.println(po);

        System.out.println(go.indexOf("open"));







    }
}
