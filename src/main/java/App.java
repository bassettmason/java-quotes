import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {


        Path JSON_PATH = FileSystems.getDefault().getPath("resources", "recentquotes.json");
        String JSON_PATH_STRING = JSON_PATH.toString();
        Gson gson = new Gson();

        try(BufferedReader reader = new BufferedReader(new FileReader(JSON_PATH_STRING))){
            //code that reads it line by line and concats into one stringov

        } catch (IOException e){
            System.out.print(e);
        }

        JsonReader reader = new JsonReader(new InputStreamReader(, "UTF-8"));
//        String json = gson.toJson();

        Quote instanceofQuote = gson.fromJson(quotePath, Quote.class);

        System.out.println(instanceofQuote);


    }






}
