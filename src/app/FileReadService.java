package app;

import app.utils.Paths;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {

    public String readFile(String file) {
        file += ".txt";
        try (final BufferedReader br =
                     new BufferedReader(new InputStreamReader(
                             new FileInputStream(Paths.PATH_IN +
                                     file)))) {

            String str;
            StringBuilder stringBuilder = new StringBuilder();
            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }


    }
}
