package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        double first = in.nextDouble();

        System.out.println("Input the second number: ");
        double second = in.nextDouble();

        double sum;
        sum = first + second;

        System.out.printf("%.2f + %.2f = %.2f \n", first, second, sum);
        in.close();

    }
}
