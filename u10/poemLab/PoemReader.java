package u10.poemLab;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PoemReader {
    public static ArrayList<String> readPoem(String filename) throws Exception {
        File file = new File(filename);
        Scanner reader = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
        reader.close();
        return lines;
    }    
}
