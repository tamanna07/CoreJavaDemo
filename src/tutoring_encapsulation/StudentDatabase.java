package tutoring_encapsulation;

public class StudentDatabase
{
    public static void main(String[] args)
    {
        Student student1Info = new Student("John","29","04/19/1991");
        System.out.println(student1Info.getStudentName());
        System.out.println(student1Info.getStudentAge());
        System.out.println(student1Info.getStudentDOB());

        Student student2Info = new Student("Trevor","27","08/13/1993");
        student2Info.setStudentName("TrayWay");
        System.out.println(student2Info.getStudentName());
        System.out.println(student2Info.getStudentAge());
        System.out.println(student2Info.getStudentDOB());
    }
}
