package exceptionHandaling;

public class LearnMath
{


    private String  math()
    {
        String result = null;
        try {

            return result;

        }catch (Exception ex) {
            System.out.println("Opss! There is an error. Please try again.");
        }

        return result;
    }






    public static void main(String[] args) {
        LearnMath learnMath = new LearnMath();
        learnMath.math();
    }
}
