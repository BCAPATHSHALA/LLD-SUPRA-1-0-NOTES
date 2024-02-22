# Methods in Java

## What is a Method/Function?

In Java, a method, also known as a function, is a block of code that performs a specific task and is designed to be reusable. Methods are essential for organizing code, improving readability, and promoting code reusability.

## Function Declaration

To declare a method, you specify its return type, name, and parameters (if any). The return type indicates the type of value the method will return (use `void` if the method doesn't return anything).

```java
public static void printNameNTimes(String name, int n) {
    // Method body
    for (int i = 0; i < n; i++) {
        System.out.println(name);
    }
}
```

## Function Call

To execute a method, you call it by its name and provide any required arguments.

```java
printNameNTimes("John", 3);
```

## Function Call Stack

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708546228/OWN%20IMAGES/1_rJ2sh-q1deQGGGVG5gYyIQ_ukpz00.png" alt="Call Stack" >
</p>

When a method is called, it is added to the call stack. The call stack keeps track of the order in which methods are called and ensures proper execution.

```java
// Pending program on call stack explanation
```

## Return Keyword

The `return` keyword is used to exit a method and return a value (if applicable) to the calling code.

```java
public static int sumFrom1ToN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
```

## Method Parameters

Method parameters are placeholders for the values that a method expects to receive when it is called.

```java
public static double averageOfTwoNumbers(double num1, double num2) {
    return (num1 + num2) / 2;
}
```

# Practice with methods

## 1. Write a Function to Print Your Name "N" Times

```java
public static void printNameNTimes(String name, int n) {
    for (int i = 0; i < n; i++) {
        System.out.println(name);
    }
}
```

## 2. Write a Function to Print the Sum from 1 to N

```java
public static int sumFrom1ToN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
```

## 3. Write a Function to Return the Average of 2 Numbers

```java
public static double averageOfTwoNumbers(double num1, double num2) {
    return (num1 + num2) / 2;
}
```

## 4. Write a Function to Return the Minimum of 2 Numbers

```java
public static int minimumOfTwoNumbers(int num1, int num2) {
    return Math.min(num1, num2);
}
```

## 5. Write a Function to Return the Maximum of 2 Numbers

```java
public static int maximumOfTwoNumbers(int num1, int num2) {
    return Math.max(num1, num2);
}
```

## 6. Write a Function to Return the Absolute Value of a Number

```java
public static int absoluteValue(int num) {
    return Math.abs(num);
}
```

## 7. Write a Function to Return the Exponent of a Number

```java
public static double exponentOfNumber(double base, double exponent) {
    return Math.pow(base, exponent);
}
```

## 8. Write a Function to Return a Random Value Between 1 to N

```java
import java.util.Random;

public static int randomValueUpToN(int n) {
    Random random = new Random();
    return random.nextInt(n) + 1;
}
```

# Practice with Function and Array

## 1. Write a Function to Print the Array

```java
public static void printArray(int[] arr) {
    for (int element : arr) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

## 2. Write a Function to Return the Sum of All Elements in the Array

```java
public static int sumOfArray(int[] arr) {
    int sum = 0;
    for (int element : arr) {
        sum += element;
    }
    return sum;
}
```

## 3. Write a Function to Double the Values Present Inside the Array

```java
public static void doubleArrayValues(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] *= 2;
    }
}
```

# Remember

all these `methods` should be placed inside a `class` with a `main` method, and the methods are declared as `static` because they are called from a `static context` (inside the `main` method).

# complete Java program that incorporates the mentioned practices with methods and arrays. The program contains the main method along with the functions.

```java
import java.util.Random;
import java.util.Scanner;

public class JavaPracticeProgram {

    public static void main(String[] args) {
        // Practice 1
        printNameNTimes("John", 3);

        // Practice 2
        int sumResult = sumFrom1ToN(5);
        System.out.println("Sum from 1 to 5: " + sumResult);

        // Practice 3
        double average = averageOfTwoNumbers(10.5, 20.5);
        System.out.println("Average: " + average);

        // Practice 4
        int minResult = minimumOfTwoNumbers(15, 10);
        System.out.println("Minimum: " + minResult);

        // Practice 5
        int maxResult = maximumOfTwoNumbers(15, 10);
        System.out.println("Maximum: " + maxResult);

        // Practice 6
        int absValue = absoluteValue(-5);
        System.out.println("Absolute Value: " + absValue);

        // Practice 7
        double exponentResult = exponentOfNumber(2, 3);
        System.out.println("Exponent: " + exponentResult);

        // Practice 8
        int randomValue = randomValueUpToN(10);
        System.out.println("Random Value: " + randomValue);

        // Practice with Function and Array

        // Practice 1
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Array Elements: ");
        printArray(array);

        // Practice 2
        int arraySum = sumOfArray(array);
        System.out.println("Sum of Array Elements: " + arraySum);

        // Practice 3
        doubleArrayValues(array);
        System.out.print("Doubled Array Elements: ");
        printArray(array);
    }

    // Practice 1
    public static void printNameNTimes(String name, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }
    }

    // Practice 2
    public static int sumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Practice 3
    public static double averageOfTwoNumbers(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    // Practice 4
    public static int minimumOfTwoNumbers(int num1, int num2) {
        return Math.min(num1, num2);
    }

    // Practice 5
    public static int maximumOfTwoNumbers(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // Practice 6
    public static int absoluteValue(int num) {
        return Math.abs(num);
    }

    // Practice 7
    public static double exponentOfNumber(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Practice 8
    public static int randomValueUpToN(int n) {
        Random random = new Random();
        return random.nextInt(n) + 1;
    }

    // Practice with Function and Array

    // Practice 1
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Practice 2
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    // Practice 3
    public static void doubleArrayValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
```
