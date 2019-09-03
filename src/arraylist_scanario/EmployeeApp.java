package arraylist_scanario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp
{
    /*
    Write a java program that contains an Employee class with the following properties.
    eid (type is int), ename (type is String), Department (type is Department).
    Now create another class named Department which contains the properties did(type is int),
    dname(type is String) and designation (type is String). Now create another class named
    EmployeeApp which contains the main method.

    Now write code that prompts the user to enter the Employee details like id, name, and
    prompt Department details like department id, name and designation details in ArrayList<Employee> object.
    Enter at least 3 employees and department info print those details to the output by iterating through
    Department ArrayList. Another important thing is that the property Department in Employee class should
    be of type Department (which is a class).
     */

    static ArrayList<Employee> list = new ArrayList<Employee>();

    static void pushElement(Employee obj) {
        list.add(obj);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Employee's information to be stored?");
        int count = sc.nextInt();

        for (int i = 0; i <= count; i++) {
            System.out.println("Enter Employee ID: ");
            int eid = sc.nextInt();

            System.out.println("Enter Employee Name: ");
            String ename = sc.next();

            System.out.println("Enter Department ID: ");
            int did = sc.nextInt();

            System.out.println("Enter Department Name");
            String dname = sc.next();

            System.out.println("Enter Department designation: ");
            String designation = sc.next();

            Department d = new Department(did, dname, designation);
            Employee eobj = new Employee(eid, ename, d);
            pushElement(eobj);
        }

        System.out.println("--- Employee Information ---");

        for (Employee obj : list) {
            System.out.println("Employee ID: " + obj.eid);
            System.out.println("Employee Name: " + obj.ename);
            Department department = obj.department;
            System.out.println("Department ID: " + obj.department.did);
            System.out.println("Department Name :" + obj.department.dname);
            System.out.println("Department designation " + obj.department.designation);
        }
    }
}
