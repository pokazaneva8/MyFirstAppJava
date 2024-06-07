package lr5.Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");
        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        int number = 10;
        List<Integer> integersAfter = filterdivisionList(integers,number);
        System.out.println("\n" + "Список чисел, которые делятся без остатка на "+ number + "\n");

        for (Integer i: integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> filterdivisionList(List<Integer> list, int number) {
        return list.stream().filter(x -> x % number == 0).collect(Collectors.toList());
    }
}
