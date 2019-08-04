package my_classes1;

public class Test22
{
    public static void main(String[] args) {
        String x = "this is x";
        int y = 50232;
        byte w = 22;                //data types
        short s = 1;
        long l = 33444342;
        double d = 1331.33d;
        float f = 233.1f;
        boolean b = s != w;

        //********************************

        System.out.println(x);
        System.out.println(y);
        System.out.println(w);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println("these were basic printing in variables");
        System.out.println("*********************");

        //********************************

        //addition with variables
        System.out.println(x+y);

        //subtraction with variable
        System.out.println(y-3);

        //multiplication with variable
        System.out.println(y*y);

        //division with variable
        System.out.println(l/2);

        //modulus of variables
        System.out.println(l%2);



        //assignment operators
        int table = 20;
        table += 2;                 //can also be used with * / %
        int chair = 10;
        chair -= 8;

        System.out.println(table);
        System.out.println(chair);
        System.out.println("**************");

        //***************************************

        // comparison operators
        System.out.println(table>chair);
        System.out.println(table<chair);
        System.out.println(table<=table);
        System.out.println(table>=chair);
        System.out.println(table!=table);
        System.out.println(table!=chair);
        System.out.println("*****************");

        //***********************************************

        //increment and decrement
        int increment1 = 50;
        increment1++;
        System.out.println(increment1);

        int decrement1 = 31;
        decrement1--;
        System.out.println(decrement1);

        System.out.println("*****************");


        //find the length of a variable
        String length = "this is length";
        System.out.println(length.length());
        //ex2:
        int total = length.length();
        System.out.println(total);



        //uppercase
        String up = "This is upper case alphabet";
        System.out.println(up.toUpperCase());
        System.out.println("******************");

        //lowercase
        String low = "ThIS IS LowER caSe AlPhaBet";
        System.out.println(low.toLowerCase());
        System.out.println("******************");

        //find the index, index always starts counting from 0
        String ind = "Now that you understand, and i'll never change";
        System.out.println(ind.indexOf("never"));
        System.out.println(ind.indexOf('u'));
        System.out.println("*********************");

        //if/else

        String water = "Poland Spring";
        if (water.equalsIgnoreCase("Poland Spring")){
            System.out.println("Dispensing Poland Spring");
        }else if (water.equalsIgnoreCase("Aquafina")){
            System.out.println("Dispensing Aquafina");
        }else if (water.equalsIgnoreCase("Fiji")){
            System.out.println("Dispensing Fiji");
        }else {
            System.out.println("wrong input");
        }

        System.out.println("*************************");

        //**********************************


        //loops

        //for loop
        //for (int o = 1; o <=10;o++){
            //System.out.println(o);
        //}


        //while loop
        //int p = 10;
       // while (p<20){
        //    p+= 2;
          //  System.out.println(p);
        //}


        //do while
        //int q = 20;
        //do {
          //  System.out.println("this is do while");
        //}while (q>100);




        //execution part of methods from the bottom

        //obj1
        Test22 prototype1 = new Test22();
        prototype1.name = "Stewart.";
        prototype1.age = 22;
        prototype1.ability = "I can run fast.";

        //talk
        prototype1.talk();


        //run
        String exRun = prototype1.run();
        System.out.println("Run: "+exRun);

        //listen
        String exListen = prototype1.listen("Sing");
        System.out.println("Command: "+exListen);

        //addition
        int exAddition = prototype1.addition(23,500);
        System.out.println(exAddition);


        System.out.println("*****************************");



        //obj2
        Test22 prototype2 = new Test22();
        prototype2.name = "Robert.";
        prototype2.age = 25;
        prototype2.ability = "I can fly fast.";

        //talk
        prototype2.talk();


        //run
        String exRun2 = prototype2.run();
        System.out.println("Run: "+exRun);

        //listen
        String exListen2 = prototype2.listen("Dance");
        System.out.println("Command: "+exListen2);

        //addition
        int exAddition2 = prototype2.addition(2322,50);
        System.out.println(exAddition);





    }


    //java method declaring

    String name =null;
    int age = 0;
    String ability = null;

    protected void talk(){
        System.out.println("My name is "+name+".");
        System.out.println("I'm "+age+" years old.");
        System.out.println("My ability is "+ability);
    }

    protected String run(){
        return "I'm running";
    }

    protected int addition(int add1,int add2){
        return add1+add2;
    }

    protected String listen(String command){
        return command;
    }


    //*****************************************
    //moving to a different class


}
