package timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int pay = 0;
        if (a <= c) {
            while (a <= c) {
                if( a + b <= c) {
                    a = a + b;
                    pay = a;
                } else {
                    pay = c;
                    break;
                }

                if (c - d >= a) {
                    c = c - d;
                    pay = c;
                }
                else {
                    pay = a;
                    break;
                }
            }
            System.out.println(pay);
        }
        else {
            System.out.println(a);
        }
    }
}
