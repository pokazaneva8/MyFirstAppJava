package lr2.Task8;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Кеша", 1, "Зерно", "Да");
        Cat cat = new Cat("Муся", 2, "Рыба");
        Dog dog = new Dog("Полкан", 5, "Ротвейлер", "Мясо");

        System.out.println("Птица");
        System.out.println("Имя: " + bird.getName());
        System.out.println("Возраст: " + bird.getAge());
        System.out.println("Корм: " + bird.getTypeOfFood());
        System.out.println("Умеет летать: " + bird.getAbilityToFly());
        bird.makeSound();

        System.out.println("\nКошка");
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Корм: " + cat.getTypeOfFood());
        cat.makeSound();

        System.out.println("\nСобака");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Порода: " + dog.getBreed());
        System.out.println("Корм: " + dog.getTypeOfFood());
        dog.makeSound();
    }
}
