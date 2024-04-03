package lr3.Task6;

import java.util.LinkedList;

public class Task6_LinkedList {
    public static void main(String[] args) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        int n = 100000;
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }
        System.out.println("В кругу стоят числа от " + 1 + " до " + n);

        int index = 0;
        while (linkedList.size() > 1) {
            index = (index + 1) % linkedList.size();
            //System.out.println("Удаляем число: " + linkedList.get(index));
            linkedList.remove(index);
        }
        System.out.println("Последним осталось число: " + linkedList.get(0));

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения
        System.out.println("Время выполнения: " + (end-start));
    }
}

