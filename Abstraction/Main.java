package Abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota Corolla", "Red");
        car1.drive();
        // car.displayCarDetails(); // This will not work because the reference is of type Vehicle

        Car car2 = new Car("Honda Civic", "Blue");
        car2.drive();
        car2.displayCarDetails();
    }
}
