// Step 1: Define the Color hierarchy
// Implementor: Defines the color-related behavior
interface Color {
    void applyColor();
}

// Concrete Implementors: Specific colors
class Red implements Color {
    public void applyColor() {
        System.out.println("Applying Red color");
    }
}

class Blue implements Color {
    public void applyColor() {
        System.out.println("Applying Blue color");
    }
}

// Step 2: Define the Shape hierarchy
// Abstraction: Shape links to Color via composition
abstract class Shape {
    protected Color color; // Bridge to Color (Composition)

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw(); // Abstract method for drawing
}

// Refined Abstractions: Specific shapes
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor(); // Delegate color behavior
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square - ");
        color.applyColor(); // Delegate color behavior
    }
}

// Step 3: Use the Bridge Pattern
public class WithBridge {
    public static void main(String[] args) {
        // Create colors
        Color red = new Red();
        Color blue = new Blue();

        // Create shapes with colors
        Shape redCircle = new Circle(red);
        Shape blueSquare = new Square(blue);

        // Draw shapes
        redCircle.draw(); // Output: Drawing Circle - Applying Red color
        blueSquare.draw(); // Output: Drawing Square - Applying Blue color
    }
}