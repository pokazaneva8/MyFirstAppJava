package lr6.Tasks;

import java.util.Arrays;
import java.util.Random;
class findMaxInThread extends Thread {
    private int start;
    private int end;
    private int[] array;
    private int max = Integer.MIN_VALUE;
    public findMaxInThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            max = Math.max(max, array[i]);
        }
    }
    public int getMax() {
        return max;
    }
}


public class Task5 {
    private static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        System.out.println("Контроль максимума: " + Arrays.stream(array).max().getAsInt());
        return array;
    }

    public static int maxNumber(int [] array, int countThreads) throws InterruptedException{
        findMaxInThread [] threads = new findMaxInThread[countThreads];
        int sizeOfChunk = array.length / countThreads;
        int startInd = 0;
        for (int i = 0; i < countThreads; i++) {
            int endInd;
            if (i == countThreads - 1){
                endInd = array.length;
            } else {
                endInd = startInd + sizeOfChunk;
            }
            threads[i] = new findMaxInThread(array, startInd, endInd);
            threads[i].start();
            startInd = endInd;
        }
        int max = Integer.MIN_VALUE;
        for (findMaxInThread thread : threads) {
            thread.join();
            max = Math.max(max, thread.getMax());
        }

        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        int[] numbers = generateArray(100);

        try {
            System.out.println("Максимум равен: " + maxNumber(numbers, processors));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}