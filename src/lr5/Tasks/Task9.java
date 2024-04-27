package lr5.Tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello_World", "Hello World", "He!!o World", "Hello Wor1d","hello W world", "Привет Мир Ё", "Привет Мир");
        System.out.println("\n" + "Строка до преобразования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterBySymbol(strings);
        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterBySymbol(List<String> list){
        return  list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-ЯЁё\\s]+"))
                .collect(Collectors.toList());
    }
}
