package tutoring_DataReader;

import java.io.File;

public class GetFileInformation
{
    public static void main(String[] args)
    {
        File getFileInfo = null;

        String file = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataReader/FileReader2";

        getFileInfo = new File(file);

        System.out.println(getFileInfo.exists());
        System.out.println(getFileInfo.length());
        System.out.println(getFileInfo.getName());
        System.out.println(getFileInfo.canWrite());
        System.out.println(getFileInfo.canRead());




    }
}
