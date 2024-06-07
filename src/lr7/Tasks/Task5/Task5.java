package lr7.Tasks.Task5;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String path = "src/lr7/Tasks/Task5/";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        String fileName = in.nextLine() + ".txt";
        File file = new File(path + fileName);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла " + fileName + " - " + fileSize + " байт");
        } else {
            System.out.println("Файл не найден.");
        }
        in.close();
    }
}
