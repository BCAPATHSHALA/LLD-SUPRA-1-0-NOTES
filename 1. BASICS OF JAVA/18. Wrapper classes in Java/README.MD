# Java Wrapper Classes

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709370103/wrapper_classes_in_java_oz3zsu.png" alt="Java Wrapper Classes" style="border: 10px solid #b2f2bb; border-radius: 4px;" >
</p>

## 1. 📝 What are the wrapper classes?

The wrapper classes in Java are used to convert primitive types into corresponding object.

**There are `eight` primitive data types in Java**

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

**Each has a corresponding wrapper class in the `java.lang` package.**

1. Byte
2. Short
3. Integer
4. Long
5. Float
6. Double
7. Character
8. Boolean

## 2. 📝 Need of wrapper classes

- The classes in `java.util` package handles only objects and hence wrapper classes help in this case also.

- Data structures in the **Collection framework**, such as ArrayList and Vector, store only objects (reference types) and not primitive types.

- An object is needed to support **synchronization in multithreading**.

## 3. 📝 Auto Boxing Example: from primitive types to wrapper objects

**Auto boxing** is the process of converting a primitive type to its corresponding wrapper class automatically.

**`For example:`**

```java
int primitiveInt = 42;

// Auto boxing: converting primitive int to Integer object
Integer wrappedInt = primitiveInt;
```

## 4. 📝 Unboxing Example: from wrapper objects to primitive types

**Unboxing** is the reverse process, where a wrapper object is automatically converted to its corresponding primitive type.

**`For example:`**

```java
Integer wrappedInt = 42;

// Unboxing: converting Integer object to primitive int
int primitiveInt = wrappedInt;
```

## 5. 📝 Advantages of wrapper classes

- In Java, sometimes we might need to use objects instead of primitive data types.

  **For example,** while working with `collections`. In such cases, wrapper classes help us to use primitive data types as objects.

```java
// Example 1: Working with Collections

// Error: Using ArrayList to store integers
ArrayList<int> integerList = new ArrayList<>();

// Run perfectly: Using ArrayList to store integers
ArrayList<Integer> integerList = new ArrayList<>();
```

> In this example, the `ArrayList` is used to store `Integer` objects, allowing the storage of primitive `int` values in an object-oriented context.

- We can store the null value in wrapper objects.

  **For example,**

```java
// Example 2: Storing Null Values

// Error: Primitive int try to store the null value
int nullableInteger = null;

// Run perfectly: Wrapper class Integer allows storing null values
Integer nullableInteger = null;
```

> **`Note`** Primitive types are more efficient than corresponding objects. Hence, when efficiency is the requirement, it is always recommended primitive types.
