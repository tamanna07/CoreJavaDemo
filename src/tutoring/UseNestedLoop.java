package tutoring;

public class UseNestedLoop
{
    public static void main(String[] args) throws InterruptedException {

//        int rows = 6;

//        for (int i = 1; i <= rows; i++)              // using for loop inside for loop
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }




//        int i = 1;
//        while (i <= rows)                               //  using for loop inside while loop
//        {
//            for (int j = 1; j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//            i++;
//        }



        //--------------------------------------------------------------------------------------------------------------

        //make a diamond in console
//        int rows = 10;
//        for (int i = 1; i<=rows; i++)
//        {
//            for (int k = 1; k <=rows-i; k++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j<= i; j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int x = rows-1; x >= 1; x--)
//        {
//            for (int y = 1; y <= rows-x; y++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int a = 1; a <= x; a++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//----------------------------------------------------------------------------------------------------------------------

    int rows101 = 10;

        for (int i = 1; i <= rows101; i++)
        {
            Thread.sleep(300);
        for (int j = 1; j <= rows101-i; j++)
        {
            System.out.print(" ");
        }

        for (int x = 1; x <= i; x++)
        {
            System.out.print("* ");
        }
            System.out.println();
        }


        for (int i = rows101-1; i >= 1; i--)
        {
            Thread.sleep(300);
            for (int j = 1; j <= rows101-i; j++)
            {

                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //--------------------------------------------------------------------------------------------------------------

        int rows102 = 10;

        for (int i = 1; i <= rows102; i++)
        {
            Thread.sleep(300);
            for (int j = 1; j <= rows102-i; j++)
            {
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = rows102-1; i >= 1; i--)
        {
            Thread.sleep(300);
            for (int j = 1; j <= rows102-i; j++)
            {

                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }





    }
}
