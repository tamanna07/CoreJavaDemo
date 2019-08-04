package my_classes1;

public class Test16 {

    protected String nameFormat(String frstN)
    {
        return frstN;
    }

    protected String nameFormat2(String lstN)
    {
        return lstN;
    }

    protected int additionFrmt(int add, int add2)
    {
        return add + add2;
    }

    //*****************************************//


    public static void main(String[] args)
    {
        Test16 execute1 = new Test16();


        //exct1
        String frstname = execute1.nameFormat("Raihan");
        System.out.println("First Name: "+frstname);

        String lstname = execute1.nameFormat("Kabir");
        System.out.println("Last Name: "+lstname);

        int adding = execute1.additionFrmt(30,11);
        System.out.println("Addition: "+adding);
    }
}
