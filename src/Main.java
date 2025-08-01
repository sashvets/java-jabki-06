import animal.Animal;
import animal.Dog;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import vehicle.Car;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();

        Animal doggy = new Dog();
        doggy.speak();

        Vehicle vehicle = new Vehicle("Камаз");
        vehicle.startEngine();

        Car car = new Car("Лада", "Нива");
        car.startEngine();

        Shape[] shapes = {new Circle(), new Rectangle(), new Shape()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}