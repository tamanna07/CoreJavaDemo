package my_classes1;

public class MethodDemo
{
    public void methodA()
    {
        System.out.println("I'm Method A.");
    }

    public String methodB()
    {
        return "I'm Method BBB.";
    }

    public int sum()
    {
        int num = 30;
        return 10 + num;
    }

    public int sum2(int add,int newAdd)  // <<<<Example of parameter
    {
        return add + newAdd;
    }




    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.methodA();



        String msg = methodDemo.methodB();
        System.out.println(msg);

        int result = methodDemo.sum();
        System.out.println(result);

        int sumRes = methodDemo.sum2(300,30);
        System.out.println(sumRes);
    }
}
