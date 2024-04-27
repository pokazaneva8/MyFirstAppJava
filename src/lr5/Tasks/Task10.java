package lr5.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");
        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        int number = 500;
        List<Integer> integersAfter = filterByValue(integers,number);
        System.out.println("\n" + "Список чисел, которые меньше "+ number + "\n");

        for (Integer i: integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> filterByValue(List<Integer> list, int number) {
        return list.stream().filter(x -> x < number).collect(Collectors.toList());
    }
}
