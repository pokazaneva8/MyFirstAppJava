package lr3.Collections;

import java.util.HashMap;
import java.util.Map;

public class Question {
    public static void main(String[] args) {
        // Создаем HashMap
        Map<Integer, String> map = new HashMap<>();
        // Добавляем пару ключ-значение
        map.put(1, "First value");
        map.put(2, "Second value");
        // Попытка добавить еще одну пару с тем же ключом
        map.put(1, "Third value");
        // Выводим содержимое
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
