package lr3.Task6;

import java.util.ArrayList;

public class Task6_ArrayList {
    public static void main(String[] args) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        int n = 100000;
        ArrayList <Integer> arrList = new ArrayList<Integer>(n);
        for(int i = 1 ; i <= n ; i++){
            arrList.add(i);
        }
        System.out.println("В кругу стоят числа от " + 1 + " до " + n);

        int index = 0;
        while (arrList.size() > 1){
            index = (index + 1) % arrList.size();
            //System.out.println("Удаляем число: " + arrList.get(index));
            arrList.remove(index);
        }
        System.out.println("Последним осталось число: " + arrList.get(0));

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения
        System.out.println("Время выполнения: " + (end-start));
    }
}
