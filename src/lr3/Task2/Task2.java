package lr3.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичную систему счисления:");
        int n = in.nextInt();
        String result = toBinary(n);
        System.out.println("Число " + n + " в двоичной форме: " + result);
    }
    public static String toBinary(int n){
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            int intPart = n / 2;
            int remainder = n % 2;
            String result;
            result = toBinary(intPart);
            return result + remainder;
        }
    }
}
