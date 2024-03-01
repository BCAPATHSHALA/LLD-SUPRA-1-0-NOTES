# Exception Handling in Java

## 1. 📝 What is an Exception?

In Java, Exception is an **unwanted** or **unexpected** event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program's instructions. Exceptions can be caught and handled by the program.

## 2. 📝 Exception Occurs Due To

Exceptions can occur due to various reasons, such as:

- **👤 Invalid User Input**
- **🖥️ Device Failure**
- **🌐 Loss of Network Connection**
- **💽 Physical Limitations (Out-of-Disk Memory)**
- **🐛 Code Errors**
- **📄 Opening an Unavailable File**

> - **`🚀Reason 1: Runtime errors`** These are errors that occur during the execution of the program.
> - **`🚀Reason 2: Logical errors`** These occur when the code does not behave as intended.

## 3. 📝 Hierarchy of Exceptions in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709312601/hierarchy_of_exceptions_izosg4.png" alt="Hierarchy of Exceptions in Java" >
</p>

- In Java, the hierarchy of exceptions is organized into two main branches:

- `Throwable` and its two subtypes - `Exception` and `Error`.

- Both **Exception** and **Error** further extend into various **subclasses** to cover a wide range of exceptional conditions.

### Throwable

Represents the base class for all exceptions and errors in Java.

### Exception

The subclass of Throwable that is used for exceptional conditions that user programs should catch. It further divides into **Checked Exceptions `(Subclass of Exception)`** and **Unchecked Exceptions `(Subclass of RuntimeException)`**

### Error

Represents exceptional conditions that are external to the application, and that the application usually should not catch.

## 4. 📝 Types of Exception in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709314027/Runtime_Exceptions_and_Compile_time_exception_e9wwrr.png" alt="Types of Exception in Java" >
</p>

There are mainly two types of exceptions

1. **Unchecked exceptions:** Runtime exceptions occur at runtime and are checked at run-time.

### **Common examples of unchecked exceptions in Java include:**

- `ArithmeticException:` Thrown when an arithmetic operation encounters an exceptional condition, such as division by zero.
- `NullPointerException:` Occurs when attempting to access or call a method on an object that is null.
- `ArrayIndexOutOfBoundsException:` Thrown when trying to access an array element with an invalid index.
- `IllegalArgumentException:` Raised when a method receives an argument of an inappropriate type.
- `ClassCastException:` Signifies an invalid cast operation.

2. **Checked exceptions:** Checked exceptions occur at compile-time and are checked at compile-time.

### **Common examples of checked exceptions in Java include:**

- `IOException:` Signals an input or output exception during file operations.
- `FileNotFoundException:` Thrown when attempting to access a file that does not exist.
- `ClassNotFoundException:` Indicates that a class is not found at runtime.
- `SQLException:` Indicates an issue with database access or SQL operations.

## 5. 📝 Exception Handling in Java

### 1. try-catch block

- **try block:** The try statement allows you to define a block of code to be tested for errors while it is being executed.

- **catch block:** The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

**Syntax:**

```java
try {
    // code that may throw an exception
} catch (Exception e) {
    // code to handle an exception
}
```

**Example:**

```java
public class SimpleExceptionExample {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  // Trying to divide by zero

        try {
            // Code that may throw an exception
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block for handling the exception
            System.out.println("Error: Cannot divide by zero!");
        }

        // Rest of the program continues after handling the exception
        System.out.println("Program continues...");
    }

    // Method that may throw an exception
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
```

### 2. try-catch-finally block

The `try`, `catch`, and `finally` blocks are important components of the Java programming language. They are used to handle errors and exceptions in Java. The three blocks are used in the following way:

- **try block:** The try block is used to specify a block of code that may throw an exception.

- **catch block:** The catch block is used to handle the exception if it is thrown.

- **finally block:** The finally block is used to execute the code after the try and catch blocks have been executed.

**Syntax:**

```java
try {
    // code that may throw an exception
} catch (Exception e) {
    // code to handle an exception
}
finally{
    // always executed whether an exception was thrown or not
}
```

**Example:**

```java
public class SimpleExceptionExample {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;  // Trying to divide by zero

        try {
            // Code that may throw an exception
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block for handling the exception
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // Optional finally block for cleanup operations
            System.out.println("This block always executes, regardless of an exception");
        }

        // Rest of the program continues after handling the exception
        System.out.println("Program continues...");
    }

    // Method that may throw an exception
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
```

### 🙎🏻 QUESTION: Is There Any Case Where Finally Block Does Not Execute?

Yes, there are cases where the `finally` block may not execute, such as when the program exits abruptly using `System.exit()`.
