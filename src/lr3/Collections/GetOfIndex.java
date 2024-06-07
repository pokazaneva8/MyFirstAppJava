package lr3.Collections;

import java.util.*;

public class GetOfIndex {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println("Время получения по случайному индексу из ArrayList: " + getIndex(arrayList));
        System.out.println("Время получения по случайному индексу из LinkedList: " + getIndex(linkedList));
        System.out.println("Время получения по случайному индексу из TreeSet: " + getIndex(new ArrayList<>(treeSet)));
    }
    private static long getIndex(List<Integer> list) {
        // Заполняем коллекцию элементами перед получением значений по индексу.
        for (int i = 0; i < 18 * 1000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 18 * 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            int element = list.get(randomIndex);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
