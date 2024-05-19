package lr6.Tasks;

import java.util.Arrays;
import java.util.Random;
class findSumInThread extends Thread {
    private int start;
    private int end;
    private int[] array;
    private int sum = 0;
    public findSumInThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum = sum + array[i];
        }
    }
    public int getSum() {
        return sum;
    }
}


public class Task6 {
    private static int[] generateArray(int size) {
        int sumControl = 0;
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            sumControl = sumControl + array[i];
        }
        System.out.println("Контроль суммы: " + sumControl);
        return array;
    }

    public static int sumOfNumber(int [] array, int countThreads) throws InterruptedException{
        findSumInThread [] threads = new findSumInThread[countThreads];
        int sizeOfChunk = array.length / countThreads;
        int startInd = 0;
        for (int i = 0; i < countThreads; i++) {
            int endInd;
            if (i == countThreads - 1){
                endInd = array.length;
            } else {
                endInd = startInd + sizeOfChunk;
            }
            threads[i] = new findSumInThread(array, startInd, endInd);
            threads[i].start();
            startInd = endInd;
        }
        int sum = 0;
        for (findSumInThread thread : threads) {
            thread.join();
            sum = sum + thread.getSum();
        }

        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        int[] numbers = generateArray(100);

        try {
            System.out.println("Сумма элементов равна: " + sumOfNumber(numbers, processors));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
