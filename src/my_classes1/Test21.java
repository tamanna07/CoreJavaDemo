package my_classes1;

public class Test21
{
    String name = null;
    int age = 0;
    String origin = null;

    public void run(){
        System.out.println("running");
    }


    public String sayName(){
        return "Hi I'm "+name+".";
    }

    public void sayAge(){
        System.out.println("I'm "+age+" years old.");
    }

    public void talk(){
        System.out.println("Hi I'm "+name+".");
        System.out.println("I'm "+age+" years old.");
        System.out.println("I'm from "+origin);
    }

    public int addition(int add1,int add2){
        return add1+add2;
    }
    //*************************************************************

    public static void main(String[] args)
    {
        Test21 demo1 = new Test21();

        demo1.name = "Bruno mars";
        demo1.age = 30;
        demo1.origin = "United States";

        demo1.talk();
        System.out.println("*******************");

        String exSayName = demo1.sayName();
        System.out.println("Name: "+exSayName);

        System.out.print("Age: ");
        demo1.sayAge();
        System.out.println("*************************");

        demo1.run();
        System.out.println("****************");

        int exAddition = demo1.addition(20,11);
        System.out.println("Addition: "+exAddition);





    }
}