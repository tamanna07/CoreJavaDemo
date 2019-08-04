package my_classes1;

public class Test15 {

    String name = null;
    int age = 0;
    String color = null;

    protected void talk(){
        System.out.println("talking....");
    }

    protected String sleep(){
        return "sleeping....";
    }

    //**************************************************//

    public static void main(String[] args)
    {
        Test15 sample1 = new Test15();
        Test15 sample2 = new Test15();


        //sample1
        sample1.name ="garfield";
        System.out.println("Name: "+sample1.name);
        sample1.age = 12;
        System.out.println("Age: "+sample1.age);
        sample1.color = "gold";
        System.out.println("Color: "+sample1.color);

        System.out.println("*************************");

        //sample2
        sample2.name = "woodie";
        System.out.println("Name: "+sample2.name);
        sample2.age = 11;
        System.out.println("Age: "+sample2.age);
        sample2.color = "yellow";
        System.out.println("Color: "+sample2.color);


    }
}
