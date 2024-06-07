package lr7.Examples.Task3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new FileReader("src/lr7/Examples/Task3/input_task3_file.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}
