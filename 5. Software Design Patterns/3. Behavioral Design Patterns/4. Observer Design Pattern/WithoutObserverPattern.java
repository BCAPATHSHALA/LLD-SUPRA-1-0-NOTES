class WeatherStation {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Weather Station: New temperature is " + temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}

class PhoneDisplay {
    private WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        System.out.println("Phone Display: Temperature updated to " + station.getTemperature());
    }

    public void update() {
        System.out.println("Phone Display: Temperature updated to " + station.getTemperature());
    }
}

public class WithoutObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        new PhoneDisplay(station);

        station.setTemperature(30); // Only updates station, not display
    }
}
