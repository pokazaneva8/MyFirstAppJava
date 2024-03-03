package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();

        int birthYear = currentYear - age;

        System.out.printf("You were born in %d! \n", birthYear);
        in.close();

    }


}
