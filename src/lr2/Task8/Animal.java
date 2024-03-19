package lr2.Task8;

public class Animal {
    private String name;
    private int age;
    Animal(String nameAnimal, int ageAnimal) {
        name = nameAnimal;
        age = ageAnimal;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void makeSound() {
        System.out.println("Звук");
    }
}
