package lr2.Task8;

public class Cat extends Animal{
    private String typeOfFood;
    Cat(String nameAnimal, int ageAnimal, String typeOfFoodAnimal){
        super(nameAnimal, ageAnimal);
        typeOfFood = typeOfFoodAnimal;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}
