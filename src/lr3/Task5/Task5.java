package lr3.Task5;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Zero");
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
        hm.put(6, "Six");
        hm.put(7, "Seven");
        hm.put(8, "Eight");
        hm.put(9, "Nine");
        hm.put(10, "Ten");
        hm.put(11, "Eleven");
        hm.put(12, "Twelve");

        System.out.println("Значение ключа больше 5");
        for (Integer key : hm.keySet()){
            if (key > 5){
                System.out.println("Ключ " + key + "- Значение "+ hm.get(key));
            }
        }
        System.out.println("Значение ключа равно 0");
        if (hm.containsKey(0)){
            System.out.println("Ключ 0 - Значение " + hm.get(0));
        }
        int mult = 1;
        for (Integer key : hm.keySet()){
            String value = hm.get(key);
            if (value.length() > 5) {
                mult *= key;
            }
        }
        System.out.println("Результат перемножения ключей, где длина значений больше 5 - " + mult);
    }
}
