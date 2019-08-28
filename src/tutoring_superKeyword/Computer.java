package tutoring_superKeyword;
/*
super is a keyword. It is used inside a sub-class method definition to call
a method defined in the super class. Private methods of the super-class
cannot be called. Only public and protected methods can be called by the
super keyword. It is also used by class constructors to invoke constructors
of its parent class.
 */
public class Computer
{
    int ramSize;

    final int CPU = 0;

    public Computer()
    {

    }

    public Computer(int ramSize)
    {
        this.ramSize = ramSize;
    }

    public void assembleComputer()
    {
        System.out.println("Computer was assembled in america");
    }

    public void assembleMonitor()
    {
        System.out.println("The monitor has retina display");
    }
}
