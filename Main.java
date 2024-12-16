abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }
}

class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String brand, String model, int year, int seatingCapacity) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " " + getModel() + " is driving smoothly on the road.");
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " with seating capacity: " + seatingCapacity;
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, String model, int year, int loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " " + getModel() + " is hauling a heavy load.");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " with load capacity: " + loadCapacity + " tons";
    }
}

class VehicleManager {
    public void operateVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.drive();

        // Downcasting
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            System.out.println("Seating Capacity: " + car.getSeatingCapacity());
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("Load Capacity: " + truck.getLoadCapacity() + " tons");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 5); // Upcasting
        Vehicle truck = new Truck("Volvo", "FH16", 2022, 30); // Upcasting

        VehicleManager manager = new VehicleManager();

        // Operating the car
        System.out.println("Car Details:");
        manager.operateVehicle(car);

        System.out.println("\nTruck Details:");
        // Operating the truck
        manager.operateVehicle(truck);
    }
}
