package tutoring_DataWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ListOfMovies
{
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;

        String file = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataWriter/movies101.txt";

        fileWriter = new FileWriter(file);

        fileWriter.write("- Inception"+"\n- Godzilla"+"\n- Avengers"+"\n- 3 idiots");

        fileWriter.close();
    }
}
