package lr4.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = in.nextInt();
        if (n <= 0) throw new NegativeArraySizeException("Ошибка: неверный размер массива!");
        int count = 0;
        int sum = 0;
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + " элемента массива: ");
            try {
                arr[i] = in.nextInt();
                if (arr[i] <= 0) {
                    count ++;
                } else {
                    sum = sum + arr[i];
                }
            } catch (InputMismatchException e) {
                System.out.println(e + " - Ошибка: введен тип, отличный от int!");
                in.next();
                i--;
            }
        }
        if (count == n) {
            throw new ArithmeticException("Ошибка: в массиве отсутствуют положительные числа!");
        } else {
            double result = (double) sum / (n - count);
            System.out.println("Среднее арифметическое положительных элементов массива: " + result);
        }
    }
}