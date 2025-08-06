package game;

public class Character {
    protected String name;
    protected double health;


    Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        if (this.health <= 0) {
            System.out.printf("%s: Мертв. Атака невозможна.", this.name);
        }
        System.out.printf("%s: Атакую! ", this.name);
    }

    public void takeDamage(double damage) {
        if (damage > 0) {
            if (damage > this.health) {
                this.health = 0;
            } else {
                this.health -= damage;
            }
            if (this.health <= 0) {
                System.out.printf("%s: Получен невосполнимый урон %.2f hp, здоровья %.2f hp. Смерть.%n", this.name, damage, this.health);
            } else {
                System.out.printf("%s: Получен урон %.2f hp, здоровья осталось %.2f hp.%n", this.name, damage, this.health);
            }
        }
    }
}