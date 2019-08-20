package my_classes2;

public class StaticTopic
{
    public String name;

    public void speak(String name)
    {
        this.name = name;
        System.out.println("Hi, my name is "+name);
    }

    static String activity;

    public static void run(String activity)
    {
        StaticTopic.activity = activity;
        System.out.println("I don't know how to "+activity);
    }
    //-------------------------------------------------------------------------


    public static int totalNumberOfPatient = 0;
    boolean needSpecialist;
    boolean diagnosed;
    String sex;

//    public StaticTopic()
//    {
//        needSpecialist = false;
//        diagnosed = false;
//        totalNumberOfPatient++;
//        System.out.println(totalNumberOfPatient);
//    }


    public StaticTopic(String s, String a)
    {
        sex = s;
        needSpecialist = false;
        diagnosed = false;
        totalNumberOfPatient++;
        System.out.println(s+" "+totalNumberOfPatient);
    }

    public static String name2 = "raihan";

    public StaticTopic()
    {
        StaticTopic.name2 = name2;
        String num =  "Student name is: "+ name2;


        for (int i = 0; i<3; i++)
        {
            System.out.println(num);
        }

    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        StaticTopic.name2 = name2;
    }
}
