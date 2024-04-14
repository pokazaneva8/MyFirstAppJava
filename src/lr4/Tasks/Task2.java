package lr4.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 3;
        int [][] matrix = {{5,7,3}, {7,0,1}, {8,1,2}};
        int columnNumber;
        System.out.println("Введите номер столбца, который хотите вывести: ");
        try {
            columnNumber = in.nextInt();
            if (columnNumber < 0 || columnNumber >= size) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Элементы столбца " + columnNumber + ":");
                for (int i = 0; i < size; i++) {
                    System.out.print(matrix[i][columnNumber] + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение номера столбца!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: столбец с таким номером отсутствует!");
        }
    }
}