package tutoring_DataWriter;

import java.io.FileWriter;
import java.io.IOException;

public class UseFileWriterUsingThrows
{
    public static void main(String[] args) throws IOException {
//        FileWriter fw = null;
//
//        String fileName = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataWriter/SecondWriting.txt";
//
//        fw = new FileWriter(fileName);
//
//        fw.write("Don't ever play yourself");
//
//        fw.close();
//
//        System.out.println("Finished writing....");

        //---------------------------------------------------------------------------------------------

        FileWriter fileWriter = null;

        String fileName2 = "/Users/fortunecookie/IdeaProjects/My_first_project/src/tutoring_DataWriter/ToDolist.txt";

        fileWriter = new FileWriter(fileName2);

        fileWriter.write("----Daily Schedules----");
        fileWriter.write("\n-Wake up"+"\n-Fresh up"+"\n-Workout"+"\n-Breakfast"+"\n-Code");
        fileWriter.close();

        System.out.println("Finished Writing to do list...");

    }
}
