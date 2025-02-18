// Step 1: Command Interface
interface Command {
    void execute();
}

// Step 2: Concrete Commands
class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.turnOff();
    }
}

// Step 3: Receiver (Light)
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Step 4: Invoker (Switch)
class Switch {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        command.execute();
    }
}

// Step 5: Client
public class WithCommandPattern {
    public static void main(String[] args) {
        Light light = new Light();
        
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        
        Switch switchBtn = new Switch();
        
        switchBtn.setCommand(lightOn);
        switchBtn.pressButton();  // Light is ON
        
        switchBtn.setCommand(lightOff);
        switchBtn.pressButton();  // Light is OFF
    }
}
