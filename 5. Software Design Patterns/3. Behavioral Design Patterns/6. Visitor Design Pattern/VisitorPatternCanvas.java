// Step 1: Element Interface
interface Shape {
    void accept(DrawingVisitor visitor);
}

// Step 2: Concrete Elements (Shapes)
class Square implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}

class Rectangle implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}

// Todo 1: New Shape: Circle
class Circle implements Shape {
    @Override
    public void accept(DrawingVisitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}

// Step 3: Visitor Interface
interface DrawingVisitor {
    void visit(Square square);
    void visit(Rectangle rectangle);
    void visit(Circle circle); // Todo: Update Visitor Interface -> New Method for Circle
}


// Step 4: Concrete Visitor (Drawing Implementation)
class CanvasDrawingVisitor implements DrawingVisitor {
    @Override
    public void visit(Square square) {
        System.out.println("Drawing a Square");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a Circle"); // Todo 3: Update Concrete Visitor -> Added new behavior without modifying old shapes
    }
}


// Step 5: Client Code
public class VisitorPatternCanvas {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle(); // Todo 4: New shape added
        DrawingVisitor visitor = new CanvasDrawingVisitor();

        square.accept(visitor); // First Dispatch (Square -> accept()), Second Dispatch (Visitor -> visit(Square))
        rectangle.accept(visitor);
        circle.accept(visitor); // Todo 4: Works without modifying old code
    }
}
