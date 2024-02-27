# Encapsulation in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708951971/OWN%20IMAGES/encapsulation_in_java_tsiu3v.png" alt="Encapsulation in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

Encapsulation refers to the bundling of data (**attributes**) and the methods (**functions**) that operate on the data into a single unit known as a `class`.

## 1. 📝 What is encapsulation?

**📂Definition:**

- Encapsulation binds data and methods in a class.
- Like a capsule, it combines and binds them together.

**📂 Function of Encapsulation:**

- Provides a secure layer.
- Hides internal implementation of code and data in a class.
- Exposes only necessary information to the external world.

**📂 Data hiding**

- As we are hiding data from outer classes or the world, Encapsulation is also known as Data hiding.

**📂 Unauthorized access**

- The goal is to implement classes in a way that prevents unauthorized access to or modification of the original contents of a class by its instances (or **objects**).

- The underlying algorithms of one class need not be known to another class. The two classes can still communicate, though.

## 2. 📝 Access modifiers (`Brief`) in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708961922/ACCESS_MODIFIERS_IN_JAVA_y8xnh6.png" alt="Access modifiers in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>
Access modifiers in Java determine the visibility or accessibility of `classes`, `methods`, and `fields` in different parts of your code.

> There are four types of access modifiers:

### `📦Default:` Access is limited to the package.

### `🔓Public:` The entity is accessible from anywhere.

- Members declared as public are accessible from any part of the program.
- They can be accessed by objects of the class and external code.

### **`🔒Private:` Access is restricted to the class itself.**

- Members declared as private are accessible only within the same class.
- They are not accessible from outside the class, including derived classes.

### `🔐Protected:` Access is limited to the package and its subclasses.

- Members declared as protected are accessible within the same class and by derived classes.
- They are not directly accessible from external code.

## 3. 📝 Not Perfect Encapsulation

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708953952/OWN%20IMAGES/Non_perfect_encapsulation_n9gzsf.png" alt="Encapsulation in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// 🗃️ src\Student.java
public class Student {
    // Attributes (Variables)
    public int id;
    public String name;
    public int age;
    public int nos;
    private String gfName;

    public Student(int id, String name, int age, int nos, String gfName){
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gfName = gfName;
    }

    // Behaviours (Methods)
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }
    public void gfName(){
        System.out.println("I love " + gfName);
    }
}
```

```java
// 🗃️ src\App.java
public class App {
    public static void main(String[] args) throws Exception {
        Student manojObj = new Student(123, "Manoj", 24, 5, "Problem Solving!!");
        manojObj.study();
        manojObj.sleep();
        manojObj.bunk();
        manojObj.gfName();
    }
}

/*
Expected output:
Manoj studying
Manoj sleeping
Manoj bunking
I love Problem Solving!!
*/
```

## 4. 📝 Perfect Encapsulation

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708955967/OWN%20IMAGES/PERFECT_ENCAPSULATION_no2vod.png" alt="Encapsulation in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

1. **If all data members / variables are private.**
2. **Handling Access to Encapsulated Data**

- Despite encapsulation, external interaction is necessary.
- Implementation of public methods, such as getters and setters, allows external communication.
- These methods enable controlled access to the encapsulated data.

```java
// 🗃️ src\Student.java
public class StudentTwo {
    // Attributes (Variables)
    private int id;
    private String name;
    private String gfName;

    // Behaviours (Methods)
    public void getId(){
        System.out.println("ID: "+id);
    }
    public void setId(int id){
        this.id = id;
    }
    public void getName(){
        System.out.println("Name: "+ name);
    }
    public void setName(String name){
        this.name = name;
    }
    public void getGFName(){
        System.out.println("GF Name: "+gfName);
    }
    public void setGFName(String gfName){
        this.gfName = gfName;
    }
}
```

```java
// 🗃️ src\App.java
public class App {
    public static void main(String[] args) throws Exception {
        StudentTwo sanojObj = new StudentTwo();
        // Set id, name, and gfName
        sanojObj.setId(124);
        sanojObj.setName("Sanoj");
        sanojObj.setGFName("Sanoji🧟‍♀️");

        // Get id, name, and gfName
        sanojObj.getId();
        sanojObj.getName();
        sanojObj.getGFName();
    }
}

/*
Expected output:
ID: 124
Name: Sanoj
GF Name: Sanoji🧟‍♀️
*/
```
