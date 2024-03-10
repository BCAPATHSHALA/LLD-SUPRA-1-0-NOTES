# Abstraction in Java

## 📝 What is Abstraction?

1. Delivering only essential information to the outer world while masking the background details.
2. It is a design and programming method that separates the interface from the implementation.
3. Real life e.g., various functionalities of `AirPods` but don't know the actual implementation/working
4. To drive a `car`, one only needs to know the driving process and not the mechanics of the car engine

**Another way,** it shows only essential things to the user and hides the internal details, for example, sending `SMS` where you type the text and send the message. You don't know the internal processing about the message delivery.

## 📝 Abstraction in Java Collections

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExampleWithSort {
    public static void main(String[] args) {
        // Abstraction using ArrayList and sorting

        // Declaration and instantiation of an ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Mango");

        // Displaying unsorted ArrayList
        System.out.println("Fruits in the ArrayList (unsorted):");
        displayFruits(fruits);

        // Sorting the ArrayList
        Collections.sort(fruits);

        // Displaying sorted ArrayList
        System.out.println("\nFruits in the ArrayList (sorted):");
        displayFruits(fruits);
    }

    // Helper method to display elements of the ArrayList
    private static void displayFruits(List<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

/*
Expected output:
Fruits in the ArrayList (unsorted):
Apple
Banana
Orange
Kiwi
Mango

Fruits in the ArrayList (sorted):
Apple
Banana
Kiwi
Mango
Orange
*/
```

In this example, we use the `ArrayList` class and `sort()` method from the Java Collections Framework to demonstrate abstraction. The users of the ArrayList and sort don't need to know the internal details of how elements are stored or manipulated or sorted.

## 📝 Ways to Achieve Abstraction

Abstraction can be achieved in Java through the use of **`classes`**, **`abstract classes`**, and **`interfaces`**.

These mechanisms enable the separation of concerns and provide a clear distinction between what an object does and how it achieves its functionality.

## 📝 Abstraction Using Classes (Encapsulation)

- Classes in Java encapsulate data and behavior, promoting a level of abstraction.

- Grouping data members and member functions into classes using access specifiers.

- A class can choose which data members are visible to the outside world and which are hidden.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708951971/OWN%20IMAGES/encapsulation_in_java_tsiu3v.png" alt="Encapsulation in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

## 📝 Abstraction Using Abstract Class

- An abstract class in Java is a class that cannot be instantiated on its own. It serves as a superclass for other classes and that share a common structure or behaviour.

- An abstract class in Java delivers abstraction by serving as a template for its subclasses, allowing for the definition of a common interface without specifying the complete implementation details.

- It has come from the idea of Abstraction.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710071677/ABSTRACT_CLASS_IN_JAVA_qadwwn.png" alt="Abstraction Using Abstract Class in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710071677/ABSTRACT_METHOD_IN_JAVA_zacpi9.png" alt="Abstract Method in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Abstract class representing the abstraction of a bird
abstract class Bird {
    // Abstract method for flying
    public abstract void fly();

    // Abstract method for eating
    public abstract void eat();
}

// Concrete subclass representing a Sparrow, extending from Bird
class Sparrow extends Bird {
    // Implementation of the fly method specific to Sparrow
    @Override
    public void fly() {
        System.out.println("Sparrow is flying swiftly");
    }

    // Implementation of the eat method specific to Sparrow
    @Override
    public void eat() {
        System.out.println("Sparrow is pecking at seeds");
    }
}

// Concrete subclass representing a Crow, extending from Bird
class Crow extends Bird {
    // Implementation of the fly method specific to Crow
    @Override
    public void fly() {
        System.out.println("Crow is gliding through the air");
    }

    // Implementation of the eat method specific to Crow
    @Override
    public void eat() {
        System.out.println("Crow is scavenging for food");
    }
}

// Main class to demonstrate abstraction using an abstract class
public class Main {
    public static void main(String[] args) {
        // Creating instances of Sparrow and Crow
        Sparrow sparrow = new Sparrow();
        Crow crow = new Crow();

        // Demonstrating abstraction through the common interface (fly and eat methods)
        System.out.println("=== Sparrow ===");
        sparrow.fly();
        sparrow.eat();

        System.out.println("\n=== Crow ===");
        crow.fly();
        crow.eat();
    }
}
/*
Expected output:
=== Sparrow ===
Sparrow is flying swiftly
Sparrow is pecking at seeds

=== Crow ===
Crow is gliding through the air
Crow is scavenging for food
*/
```

## 📝 Abstraction Using Interface (New Way to Design Strategy)

1. Abstraction divides code into two categories: **interface** and **implementation**. So, when creating your component, keep the interface separate from the implementation so that if the underlying implementation changes, the interface stays the same.

2. In this instance, any program that uses these interfaces would remain **unaffected** and would require recompilation with the most recent implementation.

3. Makes code modular and maintainable.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710072589/INTERFACE_IN_JAVA_pvy5ov.png" alt="Abstraction Using Interface" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710072861/INTERFACE_IN_JAVA_ABSTRACTION_ylccia.png" alt="Abstraction Using Interface" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Interface representing the abstraction of a bird
interface Bird {
    // Abstract method for flying
    void fly();

    // Abstract method for eating
    void eat();
}

// Concrete class representing a Sparrow, implementing the Bird interface
class Sparrow implements Bird {
    // Implementation of the fly method specific to Sparrow
    @Override
    public void fly() {
        System.out.println("Sparrow is flying swiftly");
    }

    // Implementation of the eat method specific to Sparrow
    @Override
    public void eat() {
        System.out.println("Sparrow is pecking at seeds");
    }
}

// Concrete class representing a Crow, implementing the Bird interface
class Crow implements Bird {
    // Implementation of the fly method specific to Crow
    @Override
    public void fly() {
        System.out.println("Crow is gliding through the air");
    }

    // Implementation of the eat method specific to Crow
    @Override
    public void eat() {
        System.out.println("Crow is scavenging for food");
    }
}

// Main class to demonstrate abstraction using an interface
public class Main {
    public static void main(String[] args) {
        // Creating instances of Sparrow and Crow
        Sparrow sparrow = new Sparrow();
        Crow crow = new Crow();

        // Demonstrating abstraction through the common interface (fly and eat methods)
        System.out.println("=== Sparrow ===");
        sparrow.fly();
        sparrow.eat();

        System.out.println("\n=== Crow ===");
        crow.fly();
        crow.eat();
    }
}

/*
Expected output:
=== Sparrow ===
Sparrow is flying swiftly
Sparrow is pecking at seeds

=== Crow ===
Crow is gliding through the air
Crow is scavenging for food
*/
```

## 📝 Upcasting in Abstraction

```java
// Interface representing the abstraction of a bird
interface Bird {
    // Abstract method for flying
    void fly();

    // Abstract method for eating
    void eat();
}

// Concrete class representing a Sparrow, implementing the Bird interface
class Sparrow implements Bird {
    // Implementation of the fly method specific to Sparrow
    @Override
    public void fly() {
        System.out.println("Sparrow is flying swiftly");
    }

    // Implementation of the eat method specific to Sparrow
    @Override
    public void eat() {
        System.out.println("Sparrow is pecking at seeds");
    }
}

// Concrete class representing a Crow, implementing the Bird interface
class Crow implements Bird {
    // Implementation of the fly method specific to Crow
    @Override
    public void fly() {
        System.out.println("Crow is gliding through the air");
    }

    // Implementation of the eat method specific to Crow
    @Override
    public void eat() {
        System.out.println("Crow is scavenging for food");
    }
}

// Main class to demonstrate abstraction using an interface
class Main {
    public static void main(String[] args) {
        // Upcasting: Creating instances of Sparrow and Crow
        Bird sparrow = new Sparrow();
        Bird crow = new Crow();

        // Demonstrating abstraction through the common interface (fly and eat methods)
        System.out.println("=== Sparrow ===");
        doBirdStuff(sparrow);

        System.out.println("\n=== Crow ===");
        doBirdStuff(crow);
    }

    public static void doBirdStuff(Bird bird){
        bird.fly();
        bird.eat();
    }
}

/*
Expected output:
=== Sparrow ===
Sparrow is flying swiftly
Sparrow is pecking at seeds

=== Crow ===
Crow is gliding through the air
Crow is scavenging for food
*/
```

## 📝 Real World Examples of Abstraction

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710073770/REAL_WORLD_EXAMPLE_OF_ABSTARCTION_IN_JAVA_wweahy.png" alt="Abstraction Using Interface" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1710074622/REAL_WORLD_EXAMPLE_OF_ABSTARCTION_IN_JAVA_1_qxdgqr.png" alt="Abstraction Using Interface" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

## 📝 Abstract Class vs Interface

### Abstract Class:

- `Method type:` can have both abstract and concrete methods.
- `Variable:` allows the definition of instance variables.
- `Constructor:` supports constructors.
- `Access Modifiers:` supports all access modifiers for methods.
- `Where to use:` to avoid the independence
- `Speed:` fast

### Interface:

- `Method type:` can only have abstract methods (before Java 8).
- `Variable:` cannot have instance variables (before Java 8).
- `Constructor:` does not support constructors.
- `Access Modifiers:` methods are implicitly public.
- `Where to use:` for future enhancement
- `Speed:` slow

## 📝 Advantages of Abstraction

### 😊 Simplifies Complexity:

Abstraction simplifies the programming model by focusing on essential features and hiding unnecessary details.

### 🧑‍💻 Promotes Code Reusability (Avoid Code Duplication):

By defining common interfaces and abstract classes, code can be reused across different implementations.

### 🙎🏻 Enhances Maintainability (Loose Coupling):

Changes to the internal implementation of a class do not affect the users as long as the interface remains unchanged.

### 🔐 Increase Security:

Abstraction enhances security by controlling access to sensitive data and functionalities in a well-defined manner.

## 📝 Achieve Multiple Inheritance Using Interface

```java
// Example demonstrating multiple inheritance using interfaces

// First interface
interface Flying {
    void fly();
}

// Second interface
interface Swimming {
    void swim();
}

// Concrete class implementing both interfaces
class Bird implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}

/*
Expected output:
Bird is flying
Bird is swimming
*/
```
