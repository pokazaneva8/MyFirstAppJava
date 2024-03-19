package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива X*Y");
        int sizeX = in.nextInt();
        int sizeY = in.nextInt();
        System.out.println("Размер массива равен " + sizeX + " на " + sizeY + "\n");
        int numbs[][] = new int[sizeX][sizeY];

        for(int i = 0; i < sizeX; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < sizeY; j++) {
                    numbs[i][j] = i + j;
                    System.out.println("Элемент массива [" + i + "] [" + j + "] = " + numbs[i][j]);
                }
            } else {
                for(int j = sizeY - 1; j >= 0; j--) {
                    numbs[i][j] = i + j;
                    System.out.println("Элемент массива [" + i + "] [" + j + "] = " + numbs[i][j]);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(numbs[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
