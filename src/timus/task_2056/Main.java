package timus.task_2056;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int five =  0;
        int four = 0;
        int three = 0;
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++){
            ints[i] = in.nextInt();
            if (ints[i] == 5) {
                five++;
            } else if (ints[i] == 4){
                four++;
            } else if (ints[i] == 3){
                three++;
            }
        }
        if (three != 0) {
            System.out.println("None");
        } else if (five == size) {
            System.out.println("Named");
        } else if (((double)(five * 5 + four * 4) / size) >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
