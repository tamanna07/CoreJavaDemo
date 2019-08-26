package tutoring_scanner;

import java.util.Scanner;

public class UseScanner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        //scan.nextLine();

        System.out.print("Name: ");
        scan.nextLine();
        System.out.print("Age: ");
        scan.nextInt();
        System.out.print("Location: ");
        scan2.nextLine();
    }
}
