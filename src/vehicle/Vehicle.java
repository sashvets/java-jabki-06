package vehicle;

public class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.printf("Запуск двигателя для %s\n", this.brand);
    }
}
