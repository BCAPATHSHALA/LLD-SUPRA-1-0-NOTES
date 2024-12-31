// Step 1: Prototype Interface
interface Prototype {
    Prototype clone();
    public void setEngine(CarEngine carEngine);
    public void setModel(int model);
}

class CarEngine {
    public CarEngine() {}
    public CarEngine(CarEngine carEngine) {
        // Write logic here to copy the object
        System.out.println("Copy Constructor Called");
    }
}


// Step 2: Base Class for Cars
abstract class Car implements Prototype {
    String color;
    int wheels;
    int velocity;

    public Car(String color, int wheels, int velocity) {
        this.color = color;
        this.wheels = wheels;
        this.velocity = velocity;
    }

    // Implement clone method
    @Override
    public abstract Car clone();

    // Implement setEngine method
    @Override
    public abstract void setEngine(CarEngine carEngine);

    // Implement setModel method
    @Override
    public abstract void setModel(int model);
}

// Step 3: RaceCar Class
class RaceCar extends Car {
    int model;
    CarEngine carEngine;
    int speed;

    public RaceCar() {
        super("RED", 4, 100);
        this.model = 2020; 
        this.carEngine = new CarEngine(); 
        this.speed = 200; 
    }

    private RaceCar(CarEngine carEngine, int model) {     
        super("RED", 4, 100);
        this.model = model;
        this.carEngine = new CarEngine(carEngine); // Deep Copy - Copy Construtor
    }

    @Override
    public RaceCar clone() {
        return new RaceCar(this.carEngine, this.model);
    }

    @Override
    public void setEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }   
    
    @Override
    public void setModel(int model) {
        this.model = model;
    }
}

// Step 3: VintageCar Class
class VintageCar extends Car {
    int model;
    CarEngine carEngine;

    public VintageCar() {
        super("BLUE", 4, 200);
        this.model = 2024; 
        this.carEngine = new CarEngine();
    }

    private VintageCar(CarEngine carEngine, int model) {
        super("BLUE", 4, 200);
        this.model = model;
        this.carEngine = new CarEngine(carEngine);
    }

    @Override
    public VintageCar clone() {
        return new VintageCar(this.carEngine, this.model);
    }

    @Override
    public void setEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public void setModel(int model) {
        this.model = model;
    }
}

// Step 4: Client Code
public class PrototypePatternClient {
    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar();
        VintageCar vintageCar = new VintageCar();

        RaceCar clonedRaceCar = raceCar.clone();
        VintageCar clonedVintageCar = vintageCar.clone();

        System.out.println(clonedRaceCar.model); // 2020
        System.out.println(clonedVintageCar.model); // 2024

        // We can change the properties of cloned objects
        clonedRaceCar.setEngine(new CarEngine());
        clonedRaceCar.setModel(2021);

        clonedVintageCar.setEngine(new CarEngine());
        clonedVintageCar.setModel(2025);

        System.out.println(clonedRaceCar.model); // 2021
        System.out.println(clonedVintageCar.model); // 2025
    }
}
