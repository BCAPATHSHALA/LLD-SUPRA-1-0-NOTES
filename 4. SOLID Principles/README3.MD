# Open-Closed Principle (OCP)

```java
// Pending picture
```

## What is OCP?

1. An entity `(e.g., classes, modules, functions, etc.)` should be open for extension but closed for modification. This means you should be able to add new functionality without changing the existing code.
2. Extend functionality by adding new code instead of changing existing code.
3. **Goal:** Get to a point where you can never break the core of your system.
4. **Importance:** `OCP` encourages a more stable and resilient codebase. It promotes the use of `interfaces` and `abstract classes` to allow for **behaviors to be extended without modifying existing code**.
5. Writing code structure in such a way new functionality can be added by adding new code not by modifying existing code.
6. **OPEN** for `extending` and **CLOSE** for `modification`

## In One Statement:

The Open-Closed Principle states that classes should be open for extension but closed for modification. This means that the behavior of a class should be extendable without modifying its source code.

## Key Idea:

Once a class is written, it should be closed for modifications but open for extensions.

## Real-Time Examples:

1. Your smartphone — you don’t open it up to add features; you just download apps to extend its capabilities.

## How can Open-Closed Principle be applied?

### Practical Coding Examples in Java #1

The UML diagram below depicts the relationship between a `graphic editor` and the `shapes` it can draw.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711539961/violet_OCP_mp4qac.png" alt="How can Open-Closed Principle be applied" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Class representing a graphic editor
public class GraphicEditor {

    // Method to draw a shape
    public void drawShape(Shape s) {
        // Check the type of the shape and call the appropriate drawing method
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawCircle(s);
        }
        // Every time a new shape is added, this method has to change
    }

    // Method to draw a circle
    public void drawCircle(Circle r) {
        // logic to draw a circle
    }

    // Method to draw a rectangle
    public void drawRectangle(Rectangle r) {
        // logic to draw a rectangle
    }
}

// Class representing a shape
public class Shape {
    int type; // Type of the shape
}

// Class representing a rectangle, which is a type of shape
public class Rectangle extends Shape {
    // Constructor to set the type of the shape to 1 (rectangle)
    public Rectangle() {
        super.type = 1;
    }
}

// Class representing a circle, which is a type of shape
public class Circle extends Shape {
    // Constructor to set the type of the shape to 2 (circle)
    public Circle() {
        super.type = 2;
    }
}
```

> When we want to add a new shape for the graphic editor to be able to draw, the method **`drawShape`** in the **`GraphicEditor`** class has to be modified. Such modification is not desirable as it is changing the existing code in order to add a new functionality. This makes the code hard to maintain as the code has to keep changing with more shapes added. More importantly, it could break the program as new changes may lead to undesirable consequences on other classes that also interact with the **`GraphicEditor`** class.

To resolve the issue, we could introduce a layer of `abstraction`, which is the `Shape` interface, between the `GraphicEditor` class and the different shape classes that will implement this interface, as shown below.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711541376/not_violet_OCP_cnnwc3.png" alt="How can Open-Closed Principle be applied" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

When a new shape is added, such as an `oval`, there is no need to modify the code in the `GraphicEditor` class. Instead, we can create a new class for the oval shape that just has to implement the `Shape` interface with its own draw method defined. The code implementation is shown below.

```java
// Class representing a graphic editor
public class GraphicEditor {

    // Method to draw a shape
    public void drawShape(Shape s) {
        s.draw(); // Calls the draw method of the shape
    }
}

// Interface representing a shape
public interface Shape {
    void draw(); // Method to draw the shape
}

// Class representing a rectangle, which implements the Shape interface
public class Rectangle implements Shape {
    // Method to draw a rectangle
    public void draw() {
        // logic to draw a rectangle
    }
}

// Class representing a circle, which implements the Shape interface
public class Circle implements Shape {
    // Method to draw a circle
    public void draw() {
        // logic to draw a circle
    }
}

// Class representing an oval, which implements the Shape interface
public class Oval implements Shape {
    // Method to draw an oval
    public void draw() {
        // logic to draw an oval
    }
}
```

> This implementation method aligns with the open-closed principle as we no longer have to modify any existing code, but instead, we are just extending the code by adding new shape classes that implement the **`Shape`** interface whenever new shapes are introduced for the graphic editor to draw.

## Complete Program in Java

```java
// Class representing a graphic editor
public class GraphicEditor {

    // Method to draw a shape
    public void drawShape(Shape s) {
        s.draw(); // Calls the draw method of the shape
    }
}

// Interface representing a shape
interface Shape {
    void draw(); // Method to draw the shape
}

// Class representing a rectangle, which implements the Shape interface
class Rectangle implements Shape {
    // Method to draw a rectangle
    public void draw() {
        System.out.println("Drawing a rectangle"); // Example logic to draw a rectangle
    }
}

// Class representing a circle, which implements the Shape interface
class Circle implements Shape {
    // Method to draw a circle
    public void draw() {
        System.out.println("Drawing a circle"); // Example logic to draw a circle
    }
}

// Class representing an oval, which implements the Shape interface
class Oval implements Shape {
    // Method to draw an oval
    public void draw() {
        System.out.println("Drawing an oval"); // Example logic to draw an oval
    }
}

// Main class to test the GraphicEditor
public class Main {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();

        // Create shapes
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape oval = new Oval();

        // Draw shapes
        editor.drawShape(rectangle);
        editor.drawShape(circle);
        editor.drawShape(oval);
    }
}
```

### Practical Coding Examples in Java #2

The UML diagram below depicts the relationship between a `ecommerce app` and the `payment processor` it can draw.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711544915/violet_OCP_1_pfveih.png" alt="How can Open-Closed Principle be applied" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
public class EcommerceApp {
    public void payment(PaymentProcessor p) {
        if (p.type == 1) {
            payCredit(p);
        } else if (p.type == 2) {
            payDebit(p);
        }
        // Every time a new payment processor is added, this method has to change
    }
    public void payCredit(CreditCard c) {
        // logic to pay via credit card
    }
    public void payDebit(DebitCard d) {
        // logic to pay via debit card
    }
}

public class PaymentProcessor {
    int type;
}

public class CreditCard extends PaymentProcessor {
    public CreditCard() {
        super.type = 1;
    }
}

public class DebitCard extends PaymentProcessor {
    public DebitCard() {
        super.type = 2;
    }
}
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711543954/not_violet_OCP_1_ok0amb.png" alt="How can Open-Closed Principle be applied" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
public class EcommerceApp {
    public void paymentProcess(PaymentProcessor p) {
        p.payment();
    }
}

// Abstraction layer
Interface PaymentProcessor {
    void payment();
}

public class CreditCard implements PaymentProcessor {
    public void payment() {
        // logic to pay via credit card
    }
}

public class DebitCard implements PaymentProcessor {
    public void payment() {
        // logic to pay via debit card
    }
}

public class UPI implements PaymentProcessor {
    public void payment() {
        // logic to pay via UPI
    }
}
```

## Complete Program in Java

```java
// Class representing an ecommerce application
public class EcommerceApp {

    // Method to process payment using a PaymentProcessor
    public void paymentProcess(PaymentProcessor p) {
        p.payment(); // Calls the payment method of the PaymentProcessor
    }
}

// Abstraction layer
interface PaymentProcessor {
    void payment(); // Method to process payment
}

// Class representing payment via credit card
public class CreditCard implements PaymentProcessor {
    // Method to process payment via credit card
    public void payment() {
        System.out.println("Payment via Credit Card"); // Example logic to pay via credit card
    }
}

// Class representing payment via debit card
public class DebitCard implements PaymentProcessor {
    // Method to process payment via debit card
    public void payment() {
        System.out.println("Payment via Debit Card"); // Example logic to pay via debit card
    }
}

// Class representing payment via UPI
public class UPI implements PaymentProcessor {
    // Method to process payment via UPI
    public void payment() {
        System.out.println("Payment via UPI"); // Example logic to pay via UPI
    }
}

// Main class to test the EcommerceApp
public class Main {
    public static void main(String[] args) {
        EcommerceApp app = new EcommerceApp();

        // Process payments
        PaymentProcessor creditCard = new CreditCard();
        PaymentProcessor debitCard = new DebitCard();
        PaymentProcessor upi = new UPI();

        app.paymentProcess(creditCard);
        app.paymentProcess(debitCard);
        app.paymentProcess(upi);
    }
}
```

# 🧐 I Noticed That OCP Often Indirectly Promotes SRP

There is a relationship between the `Open-Closed Principle (OCP)` and the `Single Responsibility Principle (SRP)` in object-oriented design.

- The Open-Closed Principle (OCP) states that a class should be open for extension but closed for modification. This means that the behavior of a class can be extended without modifying its source code. By adhering to OCP, new functionality can be added by creating new classes that extend the existing ones, rather than modifying the existing classes.

- On the other hand, the Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one job or responsibility. Each class should encapsulate one and only one aspect of functionality.

- When a class adheres to OCP, it often indirectly promotes SRP. This is because by designing classes to be open for extension, you are also implicitly designing them to have a single responsibility. New functionality is added by creating new classes rather than modifying existing ones, ensuring that each class has a clear and specific purpose.

- In essence, OCP encourages modular and extensible design, which tends to lead to classes that adhere to SRP by focusing on specific responsibilities. Therefore, while OCP and SRP are distinct principles, they often complement each other in promoting good object-oriented design practices.

# 📝 Bad Practice for Coding with Examples

     1. 🧔🏻‍♂️ if & switch statement
     2. 🧔🏻‍♂️ Voilet OCP
     3. 🧔🏻‍♂️ Cyclomatic Complexity (Like a tree)
     4. 🧔🏻‍♂️ Downcasting (Child hold the Parent)
     5. 🧔🏻‍♂️ TypeCheckErrors (Like compile time errors)
     6. 🧔🏻‍♂️ Anti Abstraction

# 🧐 Big Picture: Violet and Not Violet SRP & OCP in One Example

### Violet Both SRP and OCP in This Example:

```java
import java.util.ArrayList;
import java.util.List;

/*
Order takes multiples responsibilities:
1. Order's Responsibilities: addItem, totalPrice
2. Not Order's Responsibility: pay
*/
public class Order {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> prices;
    private String status;

    public Order() {
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.status = "open";
    }

    public void addItem(String name, int quantity, double price) {
        items.add(name);
        quantities.add(quantity);
        prices.add(price);
    }

    private double totalPrice() {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += quantities.get(i) * prices.get(i);
        }
        return total;
    }

    // This Responsibility Violet the SRP & OCP
    public void pay(String paymentType, String securityCode) {
        if ("debit".equals(paymentType)) {
            System.out.println("Processing debit payment type");
            System.out.println("Verifying security code: " + securityCode);
            status = "paid";
        } else if ("credit".equals(paymentType)) {
            System.out.println("Processing credit payment type");
            System.out.println("Verifying security code: " + securityCode);
            status = "paid";
        } else {
            throw new RuntimeException("Unknown payment type: " + paymentType);
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Keyboard", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB cable", 2, 5);

        System.out.println(order.totalPrice());
        order.pay("debit", "0372846");
        order.pay("credit", "0372847");
    }
}
```

### Why Violet the SRP & OCP?

1. The `Order` class is responsible for **managing orders**, including **adding items**, **calculating total price**, and **processing payments**.

2. The `pay` method within the `Order` class **handles payment processing**, violating both the **Single Responsibility Principle** (SRP) and the **Open-Closed Principle** (OCP).

3. **Violation of SRP:**

   The `Order` class is responsible for **order management** but also for **payment processing**. This violates the SRP, as the class should have a single reason to change, and handling payment processing is a separate responsibility.

4. **Violation of OCP:**

   The `pay` method directly incorporates payment processing logic within the Order class. **If new payment methods are introduced in the future, this method would need to be modified**, violating the OCP, which states that classes should be open for extension but closed for modification.

### Solution: Not Violet Both SRP and OCP

```java
import java.util.ArrayList;
import java.util.List;

// Encapsulation Order Class
public class Order {
    private List<String> items;
    private List<Integer> quantities;
    private List<Double> prices;
    private String status;

    public Order() {
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.status = "open";
    }

    public void addItem(String name, int quantity, double price) {
        items.add(name);
        quantities.add(quantity);
        prices.add(price);
    }

    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += quantities.get(i) * prices.get(i);
        }
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

// Interface: PaymentProcessor
interface PaymentProcessor {
    void pay(Order order, String securityCode);
}

class DebitPaymentProcessor implements PaymentProcessor {
    @override
    public void pay(Order order, String securityCode) {
        System.out.println("Processing debit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setStatus("paid");
    }
}

class CreditPaymentProcessor implements PaymentProcessor {
    @override
    public void pay(Order order, String securityCode) {
        System.out.println("Processing credit payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setStatus("pending");
    }
}

// New Payment Processor: Does not need to change for adding it (Not violet the OCP)
class UPIPaymentProcessor implements PaymentProcessor {
    @override
    public void pay(Order order, String securityCode) {
        System.out.println("Processing UPI payment type");
        System.out.println("Verifying security code: " + securityCode);
        order.setStatus("failed");
    }
}

class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Keyboard", 1, 50);
        order.addItem("SSD", 1, 150);
        order.addItem("USB cable", 2, 5);

        System.out.println(order.totalPrice());

        // This is upcasting (parent hold the child)
        PaymentProcessor debitCard = new DebitPaymentProcessor();
        PaymentProcessor creditorCard = new CreditPaymentProcessor();
        PaymentProcessor UPI = new UPIPaymentProcessor();

        debitCard.pay(order, "0372846");
        creditorCard.pay(order, "0372847");
        UPI.pay(order, "0372848");
    }
}
```

### Why Not Violet the SRP & OCP?

1. The `Order` class is responsible for **managing order details** such as items, quantities, prices, and status. It encapsulates these responsibilities and **does not handle payment processing**, adhering to the (`SRP`).

2. Payment processing is delegated to classes implementing the `PaymentProcessor` interface. Each payment processor is responsible for processing payments using a specific method (debit card, credit card, etc.).

3. Adding a new payment processor, such as the `UPIPaymentProcessor`, **does not require modification** to the existing code in the `Order` class, adhering to the (`OCP`).
