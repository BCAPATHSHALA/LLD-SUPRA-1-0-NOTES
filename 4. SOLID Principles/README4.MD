# Liskov Substitution Principle (LSP)

```java
// Pending picture
```

## 📝 What is LSP?

1. Any `derived` class should be able to substitute its `parent` class without the consumer knowing it.

2. Every part of the code should get the expected result no matter what instance of a class you send to it, given it implements the same interface.

3. If a function takes a `Base` class as parameter then, this code should work for all the `Derived` classes.

4. **LSP** insures that the good application i.e., built using **abstraction** does not break.

5. It states that the objects of a `subclass` should behave the same way as the objects of the `superclass`, such that they are **replaceable**.

6. **Key:** `Child` class should be able to do what a `parent` class can.

7. **Goal:** The goal of **LSP** is to ensure that a `subclass` can stand in for its `superclass`. This principle helps in maintaining the correctness of the program when objects of a superclass are replaced with objects of a subclass.

## In One Statement

The **Liskov Substitution Principle** states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

## Key Idea

You should be able to use any `subclass` where you use its `parent` class.

## Real-Time Examples

You have a remote control that works for all types of `TVs`, regardless of the `brand`.

Where,

- Brand: as a Parent class
- Remote Control: as a feature of Brand
- TVs: as a Child class

# 📝 How can Liskov Substitution Principle be applied?

## 📝 Practical Coding Examples in Java #1

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711627032/LSP_1_zj9aqt.png" alt="Liskov Substitution Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### Violet LSP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711627188/LSP_1.1_fnu0x3.png" alt="Liskov Substitution Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Super Class: Bird
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat() {
        System.out.println("Bird is eating");
    }

    public void walk() {
        System.out.println("Bird is walking");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}

// Subclass: Penguin
class Penguin extends Bird {
    // Exception 1: Penguins cannot fly, so we don't override the fly method
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

// Subclass: Ostrich
class Ostrich extends Bird {
    // Exception 1: Ostriches cannot fly, so we don't override the fly method
    // Exception 2: Ostriches cannot swim, so we don't override the swim method
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

// Subclass: Sparrow
class Sparrow extends Bird {
    // Exception 1: Sparrow cannot swim, so we don't override the swim method
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

}

// Main class
public class Example {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird ostrich = new Ostrich();
        Bird sparrow = new Sparrow();

        // Violet LSP: All subclasses can be substituted for their base class
        penguin.fly(); // Bird is flying
        penguin.eat(); // Penguin is eating
        penguin.walk(); // Penguin is walking
        penguin.swim(); // Penguin is swimming

        ostrich.fly(); // Bird is flying
        ostrich.eat(); // Ostrich is eating
        ostrich.walk(); // Ostrich is walking
        ostrich.swim(); // Bird is swimming

        sparrow.fly(); // Sparrow is flying
        sparrow.eat(); // Sparrow is eating
        sparrow.walk(); // Sparrow is walking
        sparrow.swim(); // Bird is swimming
    }
}
```

#### Why Violet LSP?

- In this example, if the `Penguin`, `Ostrich`, or `Sparrow` subclasses throw **exceptions that are not defined** in the `Bird` superclass, it would violet the LSP.

- This is because code that expects a `Bird` object may not anticipate these additional exceptions, leading to **unexpected behavior** or **runtime errors** when substituting `subclasses` for the `superclass`.

  🧐 If the subclass implementations throw exceptions that are not declared in the superclass, it violates the Liskov Substitution Principle (LSP).

  🧐 Unexpected exceptions thrown by subclasses can lead to runtime errors or unexpected behavior when substituting subclasses for the superclass.

  🧐 To maintain LSP compliance, subclass implementations should adhere to the exception specifications defined by the superclass.

### Not Violet LSP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711627189/LSP_1.2_sfg6ac.png" alt="Liskov Substitution Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Supar Class: Bird
class Bird{
    public void eat(){
        System.out.println("Bird is eating");
    }
    public void walk(){
        System.out.println("Bird is walking");
    }
}

// Interface: IFlyable
interface IFlyable{
    void fly();
}

// Interface: ISwimmable
interface ISwimmable{
    void swim();
}

// Subclass: Sparrow
class Sparrow extends Bird implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

// Subclass: Ostrich
class Ostrich extends Bird {
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

// Subclass: Penguin
class Penguin extends Bird implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class Example{
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();

        sparrow.eat(); // Sparrow is eating
        sparrow.walk(); // Sparrow is walking

        ostrich.eat(); // Ostrich is eating
        ostrich.walk(); // Ostrich is walking

        penguin.eat(); // Penguin is eating
        penguin.walk(); // Penguin is walking
    }
}
```

#### Why Not Violet LSP?

- In this example, the superclass `Bird` has two methods `eat()` and `walk()`. Each subclass (`Sparrow`, `Ostrich`, `Penguin`) extends the `Bird` class and provides its own implementation of the `walk()` and `eat()` methods, which is appropriate behavior according to their specific characteristics.

- Additionally, the `Sparrow` class implements the `IFlyable` interface, and the `Penguin` class implements the `ISwimmable` interface. These interfaces define behaviors specific to `flying` and `swimming`, respectively, and the corresponding subclasses provide appropriate implementations.

- Therefore, the code `adheres` (not violet) to `LSP` as each `subclass` can be substituted for an instance of the `superclass` **Bird** without affecting the expected behavior of the program.

# 🧐 Meaning Of Substitution: Any Derived Class Should Be Able To Substitute Its Parent Class Without The Consumer Knowing It.

1.  This example is demonstrating the principle of substitution. It shows that the `fun` method in the `Bird` class can accept both Bird objects and objects of its subclasses `Sparrow`, `Penguin` & `Ostrich`, and it behaves correctly based on the actual type of the object passed to it.

2.  This aligns with the concept that any `derived` class should be able to substitute its `parent` class without affecting the behavior of the program.

```java
// Supar Class: Bird
class Bird{
    // Consumer: fun method
    public void fun(Bird bird){
        bird.eat();
    }
    public void eat(){
        System.out.println("Bird is eating");
    }
    public void walk(){
        System.out.println("Bird is walking");
    }
}

// Interface: IFlyable
interface IFlyable{
    void fly();
}

// Interface: ISwimmable
interface ISwimmable{
    void swim();
}

// Subclass: Sparrow
class Sparrow extends Bird implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

// Subclass: Ostrich
class Ostrich extends Bird {
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

// Subclass: Penguin
class Penguin extends Bird implements ISwimmable {
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class Example{
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();

        // Meaning Of Substitution: Any derived class should be able to substitute its parent class without the consumer knowing it
        bird.fun(bird); // Bird is eating
        bird.fun(sparrow); // Sparrow is eating
        bird.fun(ostrich); // Ostrich is eating
        bird.fun(penguin); // Penguin is eating
    }
}
```

## 📝 Practical Coding Examples in Java #2

### 📝 Complete Program in Java

```java
// Violet LSP
```

#### Why Violet LSP?

```java
// Not Violet LSP
```

#### Why Not Violet LSP?

## 📝 Practical Coding Examples in Java #3

### 📝 Complete Program in Java

```java
// Violet LSP
```

#### Why Violet LSP?

```java
// Not Violet LSP
```

#### Why Not Violet LSP?
