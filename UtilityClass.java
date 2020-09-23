import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UtilityClass {
    public static double average(int[] arrayInt) {
        double totalInt=0;
        for (int i:arrayInt) {
            totalInt+=i;
        }
        if (arrayInt.length == 0) return 0;
        return totalInt/arrayInt.length;
    }
    public static boolean validUserInput(Object obj, String inputType) {
        switch (inputType) {
            case "int": {

            }
        }
        return true;
    }


    /** writes the content of a list of strings to a file
     *
     * @param content the list of strings
     * @param fileName the name of the output file
     */
    public static void writeToFile(List<String> content, String fileName) {
        Path pathToFile= Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
            for(String line: content) {
                writer.write(line);
            }
            System.out.println("Content written to " + pathToFile  );
        } catch (IOException e) {
            System.out.println("Could not write file to " + pathToFile);
            e.printStackTrace();
        }
    }
}
