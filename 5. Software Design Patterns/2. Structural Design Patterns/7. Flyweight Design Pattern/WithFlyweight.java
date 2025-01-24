import java.util.HashMap;
import java.util.Map;

// Flyweight Interface
interface Shape {
    void draw(int x, int y, int radius);
}

// Concrete Flyweight
class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing Circle: Color: " + color + ", X: " + x + ", Y: " + y + ", Radius: " + radius);
    }
}

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    // CACHE/POOL/MEMORY/RAM: SHARED OBJECTS
    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating Circle of color: " + color);
        }
        return circle;
    }
}

// Client
public class WithFlyweight {
    public static void main(String[] args) {
        Shape redCircle = ShapeFactory.getCircle("Red");
        redCircle.draw(10, 20, 30);

        Shape blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw(15, 25, 35);

        Shape anotherRedCircle = ShapeFactory.getCircle("Red");
        anotherRedCircle.draw(50, 60, 70);
    }
}
