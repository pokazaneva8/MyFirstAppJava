package lr6.Tasks;
class NewThread extends Thread {
    NewThread(int i){
        super(i + " поток");
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread t = new NewThread(i);
            t.start();
        }
    }
}