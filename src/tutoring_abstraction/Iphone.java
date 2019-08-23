package tutoring_abstraction;

public class Iphone implements PhoneFeatures
{

    @Override
    public void display(String fDisplay)
    {
        String msgDisplay = "The display for this Phone is: ";
        System.out.println(msgDisplay+fDisplay);
    }

    @Override
    public void camera(String fCamera)
    {
        String msgMet = "iPhone have 15 MegaPixel cameras on both sides front and back";
        String msgNotMet = "Unfortunately this is an invalid input";

        if (fCamera.endsWith ("dual"))
        {
            System.out.println(msgMet);
        }else
        {
            System.out.println(msgNotMet);
        }
    }

    @Override
    public void multitasking(boolean fIsMultitasking)
    {
        String msgTrue = "iPhone can run multiple apps at once and you can switch " +
                         "to any apps and leave the other app on if you want.";

        String msgFalse = "Unfortunately iPhone doesn't support multitasking. Please close the app " +
                          "that you are using now to open another app.";

        if (fIsMultitasking != false)
        {
            System.out.println(msgTrue);
        }else
        {
            System.out.println(msgFalse);
        }
    }

    @Override
    public void remoteControl(String fRemoteControl)
    {
        String msg = "iPhone also supports remote control on platform: ";
        System.out.println(msg+fRemoteControl);
    }
}
