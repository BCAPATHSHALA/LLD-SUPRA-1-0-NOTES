# Interface Segregation Principle (ISP)

```java
// Pending picture
```

## What is ISP?

1. The Interface Segregation Principle (ISP) is a design principle that does not recommend having methods that an interface would not use and require.

2. Therefore, it goes against having fat interfaces in classes and prefers having small interfaces with a group of methods, each serving a particular purpose.

3. To comply with the Interface Segregation Principle (ISP), it's important to design interfaces that are tailored to specific client needs instead of creating broad, all-purpose interfaces.

4. Do not build one pet interface (large interface) make smaller and specific ones.

## In One Statement

This principle encourages the creation of small, more client-specific interfaces.

## Key Idea

`ISP:` Create a different interface for each responsibility; don't group unrelated behavior into one interface.

`LSP:` Requires you to ensure that all child classes have the same behavior as the parent class.

## Real-Time Examples

You sign up for a music streaming service and only choose the genres you like, not all available genres.

# How can Interface Segregation Principle be applied?

## 📝 Practical Coding Examples in Java #1

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711690051/ISP_1_agao5t.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### Violet ISP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711690051/ISP_1.1_ausjlz.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Large Interface: IWorker
interface IWorker{
    void work();
    void eat();
}

class Human implements IWorker{
    @Override
    public void work() {
        System.out.println("Human (Manager) can work");
    }

    @Override
    public void eat() {
        System.out.println("Human (Manager) can eat");
    }
}

class Robot implements IWorker{
    @Override
    public void work() {
        System.out.println("Robot can work");
    }
    @Override
    public void eat() {
        // Robots don't eat, so this method should not be here (Violet ISP)
        System.out.println("Robot can't eat");
    }
}

public class Example {
    public static void main(String[] args) {
        IWorker human = new Human();
        IWorker robot = new Robot();

        // Human not violet ISP
        human.work(); // Human (Manager) can work
        human.eat(); // Human (Manager) can eat

        // Robot violet ISP
        robot.work(); // Robot can work
        robot.eat(); // Robot can't eat
    }
}
```

### Not Violet LSP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711690051/ISP_1.2_dfn9nv.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Small Interface: IWorkable
interface IWorkable{
    void work();
}

// Small Interface: IEatable
interface IEatable{
    void eat();
}

class Human implements IWorkable, IEatable {
    @Override
    public void work() {
        System.out.println("Human (Manager) can work");
    }

    @Override
    public void eat() {
        System.out.println("Human (Manager) can eat");
    }
}

class Robot implements IWorkable{
    @Override
    public void work() {
        System.out.println("Robot can work");
    }
}

public class Example {
    public static void main(String[] args) {
        IWorkable humanWork = new Human();
        IEatable humanEat = new Human();
        IWorkable robotWork = new Robot();

        // Human not violet ISP
        humanWork.work(); // Human (Manager) can work
        humanEat.eat(); // Human (Manager) can eat

        // Robot not violet ISP
        robotWork.work(); // Robot can work
    }
}
```

## 📝 Practical Coding Examples in Java #2

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711694667/ISP_2_cfb8u7.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### Violet LSP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711694669/ISP_2.1_eoz1zy.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Large Interface: Shape
interface Shape{
    double area();
    double volume();
}

class Square implements Shape {
    @Override
    public double area() {
        System.out.println("Square have area");
        double area = 1.2;
        return area;
    }
    @Override
    public double volume() {
        // Square don't have volume, so this method should not be here (Violet ISP)
        System.out.println("Square does not have volume");
        double volume = 2.1;
        return volume;
    }
}

class Cube implements Shape{
    @Override
    public double area() {
        System.out.println("Cube have area");
        double area = 2.5;
        return area;
    }
    @Override
    public double volume() {
        System.out.println("Cube have surface area");
        double volume = 3.5;
        return volume;
    }
}

public class Example {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape cube = new Cube();

        // Square violet ISP
        square.area(); // Square have area
        square.volume(); // Square does not have volume

        // Cube not violet ISP
        cube.area(); // Cube have area
        cube.volume(); // Cube have surface area
    }
}
```

### Not Violet LSP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711694665/ISP_2.2_ne1qdp.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Large Interface: Shape
interface Shape{
    void display(double val);
}

// Small Interface: ITwoDShape
interface ITwoDShape extends Shape{
    double area();
}

// Small Interface: IThreeDShape
interface IThreeDShape extends Shape{
    double volume();
}

class Square implements ITwoDShape {
    private double side;
    Square(double side){
        this.side = side;
    }

    @Override
    public void display(double area) {
        System.out.printf("Square have area: %f", area);
    }

    @Override
    public double area() {
        double area = side*side;
        return area;
    }
}

class Cube implements IThreeDShape {
    private double side;
    Cube(double side){
        this.side = side;
    }

    @Override
    public void display(double volume) {
        System.out.printf("Cube has volume: %f", volume);
    }

    @Override
    public double volume() {
        double volume = side*side*side;
        return volume;
    }
}

public class Example {
    public static void main(String[] args) {
        ITwoDShape square = new Square(2.1);
        IThreeDShape cube = new Cube(4);

        // Square violet ISP
        double area = square.area();
        square.display(area); // Square have area: 4.410000

        // Cube violet ISP
        double volume = cube.volume();
        cube.display(volume); // Cube has volume: 64.000000
    }
}
```
