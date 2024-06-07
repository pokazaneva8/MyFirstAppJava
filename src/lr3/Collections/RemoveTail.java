package lr3.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class RemoveTail {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedList и TreeSet.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Измеряем время выполнения операции удаления из конца для ArrayList.
        System.out.println("Время удаления из конца ArrayList: " + removeTail(arrayList));
        // Измеряем время выполнения операции удаления из конца для LinkedList.
        System.out.println("Время удаления из конца LinkedList: " + removeTail(linkedList));
        // Измеряем время выполнения операции удаления из конца для TreeSet.
        System.out.println("Время удаления из конца TreeSet: " + removeTail(new ArrayList<>(treeSet)));
    }
    // Метод для измерения времени выполнения операции удаления из конца коллекции.
    private static long removeTail(List<Integer> list) {

        // Добавляем элементы в коллекцию.
        for (int i = 0; i < 18 * 1000000; i++) {
            list.add(i);
        }
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        for (int i = 0; i < 18 * 1000000; i++) {
            list.remove(list.size() - 1);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
}
