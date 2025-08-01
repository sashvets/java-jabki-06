package animal;

public class Animal {

    private String name = "Абстрактная живность";

    public void speak() {
        System.out.printf("Животное: %s; сказало: Бууу\n", this.name);
    }
}
