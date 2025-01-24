class Circle {
    private String color;
    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle: Color: " + color + ", X: " + x + ", Y: " + y + ", Radius: " + radius);
    }
}

public class WithoutFlyweight {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 10, 20, 30);
        Circle circle2 = new Circle("Blue", 15, 25, 35);
        Circle circle3 = new Circle("Red", 50, 60, 70);
        
        circle1.draw();
        circle2.draw();
        circle3.draw();
    }
}
