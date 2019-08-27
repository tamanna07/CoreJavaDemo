package tutoring_DataReader;

import java.io.File;
import java.io.FileReader;

public class GetFileInfo
{
    public static void main(String[] args)
    {
        File getFileinfo = null;

        String fileName = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataReader/PracticeFileReader";

        getFileinfo = new File(fileName);

        getFileinfo.exists();
        System.out.println("Does this file exist? "+getFileinfo.exists());
        System.out.println(getFileinfo.getName());
        System.out.println(getFileinfo.getAbsolutePath());
        System.out.println(getFileinfo.length());
        System.out.println(getFileinfo.getAbsoluteFile());
        System.out.println(getFileinfo.getUsableSpace());
        System.out.println(getFileinfo.isHidden());


    }
}
