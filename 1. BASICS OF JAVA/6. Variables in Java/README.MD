# Java Variables

In Java, variables are containers used to store data values. They act as placeholders or memory locations that hold different types of information.

## Declaration:

- Before using a variable, you need to declare it with a specific data type.

```java
int age; // declares an integer variable named 'age'
```

## Data Types:

- Java has various data types such as `int`, `double`, `char`, `boolean`, etc., each serving a specific purpose. The data type indicates what kind of values the variable can hold.

```java
int count = 5;              // integer variable
float price = 19.99f;       // floating-point variable
char initial = 'A';         // character variable
boolean isJavaFun = true;   // boolean variable
```

## Initialization:

- Variables can be initialized `(assigned a value)` during declaration or later in the program.

```java
int age;         // declaration
age = 20;        // initialization
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708273723/OWN%20IMAGES/Variables-Syntax-in-Java_llbko7.jpg" alt="Java Variables" >
</p>

## Naming Rules:

**Variable names in Java must follow certain rules:**

- Start with a `letter`, `underscore (\_)`, or `dollar sign ($)`.
- Subsequent characters can be `letters`, `digits`, `underscores`, or `dollar signs`.
- Java is `case-sensitive`, so `age` and `Age` would be treated as different variables.

## Scope:

- The scope of a variable determines where in the code it can be accessed. Variables can have local scope `(limited to a specific block or method)` or class scope `(accessible throughout the class)`.

## Final Keyword:

- You can use the `final` keyword to make a variable `constant`, meaning its value cannot be changed once assigned.

```java
final int MAX_VALUE = 100; // constant variable
```

## Default Values:

- Variables are assigned default values if not explicitly initialized.
  <br>**For example**, numeric types are set to 0, booleans to false, and object references to null.

```java
int count;  // default value is 0
boolean flag; // default value is false
String text;  // default value is null
```

> Understanding and effectively using variables is fundamental in Java programming, as they play a crucial role in storing and manipulating data within your programs.
