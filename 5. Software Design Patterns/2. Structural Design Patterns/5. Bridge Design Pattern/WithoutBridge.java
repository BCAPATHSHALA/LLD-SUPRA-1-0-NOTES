// Direct inheritance leads to class explosion
abstract class Shape {
    abstract void draw();
}

// Subclasses for each combination of shape and color
class RedCircle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Red Circle");
    }
}

class BlueSquare extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Blue Square");
    }
}

// Adding a new shape or color requires creating more subclasses!

public class WithoutBridge{
    public static void main(String[] args) {
        Shape redCircle = new RedCircle();
        redCircle.draw();

        Shape blueSquare = new BlueSquare();
        blueSquare.draw();
    }
}