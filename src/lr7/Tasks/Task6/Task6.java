package lr7.Tasks.Task6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String path = "src/lr7/Tasks/Task6/";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        String fileName = in.nextLine() + ".txt";
        File file = new File(path + fileName);
        System.out.println("Введите слово, которое хотите найти в тексте файла: ");
        String word = in.nextLine();
        try (BufferedReader bufferedReader =
                new BufferedReader(
                        new FileReader(file))) {
            String line;
            Boolean flag = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(word)){
                    System.out.println(line);
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Введенного слова в файле " + fileName + " нет");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла" + e.getMessage());
        } finally {
            in.close();
        }
    }
}
