package lr2.Task8;

public class Dog extends Animal{
    private String breed;
    private String typeOfFood;
    Dog(String nameAnimal, int ageAnimal, String breedAnimal, String typeOfFoodAnimal){
        super(nameAnimal, ageAnimal);
        breed = breedAnimal;
        typeOfFood = typeOfFoodAnimal;
    }
    public String getBreed() {
        return breed;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}
