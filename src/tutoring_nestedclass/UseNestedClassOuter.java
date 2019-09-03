package tutoring_nestedclass;

public class UseNestedClassOuter
{
    /*
    Nested Classes. The Java programming language allows you to define a class within another class.
    Such a class is called a nested class and is illustrated here: ... Non-static nested classes (inner classes)
    have access to other members of the enclosing class, even if they are declared private.
     */

    InnerClassA innerClassA = new InnerClassA();
    InnerClassB innerClassB = new InnerClassB();

    public void outerClassMethodA()
    {
        System.out.println("Outer method A");
        innerClassA.innerMethodA();
        innerClassB.innerMethodB();

    }

    private class InnerClassA
    {
        private String id;

        private void innerMethodA()
        {
            System.out.println("INNER METHOD A");
        }

    }


    public class InnerClassB
    {
        private String dob;

        public void innerMethodB()
        {
            System.out.println("Inner method B");
        }
    }

    public class InnerClassC
    {

        InnerClassB innerClassB = new InnerClassB();
        private String dob;

        public void innerMethodC()
        {
            System.out.println("**************");
            System.out.println("Inner method C");
            innerClassB.innerMethodB();
        }
    }


}
