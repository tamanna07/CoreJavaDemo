package my_classes1;

public class Test2
{
        public static void main(String[] args)
    {
            String title = "WELCOME CLASS";
            int a = 2;
            int b = 4;
            byte c = 7;
            short d = 98;
            long l = 12323;
            float e = 23.45f;
            char ans = 'B';
            boolean result = ans == e;

        System.out.println(title);
        System.out.println(a+c);
        System.out.println(l-d);
        System.out.println(d/e);
        System.out.println(e*a);
        System.out.println(d%l);
        System.out.println(++d/--c);
        System.out.println(--c*a);
        System.out.println(result);
        System.out.println(++d%c);
        System.out.println(d%c);
        System.out.println(d/c); //test

        /* begin assignment
        operators
         */
        int x = 5;
        x += 3;
        int y = 30;
        y -= 10;
        System.out.println(x);
        System.out.println(y);
    }
}
