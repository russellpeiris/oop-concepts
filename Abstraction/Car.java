package Abstraction;

public class Car extends Vehicle {
    private String color;

    public Car(String model, String color) {
        super(model);
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car.");
    }

    public void displayCarDetails() {
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + color);
    }
}
