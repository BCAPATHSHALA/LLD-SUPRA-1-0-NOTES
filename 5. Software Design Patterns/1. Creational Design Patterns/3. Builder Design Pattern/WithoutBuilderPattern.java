// Product Class
class Car {
    private String engine;
    private String wheels;
    private String seats;
    private String color;

    // Construct a car with engine, wheels and seats
    public Car(String engine, String wheels, String seats, String color) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.color = color;
    }

    public void showDetails() {
        System.out.println("Car with Engine: " + engine + ", Wheels: " + wheels + ", Seats: " + seats + ", Color: " + color);
    }
}

// Client Code
public class WithoutBuilderPattern {
    public static void main(String[] args) {
        Car car = new Car("V6", "MRF", "Leather", "Red");
        car.showDetails(); // Car with Engine: V6, Wheels: MRF, Seats: Leather, Color: Red
    }
}

/*
Problems:
- The constructor becomes difficult to manage with more parameters.
- Hard to read and maintain the code when object creation logic changes.
- Object creation logic is tightly coupled with the client code.
*/