package lr7.Examples.Example7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        Person person = new Person (name, age);
        try{
            FileOutputStream fileOut =
                    new FileOutputStream("src/lr7/Examples/Example7/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved is in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
        in.close();
    }
}