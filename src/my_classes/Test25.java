package my_classes;

public class Test25 {

    String[] students = new String[5];

    public void List()
    {
        //String[] students = new String[5];
        students[0]  = "AZ";
    }

    public void state()
    {
        students[1] = "NY";
        System.out.println(students[1]);
    }

    public void stateA()
    {
        String[] list = new String[5];
        list[0] = "list 1";
    }

    public void stateB()
    {
        //list[0] = "list 1";
        //students
    }

    public static void main(String[] args) {

        Test25 execute = new Test25();

        execute.students[4]  = "CT";
        System.out.println(execute.students[4]);

        execute.state();
    }
}
