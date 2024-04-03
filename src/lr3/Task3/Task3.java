package lr3.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeOfArray = in.nextInt();
        int[] array = new int[sizeOfArray];
        inArray(array, 0);
        System.out.println("Введенный массив");
        outArray(array, 0);
    }
    public static void inArray(int[] array, int index) {
        Scanner in = new Scanner(System.in);
        if (index < array.length) {
            System.out.println("Введите значение " + index + " элемента массива: ");
            array[index] = in.nextInt();
            index++;
            inArray(array, index);
        }
    }

    public static void outArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println("array [" + index + "] = " + array[index]);
            index++;
            outArray(array, index);
        }
    }
}