package my_classes1;

public class Test5
{
    public static void main(String[] args)
    {
        int x = 20;
        int y = 10;
        int v = 2;

        x += 3;
        y /= 5;
        v *= 10;

        System.out.println(x);
        System.out.println(y);
        System.out.println(v);
        System.out.println("Number: "+v/y*x);
        System.out.println(v != y);

        String d = "i lost my phone";
        String f = "Keep looking for it";
        String s = "java is an object oriented language";

        System.out.println(d.length());
        System.out.println(d.toUpperCase());
        System.out.println(f.toLowerCase());
        System.out.println(s.indexOf("language"));
        System.out.println("last: "+d.indexOf('p'));
    }

}
