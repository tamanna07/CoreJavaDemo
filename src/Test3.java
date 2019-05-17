public class Test3
{
    public static void main(String[] args) {

        String title = "     Java assignment operators";

        int x = 5;
        x += 4;

        int y = 6;
        y -= 2;

        int v = 8;
        v *= 3;

        short b = 10;
        b /= 2;

        byte m = 50;
        m %= 4;

        int u = 95;
        u = v+b;

        int o = 90;
        o = m/u;

        int table = 80;
        int chair = 4;

        double watch = 12.98d;
        double sunglass = 31.50d;






        System.out.println(title);
            System.out.println(x);
                System.out.println(y);
                    System.out.println(v);
                        System.out.println(b);
                    System.out.println(m);
                System.out.println(u);
            System.out.println(o);
        System.out.println(x==y);
            System.out.println(x!=y);
                System.out.println(x>=y);
                    System.out.println(x>y);
                        System.out.println(x<y);
                    System.out.println(x<=y);
                System.out.println(x+=y);
            System.out.println(v*=y);
                System.out.println(++x+v);
                    System.out.println(table ^= chair);
                        System.out.println(table |= chair);
                    System.out.println(table &= chair);
                System.out.println(table >>= chair);
            System.out.println(table <<= chair);
        System.out.println("done");
            System.out.println(watch += sunglass);
                System.out.println(watch -= sunglass);
                    System.out.println();
    }
}
