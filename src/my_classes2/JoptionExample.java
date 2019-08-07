package my_classes2;

import javax.swing.*;

public class JoptionExample
{
    public static void main(String[] args) {


        String inputString;
        String firstName;
        String lastName;
        int age;
        double saleprice;

        firstName = JOptionPane.showInputDialog("What is your firstname");

        lastName = JOptionPane.showInputDialog("What is your lastname");

//        inputString = JOptionPane.showInputDialog("What is your age");
//
//        age = Integer.parseInt(inputString);


        JOptionPane.showMessageDialog(null, firstName);
        JOptionPane.showMessageDialog(null, lastName);




        System.exit(0);


    }

}
