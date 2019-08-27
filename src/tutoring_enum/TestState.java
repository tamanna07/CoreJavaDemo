package tutoring_enum;

public class TestState
{
    public static void main(String[] args)
    {
        System.out.println(State.NEW_YORK.getName());
        System.out.println(State.ARIZONA.getCapital());
        System.out.println("The capital of washington is "+State.WASHINGTON.getCapital());
        //etc.




        //SwitchCase
        State myState = State.ARIZONA;

        switch (myState)
        {
            case ARIZONA:
                System.out.println("It's very hot in Arizona");
                break;
            case NEW_YORK:
                System.out.println("A lot of tourists are in New York");
                break;
            case WASHINGTON:
                System.out.println("The capital of the washington is "+myState.getCapital());
                break;
            case NEW_JERSEY:
                System.out.println("In new Jersey they have Six Flags Amusement Park");
                break;
            default:
                System.out.println("UNKNOWN INPUT");
                break;
        }

    }
}
