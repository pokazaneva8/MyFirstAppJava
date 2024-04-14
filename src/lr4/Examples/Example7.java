package lr4.Examples;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ae) {
                System.out.println("2 " + ae);
            }
        }
        System.out.println("3");
    }
}