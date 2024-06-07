package lr5.Tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список " +
                "строк и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("Строка до преобразования: ");
        for (String e : strings) {
            System.out.println(e);
        }
        int length = 8;
        List<String> stringsAfter = filterLength(strings, length);
        System.out.println("\n" + "Строка после преобразования: ");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterLength(List<String> list, int length){
        return  list.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }
}