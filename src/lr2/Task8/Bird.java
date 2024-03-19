package lr2.Task8;

public class Bird extends Animal{
    private String typeOfFood;
    private String abilityToFly;
    Bird(String nameAnimal, int ageAnimal, String typeOfFoodAnimal, String fly){
        super(nameAnimal, ageAnimal);
        typeOfFood = typeOfFoodAnimal;
        abilityToFly = fly;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    public String getAbilityToFly() {
        return abilityToFly;
    }
    @Override
    public void makeSound() {
        System.out.println("Курлык-курлык!");
    }
}