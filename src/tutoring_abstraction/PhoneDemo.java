package tutoring_abstraction;

public class PhoneDemo
{


    public static void main(String[] args)
    {
        PhoneFeatures pixel = new Pixel();
        PhoneFeatures iPhone = new Iphone();

        String welcome = "--WELCOME TO SKYNET ROBOTICS--";
        String brand1 = "Pixel:";
        String brand2 = "iPhone:";
        String spacing = "";

        System.out.println(welcome);

        //pixel:
        System.out.println(brand1);
        pixel.display("3D touch screen HD display");
        pixel.camera("DuAl");
        pixel.multitasking(false);
        pixel.remoteControl("Google TV");

        System.out.println(spacing);

        //iPhone:
        System.out.println(brand2);
        iPhone.display("touch screen with retina display");
        iPhone.camera("DuAl  ".toLowerCase().trim());
        iPhone.multitasking(true);
        iPhone.remoteControl("Apple TV");
    }
}
