package lr3.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class RemoveMiddle {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedList и TreeSet.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Измеряем время выполнения операции удаления из середины для ArrayList.
        System.out.println("Время удаления из середины ArrayList: " + removeMiddle(arrayList));
        // Измеряем время выполнения операции удаления из середины для LinkedList.
        System.out.println("Время удаления из середины LinkedList: " + removeMiddle(linkedList));
        // Измеряем время выполнения операции удаления из середины для TreeSet.
        System.out.println("Время удаления из середины TreeSet: " + removeMiddle(new ArrayList<>(treeSet)));
    }
    // Метод для измерения времени выполнения операции удаления из середины коллекции.
    private static long removeMiddle(List<Integer> list) {

        // Добавляем элементы в начало коллекции.
        for (int i = 0; i < 18 * 1000000; i++) {
            list.add(i);
        }
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        for (int i = 0; i < 18 * 1000000; i++) {
            list.remove(list.size() / 2);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
}
