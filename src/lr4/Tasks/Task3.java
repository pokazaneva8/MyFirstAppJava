package lr4.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        byte[] arr = new byte[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение " + i + " элемента массива: ");
            try {
                int b = in.nextInt();
                if (b < Byte.MIN_VALUE || b > Byte.MAX_VALUE) throw new NumberFormatException();
                arr[i] = (byte) b;
                sum += arr[i];
            } catch (NumberFormatException e) {
                System.out.println(e + " - Ошибка: введенное значение за пределами диапазона типа byte!");
                i--;
            } catch (InputMismatchException e) {
                System.out.println(e + " - Ошибка: введены некорректные данные!");
                in.next();
                i--;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}