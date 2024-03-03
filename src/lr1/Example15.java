package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: ");
        double first = in.nextDouble();

        System.out.println("Input the second number: ");
        double second = in.nextDouble();

        double sum, diff1, diff2;
        sum = first + second;
        diff1 = first - second;
        diff2 = second - first;

        System.out.printf("Sum: %.2f \n", sum);
        System.out.printf("Difference first - second: %.2f \n", diff1);
        System.out.printf("Difference second - first: %.2f \n", diff2);
        in.close();

    }
}
