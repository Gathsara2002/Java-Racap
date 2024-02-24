package theory;

import java.io.*;

/**
 * @author : Gathsara
 * created : 2/24/2024 -- 7:56 PM
 **/

public class FileIO {
    public static void main(String[] args) {

        //write to new file
        String[] names = {"jon", "Dean", "Kate"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\PRF Assignments\\Working\\PRF\\OutputFile.txt"));
            writer.write("Writing file");
            writer.newLine();
            writer.write("new line");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //read from file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\PRF Assignments\\Working\\PRF\\OutputFile.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
