package zoo;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void eat() {
        System.out.printf("%s ест%n", this.name);
    }
}