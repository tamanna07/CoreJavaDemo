package tutoring_DataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseFileReader
{
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        String file = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataReader/FileReader2";


        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        String data = "";

        while ((data = bufferedReader.readLine())!= null)
        {
            System.out.println(data);
        }






    }
}
