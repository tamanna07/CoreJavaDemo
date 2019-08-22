package tutoring_encapsulation;

public class Student
{
    private String studentName;
    private String studentAge;
    private String studentDOB;

    public Student()
    {

    }

    public Student(String studentName, String studentAge, String studentDOB) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDOB = studentDOB;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }
}
