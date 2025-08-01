package vehicle;

public class Car extends Vehicle {

    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Проверка ремней безопасности %s\n", this.model);
    }
}
