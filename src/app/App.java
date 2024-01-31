package app;

import app.utils.Paths;
import app.utils.Utils;

import java.util.Scanner;
import java.io.File;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        findAllFiles(Paths.PATH_IN);

        System.out.println("""
                        
                1 - Відкрити існуючий файл
                2 - Створити новий
                """);

        fileProcess(Utils.checkNumberInt(scanner.nextLine().trim()));
        scanner.close();
    }

    private static void findAllFiles(String path) {
        //ОТримання списку файлів в папці

        File folder = new File(path);

        File[] files = folder.listFiles();//Отримую список файлів
        if (files != null) {
            System.out.println("\nФайли доступні для читання:");

            //Вивожу в консоль імена файлів
            for (File file : files) {
                System.out.println(file.getName());
            }

        }
    }

    private static void fileProcess(int res) {
        if (res == 1 || res == 2) {
            System.out.println("Введіть назву файлу(без розширення):");
            String fileName = scanner.nextLine().trim();

            switch (res) {
                case 1:
                    System.out.println(new FileReadService().readFile(fileName));
                    break;

                case 2:
                    System.out.println("Введіть текст:");
                    String txt = scanner.nextLine().trim();

                    System.out.println(new FileWriteService().writeFile(fileName, txt));
                    break;
            }

        } else System.out.println("Наступного разу Ви зможете:)");
    }
}
