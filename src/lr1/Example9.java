package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the name of the month: ");
        String month = in.nextLine();

        System.out.println("Input the number of days in this month: ");
        int days = in.nextInt();

        System.out.printf("%s has %d days! \n", month, days);
        in.close();

    }


}
