package lr2.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String encryptText = in.next();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        String encryptString = Encrypt.getEncryptString(encryptText, key);

        System.out.println("Зашифрованный текст:\n" + encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.next();

        do {
            if (answer.charAt(0) == 'y'){
                System.out.println("Расшифрованный текст:\n" + Encrypt.getEncryptString(encryptString, -key));
                System.out.println("До свидания!");
                break;
            } else if (answer.charAt(0) == 'n') {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
                System.out.println("Выполнить обратное преобразование? (y/n)");
                answer = in.next();
            }
        } while (answer.charAt(0)!='y' | answer.charAt(0)!='n');
    }
}
