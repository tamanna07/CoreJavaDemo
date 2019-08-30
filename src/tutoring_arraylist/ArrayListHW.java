package tutoring_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    /*
        Name: Mohammed Raihan Kabir
        Student_id: 3997NY
        Task: ArrayList HW
     */

public class ArrayListHW
{

    public static void main(String[] args) throws InterruptedException {
        String welcomeMsg = "|--WELCOME TO MAYO CLINIC--|";
        Scanner userFirstName = new Scanner(System.in);
        Scanner userLastName = new Scanner(System.in);
        Scanner userAge = new Scanner(System.in);
        System.out.println(welcomeMsg);
        System.out.println();
        Thread.sleep(500);

        for (int i = 1; i <= 3; i++) {

                List<String> users = new ArrayList<String>();

                System.out.println("|Patient_" + i + "|");
                System.out.print("First Name: ");
                users.add(userFirstName.nextLine());
                System.out.println(users.get(0));
                Thread.sleep(500);

                System.out.print("Last Name: ");
                users.add(userLastName.nextLine());
                System.out.println(users.get(1));
                Thread.sleep(500);

                System.out.print("Age: ");
                users.add(userAge.nextLine());
                System.out.println(users.get(2));
                Thread.sleep(500);

                System.out.println("|-------------|");

        }

        /*
    Create an app that asks the user for their first name, last name and age.
    // Store their information somewhere and then print out all of the
    // user's name and age.

    // - Incorporating Scanner
    // - ArrayList

    // for loop
    // inside  for loop, youre gonna need to ask the user for
    // first name, last name and age
    // and then you're gonna create a User object from these 3 values
    // and then store the User object into the ArrayList<User>

    // and then print the users first and last name out, and their age on each line
     */

    }
}
