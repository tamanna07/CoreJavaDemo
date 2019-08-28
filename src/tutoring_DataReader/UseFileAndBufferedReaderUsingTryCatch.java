package tutoring_DataReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class UseFileAndBufferedReaderUsingTryCatch
{
    public static void main(String[] args)
    {
        FileReader fr = null;
        BufferedReader br = null;
        String filePath = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataReader/PracticeFileReader";
    try {
        fr = new FileReader(filePath);
        br = new BufferedReader(fr);

        String data = "";
        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
            }catch (Exception e)
        {
            System.out.println("Error! couldn't locate the file. Please try again");
        }finally {
            try {
                fr.close();
                br.close();
            }catch (Exception ex2)
            {

            }

        }
    }
}
