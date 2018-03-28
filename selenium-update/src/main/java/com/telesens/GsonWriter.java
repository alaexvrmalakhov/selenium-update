package com.telesens;

import com.google.gson.Gson;
import java.io.*;

public class GsonWriter {
    public static void main(String[] args) {
        Person person = new Person("Peter", 28);
        Gson gson = new Gson();
        String json = gson.toJson(person);

        try (Writer writer = new FileWriter(new File("./person.json"))) {
            writer.write(json);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
