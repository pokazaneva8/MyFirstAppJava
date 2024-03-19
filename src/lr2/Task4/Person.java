package lr2.Task4;

public class Person {
    private String name;
    private int age;
    private String gender;
    Person(String namePerson, int agePerson, String genderPerson) {
        name = namePerson;
        age = agePerson;
        gender = genderPerson;
    }
    public void setName(String namePerson) {
        name = namePerson;
    }
    public void setAge(int agePerson) {
        age = agePerson;
    }
    public void setGander(String genderPerson) {
        gender = genderPerson;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public static void main(String args[]) {
        Person person1 = new Person("Полина", 23, "Женский");
        Person person2 = new Person("Макс", 32, "Мужской");
        person1.setAge(24);

        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());
        System.out.println("Пол: " + person1.getGender());
        System.out.println();
        System.out.println("Имя: " + person2.getName());
        System.out.println("Возраст: " + person2.getAge());
        System.out.println("Пол: " + person2.getGender());
    }
}


