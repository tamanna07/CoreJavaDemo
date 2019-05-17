package my_classes;

public class PhoneBuild {

    public static void main(String[] args) {

        Phone result = new Phone();

        String powerphn = result.power();
        //System.out.println(powerphn);

        String powerphn1 = result.power1();
        //System.out.println(powerphn1);

        String powerphn2 = result.power2("kjljjlkkjl");
        System.out.println(powerphn2);
    }
}
