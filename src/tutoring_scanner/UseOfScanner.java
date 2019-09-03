package tutoring_scanner;

import java.util.Scanner;

public class UseOfScanner
{
    public static void main(String[] args)
    {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner location = new Scanner(System.in);

        System.out.print("Name: ");
        //name.nextLine();
        System.out.println(name.nextLine());
        System.out.print("Age: ");
        age.nextInt();
        System.out.print("Location: ");
        location.nextLine();



    }
}
