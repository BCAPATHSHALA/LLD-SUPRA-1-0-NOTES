import java.util.ArrayList;
import java.util.List;

// Step 1: Observer Interface
interface Observer {
    void update(int temperature);
}

// Step 2: Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Step 3: Concrete Subject (WeatherStation)
class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: Temperature updated to " + temperature);
        notifyObservers(); // Notify all observers when temperature changes
    }
}

// Step 4: Concrete Observer (Phone Display)
class PhoneDisplay implements Observer {
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " Display: Temperature updated to " + temperature);
    }
}

// Step 5: Client Code
public class WithObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone1 = new PhoneDisplay("Phone 1");
        PhoneDisplay phone2 = new PhoneDisplay("Phone 2");

        station.addObserver(phone1);
        station.addObserver(phone2);

        station.setTemperature(30); // Notifies all registered observers
        station.setTemperature(35); // Notifies all observers again
    }
}

/*
OUTPUT:
Weather Station: Temperature updated to 30
Phone 1 Display: Temperature updated to 30
Phone 2 Display: Temperature updated to 30
Weather Station: Temperature updated to 35
Phone 1 Display: Temperature updated to 35
Phone 2 Display: Temperature updated to 35
*/
