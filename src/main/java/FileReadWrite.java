import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWrite {
    public static BufferedReader fileToReaderObject(){
        // create the path and read the file
        BufferedReader jsonReader;

        try {
            Path path = FileSystems.getDefault().getPath("resources", "recentquotes.json");
            jsonReader = Files.newBufferedReader(path);

        } catch (IOException e) {
            System.out.println(e);
            jsonReader = null; // do something better practice after base functionality established.

        }

        return jsonReader;
    }
}
