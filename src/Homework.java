import zoo.Animal;
import zoo.Lion;
import zoo.Parrot;
import bank.Account;
import bank.CreditAccount;
import bank.SavingsAccount;
import delivery.DeliveryUtl;
import delivery.Drone;
import delivery.Truck;
import delivery.Vehicle;
import game.Mage;
import game.Warrior;

import java.util.List;
import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        Account account = new Account("30924904249092-04", 1.234);
        account.deposit(00.09999);
        account.withdraw(00.09999);
        account.displayInfo();

        SavingsAccount savingsAccount = new SavingsAccount("327846732678326478326", 0, 14.3);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(100);
        savingsAccount.deposit(100);
        savingsAccount.applyInterest();
        savingsAccount.displayInfo();

        CreditAccount creditAccount = new CreditAccount("327846732678326478326", 0, 10000);
        creditAccount.deposit(100);
        creditAccount.withdraw(3100);
        creditAccount.displayInfo();
        creditAccount.withdraw(7000);
        creditAccount.displayInfo();

        //Создайте массив Account[] accounts с объектами SavingsAccount и CreditAccount.
        //Продемонстрируйте полиморфизм: вызовите withdraw() и displayInfo() для всех элементов массива.
        Account[] accounts =
                {
                        new SavingsAccount("327846732678326478326", 7500, 11.4),
                        new CreditAccount("327846732678326478327", 0, 30000),
                        new SavingsAccount("327846732678326478328", 1000, 11.4),
                        new CreditAccount("327846732678326478329", 0, 1000)
                };
        for (Account acc : accounts) {
            acc.withdraw(1000);
            acc.displayInfo();
        }

        Vehicle vehicle = new Vehicle(1, 1);
        vehicle.deliver("Красноярск");
        Truck truck = new Truck(1, 1);
        truck.deliver("Москва");
        Drone drone = new Drone(1, 1);
        drone.deliver("Джомолунгма");

        DeliveryUtl.startDelivery(truck, "Казань");
        DeliveryUtl.startDelivery(drone, "Камчатка");

        Lion lion = new Lion("Барсик", 5);
        lion.makeSound();
        lion.hunt();
        lion.eat();

        Parrot parrot = new Parrot("Иннокентий", 1);
        parrot.makeSound();
        parrot.eat();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Евгений", 3));
        animals.add(new Parrot("Альфред", 2));
        animals.add(new Lion("Персик", 7));
        animals.add(new Parrot("Гарольд", 4));
        animals.add(new Lion("Фантоций", 5));
        animals.add(new Parrot("Сократ", 1));
        animals.add(new Animal("Звверь", 9));
        for (Animal animal : animals) {
            animal.makeSound();
        }

        Warrior warrior = new Warrior("Пиннокио", 100);
        Mage mage = new Mage("Карабас-Барабас", 100);
        mage.attack();
        warrior.block();
        warrior.takeDamage(50);
        mage.attack();
        warrior.takeDamage(50);
        warrior.attack();
        mage.takeDamage(50);
        mage.heal(30);
        mage.attack();
        warrior.takeDamage(50);
    }
}