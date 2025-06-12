class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Vehicle: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "Sonata");
        Vehicle car1 = new Car("hh", "gg");

        car.display();
    }
}
