package lr2;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] numbs = new int[size];
        Random random = new Random();

        for(int i = 0; i < numbs.length; i++){
            numbs[i] = random.nextInt(10);
            System.out.println("Элемент массива ["+i+"] = " + numbs[i]);
        }

        int min = numbs[1];

        for(int x : numbs) {
            if( x <= min) {
                min = x;
            }
        }

        System.out.println("Минимальный элемент массива = " + min);

        for(int i = 0; i < numbs.length; i++){
            if (numbs[i] == min) {
                System.out.println("Индекс минимального элемента массива = " + i);
            }
        }
        in.close();
    }
}
