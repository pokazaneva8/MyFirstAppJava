package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the number: ");
        double numb = in.nextDouble();
        double minus, plus, sum2;
        minus = numb-1;
        plus = numb+1;
        sum2 = Math.pow(minus+numb+plus,2);

        System.out.printf("%.2f, %.2f, %.2f, %.2f \n", minus, numb, plus, sum2);
        in.close();
    }
}
