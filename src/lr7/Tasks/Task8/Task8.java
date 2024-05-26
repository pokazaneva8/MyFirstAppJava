package lr7.Tasks.Task8;
import java.io.*;
import java.util.Scanner;
class Person implements Serializable {
    private String name;
    private int age;
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        in.close();
        Person person = new Person(name, age);
        String filePath = "src/lr7/Tasks/Task8/person.json";
        try{
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeObject(person);
            System.out.println("Объект сериализован и записан в файл: " + filePath);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Person restoredPerson = null;
            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream(filePath));
            restoredPerson = (Person) input.readObject();
            System.out.println("Объект восстановлен из файла:" + filePath);
            if (restoredPerson != null) {
                System.out.println("Данные из файла: ");
                System.out.println("Имя: " + restoredPerson.getName());
                System.out.println("Возраст: " + restoredPerson.getAge());
            }
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
