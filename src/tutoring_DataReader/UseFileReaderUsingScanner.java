package tutoring_DataReader;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

public class UseFileReaderUsingScanner {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;

        Scanner scan = new Scanner(System.in);

        fr = new FileReader(scan.nextLine());
        br = new BufferedReader(fr);

        String data = "";

        while ((data = br.readLine()) !=null)
        {
            System.out.println(data);
        }
    }

}
