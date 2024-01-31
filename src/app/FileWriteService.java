package app;

import app.utils.Paths;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    static String myFile;
    static FileOutputStream fout;
    static byte[] byteArr;

    public static String writeFile(String fileName, String text) {
        String res = "Файл успішно створений!";

        myFile = Paths.PATH_IN + fileName + ".txt";

        try {
            fout = new FileOutputStream(myFile);
            // Конвертація рядка в байти
            byteArr = text.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            // Закриття потоку
            fout.close();

        } catch (IOException ex) {
            res = ex.getMessage().toString();
            System.exit(0);
        }
        return res;

    }
}
