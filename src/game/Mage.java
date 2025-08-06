package game;

public class Mage extends Character {
    public Mage(String name, double health) {
        super(name, health);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Огненный шар!");
    }

    public void heal(double amount) {
        if (amount > 0) {
            health += amount;
            System.out.printf("%s: Исцеление на %.2f hp, здоровья осталось %.2f hp.%n", name, amount, health);
        }
    }
}
