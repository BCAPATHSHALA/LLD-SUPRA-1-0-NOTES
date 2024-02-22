# Data type conversion in Java

In Java, type conversion refers to the process of converting a value from one data type to another.

There are two types of type conversion in Java: implicit `(automatic)` conversion and explicit `(manual)` conversion.

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708277397/OWN%20IMAGES/download_wyn0zo.png" alt="java type conversion" >
</p>

## Implicit Type Conversion (Widening):

Java automatically converts a `lower` data type to a `higher` data type without any explicit instruction from the programmer.

This is also known as **widening** conversion because the data type `"widens"` to accommodate the larger type.

**For example, converting an int to a double:**

```Java
int intValue = 42;
double doubleValue = intValue; // Implicit conversion
```

## Explicit Type Conversion (Narrowing):

Sometimes, you need to manually convert a `higher` data type to a `lower` data type. This is called explicit type conversion or narrowing conversion.

**This process requires the use of** `casting`, where you specify the `target data type` in parentheses before the variable.

**For example, converting a double to an int:**

```Java
double doubleValue = 3.14;
int intValue = (int) doubleValue; // Explicit conversion
```
