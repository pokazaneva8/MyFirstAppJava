package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the name of the current day of the week: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Input the name of the current month: ");
        String month = in.nextLine();

        System.out.println("Input the current day number in the month: ");
        int day = in.nextInt();

        System.out.printf("Today is %s, the %d of %s! \n", dayOfWeek, day, month);
        in.close();

    }
}
