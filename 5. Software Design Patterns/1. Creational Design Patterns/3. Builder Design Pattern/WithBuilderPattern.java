// Step 1: Product Class
class Car {
    private String engine;
    private String wheels;
    private String seats;
    private String color;

    public void setEngine(String engine) { this.engine = engine; }
    public void setWheels(String wheels) { this.wheels = wheels; }
    public void setSeats(String seats) { this.seats = seats; }
    public void setColor(String color) { this.color = color; }

    public void showDetails() {
        System.out.println("Car with Engine: " + engine + ", Wheels: " + wheels + ", Seats: " + seats + ", Color: " + color);
    }
}

// Step 2: Builder Interface
interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildSeats();
    void buildColor();
    Car getCar();
}

// Step 3: Concrete Builder
class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        car = new Car();
    }

    // Step by step construction of the car
    @Override
    public void buildEngine() { car.setEngine("V8"); }
    @Override
    public void buildWheels() { car.setWheels("Sports Alloy"); }
    @Override
    public void buildSeats() { car.setSeats("Racing Seats"); }
    @Override
    public void buildColor() { car.setColor("Red"); }
    @Override
    public Car getCar() { return car; }
}

// Step 4: Director
class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    // Method to construct the car 
    public Car constructCar(boolean wantColor) {
        if (wantColor) {
            builder.buildColor();
        }
        builder.buildEngine();
        builder.buildWheels();
        builder.buildSeats();
        return builder.getCar();
    }
}

// Step 5: Client Code
public class WithBuilderPattern {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        Director director = new Director(builder);

        Car car = director.constructCar(true);
        car.showDetails(); // Output: Car with Engine: V8, Wheels: Sports Alloy, Seats: Racing Seats, Color: Red
    }
}
