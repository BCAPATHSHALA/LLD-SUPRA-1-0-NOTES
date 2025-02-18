class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class Switch {
    private Light light;
    
    public Switch(Light light) {
        this.light = light;
    }
    
    public void pressOn() {
        light.turnOn();
    }
    
    public void pressOff() {
        light.turnOff();
    }
}

public class WithoutCommandPattern {
    public static void main(String[] args) {
        Light light = new Light();
        Switch switchBtn = new Switch(light);
        
        switchBtn.pressOn(); // Light is ON
        switchBtn.pressOff(); // Light is OFF
    }
}
