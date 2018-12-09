import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileSystemQuotes {

    public static Quote[] getQuotes(String path) throws IOException {

            //Read the json file
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder json = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            json.append(line);
            line = reader.readLine();
        }
        //create new Gson
        Gson gson = new Gson();
        //fills up quotes[] with json obj converted(using gson) to strings

        Quote[] quotes = gson.fromJson(json.toString(), Quote[].class);


        return quotes;
    }
}
