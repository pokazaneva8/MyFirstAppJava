package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your year of birth: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - year;

        System.out.printf("%s is %d years old! \n", name, age);
        in.close();

    }
}
