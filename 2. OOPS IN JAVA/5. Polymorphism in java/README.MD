# Polymorphism in Java

The word polymorphism means, having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.

- **`A real-life example:`** of polymorphism is that a person at the same time can have different characteristics.

**Like** a `man` at the same time can be a `father`, a `husband`, and an `employee`. So the same person posses different behaviour in different situations. This is called polymorphism.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710059451/POLYMORPHISM_IN_JAVA_zcrzbq.png" alt="Polymorphism in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

## 📝 What is Polymorphism?

1. Similar to Polymorphism in Life.
2. Polymorphism means many forms.
3. The ability of a single function or operator to work in different ways based on the object it is acting upon or actual need.
4. A phenomenon that allows an object to have several different forms and behaviours.

## 📝 Types of Polymorphism

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710060231/TYPES_OF_POLYMORPHISM_IN_JAVA_eudugb.png" alt="Polymorphism in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

# 📝 Static Polymorphism (Compile Time)

Compile time polymorphism is further divided into two parts **Method Overloading** and **Operator Overloading**.

## 1. Method Overloading:

Early binding or Compile time polymorphism can be achieved by resolving the methods. The compiler resolves which method should be used based on the `signature` and `number of parameters` at compile time only.

### Why Method Overloading

Method overloading increases the `readability` and `maintainability` of the Java Program as we don't need to write separate method names performing same operations on different numbers or types of arguments.

### Method Overloading Example 1: Changing Number of Parameters

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum (2 params): " + calculator.add(5, 7));
        System.out.println("Sum (3 params): " + calculator.add(2, 4, 6));
    }
}
/*
Expected output:
Sum (2 params): 12
Sum (3 params): 12
*/
```

### Method Overloading Example 2: Changing Data Type of Parameters

```java
public class Converter {
    public double convertToDouble(int num) {
        return (double) num;
    }

    public int convertToInt(double num) {
        return (int) num;
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("Converted to Double: " + converter.convertToDouble(25));
        System.out.println("Converted to Int: " + converter.convertToInt(10.5));
    }
}
/*
Expected output:
Converted to Double: 25.0
Converted to Int: 10
*/
```

### Method Overloading Example 3: with Inheritance Concept

```java
class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {

    void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog myDog = new Dog();
        myDog.makeSound(3); // Call to overloaded method in the subclass
    }
}

/*
Expected output:
Generic Animal Sound
Woof!
Woof!
Woof!
*/
```

## 2. Operator Overloading

In Java, operator overloading is not supported for user-defined classes. However, built-in data types, such as `+` for addition and `*` for multiplication, exhibit polymorphic behavior based on their context.

# 📝 Dynamic Polymorphism (Runtime)

Runtime polymorphism is further divided into two parts **Method Overriding** and **Dynamic Method Dispatch (Upcasting)**.

## 1. Method Overriding

`Method overriding` occurs when a **subclass** provides a specific implementation for a method that is already defined in its **superclass**.

The `overridden method` in the **subclass** should have the **same signature** **(`name`, `return type`, and `parameters`)** as the method in the **superclass**.

### Where to Use and When to Use Method Overriding

In method overriding actual method is resolved at run time. When we have the same name method in Parent and Children class, then this conflict is resolved at the run time.

Method overriding is used to provide a specific implementation of a method that is already provided by its superclass.

**Two rules must be followed to override the method:**

1. Methods in parent and children class must have the same name.
2. Methods in parent and children class must have the same signature(data type, number of parameters).

### Method Overriding Example

```java
class Shape {
    // Method to calculate the area of the shape
    double area() {
        return 0.0; // Default implementation for a generic shape
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method for Circle
    @Override
    double area() {
        return Math.PI * radius * radius; // Area of a circle formula
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method for Rectangle
    @Override
    double area() {
        return length * width; // Area of a rectangle formula
    }
}

public class Main {
    public static void main(String[] args) {
        Circle shape1 = new Circle(5.0);
        Rectangle shape2 = new Rectangle(4.0, 6.0);

        // Polymorphic calls to the overridden area method
        System.out.println("Area of Circle: " + shape1.area());
        System.out.println("Area of Rectangle: " + shape2.area());
    }
}

/*
Expected output:
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
*/
```

## 2. Dynamic Method Dispatch (Upcasting)

A **superclass reference variable** can refer to a **subclass object** and dynamic dispatch is used to resolve the called method at runtime.

### Dynamic Method Dispatch Example

```java
class Shape {
    // Method to calculate the area of the shape
    double area() {
        return 0.0; // Default implementation for a generic shape
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method for Circle
    @Override
    double area() {
        return Math.PI * radius * radius; // Area of a circle formula
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method for Rectangle
    @Override
    double area() {
        return length * width; // Area of a rectangle formula
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Creating Shape references pointing to Circle and Rectangle objects
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);

        // Polymorphic calls to the overridden area method
        System.out.println("Area of Circle: " + giveAreaStuff(shape1));
        System.out.println("Area of Rectangle: " + giveAreaStuff(shape2));
    }

    public static double giveAreaStuff(Shape shape){
        return shape.area();
    }
}

/*
Expected output:
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
*/
```

# 📝 Downcasting in Java

Downcasting is the process of casting a reference of a **superclass** type to its **subclass** type. It must be **explicitly** done by the programmer and requires checking and handling potential `ClassCastException`.

```java
class Animal {
    void sound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }

    void playFetch() {
        System.out.println("Dog is playing fetch");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Creating Animal reference pointing to a Dog object
        Animal myAnimal = new Dog();

        // Downcasting: Checking type and converting the reference back to Dog
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;

            // Calling overridden method
            myDog.sound();

            // Calling subclass-specific method
            myDog.playFetch();
        }
    }
}

/*
Expected output:
Woof! Woof!
Dog is playing fetch
*/
```

> It's important to use `instanceof` to avoid `ClassCastException` errors when `downcasting`.

# 📝 Important Notes

- **Can we override static method?**

  We can not override the static method because static methods do not belong to objects, it resides in the Class memory area and We can not override class methods as they are shared among all the objects.

- **Can we override the main method?**

  We can not override the main method because main is a static method.

# 📝 Difference Between Method Overloading and Method Overriding in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710066302/Difference_Between_Method_Overloading_and_Method_Overriding_in_Java_w7wpz1.png" alt="Polymorphism in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>
