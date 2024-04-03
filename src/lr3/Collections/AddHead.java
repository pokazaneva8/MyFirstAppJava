package lr3.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class AddHead {
    public static void main(String[] args) {
        // Создаем экземпляры трех коллекций: ArrayList, LinkedList и TreeSet.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        // Измеряем время выполнения операции добавления в начало для ArrayList.
        System.out.println("Время добавления в начало ArrayList: " + addHead(arrayList));
        // Измеряем время выполнения операции добавления в начало для LinkedList.
        System.out.println("Время добавления в начало LinkedList: " + addHead(linkedList));
        // Измеряем время выполнения операции добавления в начало для TreeSet.
        System.out.println("Время добавления в начало TreeSet: " + addHead(new ArrayList<>(treeSet)));
    }
    // Метод для измерения времени выполнения операции добавления в начало коллекции.
    private static long addHead(List<Integer> list) {
        // Фиксируем начальное время выполнения операции.
        long start = System.currentTimeMillis();
        // Добавляем элементы в начало коллекции.
        for (int i = 0; i <  18 * 1000000 ; i++) {
            list.add(0, i);
            System.out.println(list);
        }
        // Фиксируем конечное время выполнения операции.
        long end = System.currentTimeMillis();
        // Возвращаем затраченное время.
        return end - start;
    }
}


