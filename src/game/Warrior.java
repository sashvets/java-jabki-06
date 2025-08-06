package game;

public class Warrior extends Character {
    private boolean blocked;

    public Warrior(String name, double health) {
        super(name, health);
        this.blocked = false;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Мечом в лицо!");
    }

    public void block() {
        this.blocked = true;
        System.out.printf("%s: Поднят щит!%n", name);
    }

    @Override
    public void takeDamage(double damage) {
        if (damage > 0) {
            double local_damage = this.blocked ? damage * 0.3 : damage;
            super.takeDamage(local_damage);
        }
        if (this.blocked == true) {
        this.blocked = false;
        System.out.printf("%s: Щит опущен.%n", name);}
    }
}