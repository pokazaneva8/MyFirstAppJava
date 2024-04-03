package lr3.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class RemoveHead {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedList и TreeSet.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Измеряем время выполнения операции удаления из начала для ArrayList.
        System.out.println("Время удаления из начала ArrayList: " + removeHead(arrayList));
        // Измеряем время выполнения операции удаления из начала  для LinkedList.
        System.out.println("Время удаления из начала LinkedList: " + removeHead(linkedList));
        // Измеряем время выполнения операции удаления из начала для TreeSet.
        System.out.println("Время удаления из начала TreeSet: " + removeHead(new ArrayList<>(treeSet)));
    }
    // Метод для измерения времени выполнения операции удаления из начала коллекции.
    private static long removeHead(List<Integer> list) {
        // Добавляем элементы в начало коллекции.
        for (int i = 0; i < 18 * 1000000; i++) {
            list.add(i);
        }
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        for (int i = 0; i < 18 * 1000000; i++) {
            list.remove(0);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
}
