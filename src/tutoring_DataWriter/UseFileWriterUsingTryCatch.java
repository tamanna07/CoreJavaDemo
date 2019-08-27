package tutoring_DataWriter;

import java.io.FileWriter;

public class UseFileWriterUsingTryCatch
{
    public static void main(String[] args)
    {
        FileWriter tryFileWriter = null;

        String file = "/Users/fortunecookie/IdeaProjects/My_first_project/sc/tutoring_DataWriter/grocery_list.txt";

        try {
            tryFileWriter = new FileWriter(file);
            tryFileWriter.write("--List for grocery shopping--");
            tryFileWriter.write("\n-Napkins"+"\n-Penut Butters"+"\n-Breads"+"\n-Yogurt");
        }catch (Exception ex)
        {
            System.out.println("SORRY! COULDN'T COMPLETE THE REQUEST");
        }finally {
            try {
                tryFileWriter.close();
            }catch (Exception e)
            {

            }
        }
    }
}
