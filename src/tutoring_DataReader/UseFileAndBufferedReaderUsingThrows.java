package tutoring_DataReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseFileAndBufferedReaderUsingThrows
{
    public static void main(String[] args) throws IOException {
        FileReader fileR = null;
        BufferedReader bufferedR = null;

        String fileName = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataReader/PracticeFileReader";

        fileR = new FileReader(fileName);
        bufferedR = new BufferedReader(fileR);

        String fileData = "";

        while ((fileData = bufferedR.readLine()) != null)
        {
            System.out.println(fileData);
        }

    }
}
