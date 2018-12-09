import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class WebQuoteGetter implements QuoteGetter {
    @Override
    public Quote getQuote () {

        try {
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                json.append(line);
                line = reader.readLine();
            }
            reader.close();
            Gson gson = new Gson();
            String[] parsedJson = gson.fromJson(json.toString(), String[].class);
            Quote answer = new Quote(parsedJson[0], "Ron Swanson");


            return answer;
        } catch (IOException e) {
            // something went wrong with the internet
            System.out.println("The Internet is down, but here is a Quote from our file");


            QuoteGetter getter2 = new FileSystemQuoteGetter("resources/recentquotes2.json");
            return (getter2.getQuote());

        }


    }
}

