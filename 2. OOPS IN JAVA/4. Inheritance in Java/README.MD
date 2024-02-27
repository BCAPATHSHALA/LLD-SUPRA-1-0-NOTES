# Inheritance in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709038777/OWN%20IMAGES/inheritance_moeept.png" alt="Inheritance in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

## 📝What is Inheritance?

- `🧬 Inheritance` allows a class to inherit **properties** and **behaviors** from another class.

- `👨‍👧 Parent Class` the class that is being inherited from is called the **superclass**, **base**, or **parent** class.

- `👶 Child Class` the class that inherits is called the **derived**, **subclass**, **child**, or **extended** class.

- `🔄 Reusability Code` This mechanism promotes code reusability and establishes an **"IS-A"** relationship between classes.

## 📝When do we use Inheritance?

- Inheritance is used when there is a relationship between two classes, and the subclass wants to reuse the code of the superclass.

- It is particularly useful when **common** attributes and behaviors exist in a group of related classes, allowing for a more modular and organized code structure.

- **In short**, use inheritance whenever an **IS-A** relationship is identified between objects.

## 📝General `IS-A` Example

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709040332/OWN%20IMAGES/IS_A_AND_HAS_A_RELATIONSHIP_IN_JAVA_gjptgl.png" alt="Inheritance in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

`🎗️Example 1:`

```java
class Lady {
    // common attributes and methods
}

class Mother extends Lady {
    // additional attributes and methods specific to Mother
}
```

> In this example, Mother `IS-A` type of Lady

`🎗️Example 2:`

```java
class Bike {
    // common attributes and methods
}

class TVS extends Bike {
    // additional attributes and methods specific to TVS
}
```

> In this example, TVS `IS-A` type of Bike

## 📝Advantages of Inheritance

- **🔄 Code Reusability: `Inheritance`**

  Avoids duplicating methods in child classes that already exist in parent classes.

- **✏️ Code Modification: `Method Overriding`**

  Subclasses can provide a specific implementation for methods inherited from the superclass, allowing for customization.

- **🤐 Data Hiding: `Polymorphism`**

  Inheritance facilitates polymorphism, where a subclass can be used wherever its superclass is expected.

- **➕ Code Extensibility: `Child Classes`**

  Allows easy enhancement or upgrade of specific parts of a product without altering core attributes.

## 📝Implementation of Inheritance

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709043169/OWN%20IMAGES/inheritance_in_java_vcnak7.png" alt="Inheritance in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// 👨‍👧Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// 👶Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
```

## 📝Access Modifiers (`In Detailed`) in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708961922/ACCESS_MODIFIERS_IN_JAVA_y8xnh6.png" alt="Access modifiers in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

Inheritance involves access modifiers that `control` the visibility of members in different classes

- `📦Default (no modifier):` Accessible only within the same package.
- `🔒Private:` Accessible only within the same class.
- `🔐Protected:` Accessible within the same package and subclass in a different package.
- `🔓Public:` Accessible from any class.

```java
// Go to ACCESS-MODIFIERS-IN-DETAILED.MD for better understanding
```

## 📝Type of Inheritance

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709045681/OWN%20IMAGES/type_of_inheritance_uunizq.png" alt="Access modifiers in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

- **`1. Single Inheritance:`** A subclass inherits from only one superclass.
- **`2. Multilevel Inheritance:`** A subclass inherits from another subclass, creating a chain of inheritance.
- **`3. Hierarchical Inheritance:`** Multiple subclasses inherit from a single superclass.
- **`4. Multiple Inheritance:`** A subclass inherits from more than one superclass **(not supported in Java directly)**.
- **`5. Hybrid inheritance:`** is a combination of **multiple** and **hierarchical** inheritance, allowing a class to inherit from more than one class and forming a hybrid structure.

**🎗️ Note:** Java does not support Multiple inheritance through classes.

**`1. Single Inheritance Syntax:`**

```java
// 1. Single Inheritance: ClassB inherits from ClassA
class ClassA {
    // Members of ClassA
}

class ClassB extends ClassA {
    // Members of ClassB
}
```

**`2. Multilevel Inheritance Syntax:`**

```java
// 2. Multilevel Inheritance: ClassC inherits from ClassB, which in turn inherits from ClassA
class ClassA {
    // Members of ClassA
}

class ClassB extends ClassA {
    // Members of ClassB
}

class ClassC extends ClassB {
    // Members of ClassC
}

```

**`3. Hierarchical Inheritance Syntax:`**

```java
// 3. Hierarchical Inheritance: ClassB and ClassC inherit from ClassA
class ClassA {
    // Members of ClassA
}

class ClassB extends ClassA {
    // Members of ClassB
}

class ClassC extends ClassA {
    // Members of ClassC
}
```

**`4. Multiple Inheritance Syntax:`**

```java
// 4. Multiple Inheritance (not supported in Java directly): ClassC inherits from both ClassA and ClassB
class ClassA {
    // Members of ClassA
}

class ClassB {
    // Members of ClassB
}

class ClassC extends ClassA, ClassB {
    // Members of ClassC
}
// Note: Multiple inheritance is not allowed in Java; this is just for illustrative purposes.
```

**`5. Hybrid inheritance Syntax:`**

```java
// 5. Hybrid Inheritance: ClassD inherits from ClassA, ClassB, and ClassC
class ClassA {
    // Members of ClassA
}

class ClassB extends ClassA {
    // Members of ClassB
}

class ClassC extends ClassA {
    // Members of ClassC
}

class ClassD extends ClassB, ClassC {
    // Members of ClassD
}
// Note: Java supports hybrid inheritance through a combination of multiple and hierarchical inheritance.

```

**🧑‍💻Remember that**

- Java directly supports **single**, **multilevel**, and **hierarchical** inheritance.

- **Multiple** and **Hybrid** inheritance is not supported directly in Java, but you can achieve it using `interfaces`.

## 📝 `super` Keyword in Java

The **super** keyword in Java is used to refer to the **immediate parent class object**.

**😃 Useful in scenarios for super keyword:**
It is particularly useful to distinguish between **superclass** and **subclass** members with the **same name**.

- Acceses a **variable** of immediate parent class.
- Invokes a **method** of immediate parent class.
- Invokes a **constructor** of immediate parent class.
- Refer to **instance** if immediate parent class.

**🎗️ Note:** Call to `super()` must be first statement in `Derived Class constructor`.

### 1. Use of `super` with `🧛🏻Variables`:

When a **subclass** has a variable with the **same name** as a variable in its **superclass**, you can use `super` to reference the variable from the superclass.

```java
class ParentClass {
    int num = 10;
}

class ChildClass extends ParentClass {
    int num = 20;

    void display() {
        System.out.println("Subclass variable: " + num);
        System.out.println("Superclass variable: " + super.num);
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}

/*
Expected output:
Subclass variable: 20
Superclass variable: 10
*/
```

### 2. Use of `super` with `🙎🏻Methods`:

`super` can be used to invoke the **method** of the immediate **parent** class when a **subclass** overrides that method.

```java
class ParentClass {
    void show() {
        System.out.println("This is the show method of the superclass");
    }
}

class ChildClass extends ParentClass {
    void show() {
        super.show(); // Calling the show method of the superclass
        System.out.println("This is the show method of the subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}

/*
Expected output:
This is the show method of the superclass
This is the show method of the subclass
*/
```

### 3. Use of `super` with `🧝🏻Constructors`:

`super` is used in **constructors** to invoke the constructor of the immediate **parent** class. **It should be the first statement in the constructor**.

```java
class ParentClass {
    ParentClass() {
        System.out.println("Constructor of the superclass");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super(); // Calling the constructor of the superclass
        System.out.println("Constructor of the subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
}

/*
Expected output:
Constructor of the superclass
Constructor of the subclass
*/
```

## 📝 `super` VS `this` Keyword in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709065916/super_and_this_keyword_in_java_dd6cc2.png" alt="super VS this keyword in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### 1. Use of `super` Keyword:

- **super** is used to refer to the immediate parent class members **(fields, methods, or constructors)**.

- It is often used to **differentiate** between the **superclass** and **subclass** members with the **same name**.

- It is commonly used in the context of method **overriding** and accessing superclass constructors.

```java
class ParentClass {
    int num = 10;

    void display() {
        System.out.println("Superclass variable: " + num);
    }
}

class ChildClass extends ParentClass {
    int num = 20;

    void display() {
        System.out.println("Subclass variable: " + num);
        System.out.println("Superclass variable: " + super.num);
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}
```

### 2. Use of `this` Keyword:

- **this** is used to refer to the current class instance members **(fields, methods, or constructors)**.
- It is used to **differentiate** between **instance** variables and **parameters** with the **same name**.
- It is commonly used in the context of **method chaining** and **constructor chaining**.

```java
class Example {
    int num; // instance variable

    Example(int num) {
        this.num = num; // Using 'this' to distinguish between instance variable and parameter
    }

    void display() {
        System.out.println("Instance variable: " + this.num);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(42);
        obj.display();
    }
}
```

## 📝 Structure design program using inheritance

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709067008/Inheritnace_based_example_qit73e.png" alt="Structure design program using inheritance" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Programs are pending now
```
