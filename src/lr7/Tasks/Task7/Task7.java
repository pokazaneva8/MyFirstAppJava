package lr7.Tasks.Task7;

import java.io.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String path = "src/lr7/Tasks/Task7/";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        String fileName = in.nextLine() + ".txt";
        File file = new File(path + fileName);
        System.out.println("Введите текст, который хотите записать в файл: ");
        String textOfWrite = in.nextLine();
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(
                             new FileWriter(file))) {
            bufferedWriter.write(textOfWrite);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл" + e.getMessage());
        } finally {
            in.close();
        }
        System.out.println("Текст успешно записан");
        System.out.println("Кол-во записанных символов: " + textOfWrite.length());
    }
}
