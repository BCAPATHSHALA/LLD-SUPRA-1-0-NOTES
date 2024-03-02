# Exception Handling in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709318400/Realtime_example_of_eception_handling_xqtclx.png" alt="Real Time Example of Exception Handling in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;" >
</p>

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
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709312601/hierarchy_of_exceptions_izosg4.png" alt="Hierarchy of Exceptions in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;" >
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
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709314027/Runtime_Exceptions_and_Compile_time_exception_e9wwrr.png" alt="Types of Exception in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
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

## 6. 📝 Throws Keyword

The `throws` keyword is used in method declarations to indicate that the method **might** throw a particular type of exception.

**Syntax:**

```java
returnType methodName(parameterList) throws ExceptionType1, ExceptionType2, ... {
    // Method body
}
```

- `returnType:` The data type of the value that the method returns.
- `methodName:` The name of the method.
- `parameterList:` The list of parameters that the method takes.
- `ExceptionType1, ExceptionType2, ...:` The types of exceptions that the method might throw.

**Example:**

```java
import java.io.IOException;

public class ThrowsExample {

    // Method declaration with throws keyword
    public static void readFile(String filePath) throws IOException {
        // If the file doesn't exist or there's an issue reading it, an IOException is thrown
        if (!fileExists(filePath)) {
            throw new IOException("File not found or error reading file");
        }

        // Continue with file processing if successful
        System.out.println("File reading successful!");
    }

    // Helper method to simulate file existence check
    private static boolean fileExists(String filePath) {
        // In a real-world scenario, you would perform an actual check
        return filePath != null && !filePath.isEmpty();
    }

    public static void main(String[] args) {
        // Example usage of the method with try-catch block
        try {
            readFile("example.txt");
        } catch (IOException e) {
            // Handling the IOException if it occurs
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

### 🧑‍💻 Test Cases for File Reading Function:

```java
// 1. Valid File Path:
Input: "validfile.txt"
Expected Output: File reading successful!

// 2. Invalid File Path (File Not Found):
Input: "nonexistentfile.txt"
Expected Output: Error: File not found or error reading file

// 3. Invalid File Path (Null):
Input: null
Expected Output: Error: File not found or error reading file

// 4. Invalid File Path (Empty String):
Input: ""
Expected Output: Error: File not found or error reading file
```

## 7. 📝 Throw Keyword

The `throw` keyword is used to **explicitly** throw an exception in a program.

**Syntax:**

```java
throw exceptionObject;
```

- `exceptionObject:` An instance of an exception class that you want to throw.

**Example:**

```java
public class ThrowExample {

    // Method that throws a custom exception
    public static void validateAge(int age) {
        // Checking if age is less than 18
        if (age < 18) {
            // Throwing a custom exception if age is not valid
            throw new IllegalArgumentException("Age must be 18 or older");
        }

        // Continue processing if age is valid
        System.out.println("Age validation successful!");
    }

    public static void main(String[] args) {
        // Example usage of the method with try-catch block
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            // Handling the custom exception if it is thrown
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

### 🧑‍💻 Test Cases for a Function Validating User Age:

```java
// 1. Valid Age:
Input: 25
Expected Output: Age validation successful!

// 2. Minimum Valid Age:
Input: 18
Expected Output: Age validation successful!

// 3. Invalid Age (Below Minimum):
Input: 15
Expected Output: Error: Age must be 18 or older

// 4. Boundary Valid Age (Just Above Minimum):
Input: 19
Expected Output: Age validation successful!

// 5. Invalid Age (Negative):
Input: -5
Expected Output: Error: Age must be 18 or older

// 6. Boundary Invalid Age (Zero):
Input: 0
Expected Output: Error: Age must be 18 or older
```

# 🧛🏻 Self Practice: Four options to understand the `runtime exception handling`

    1. Default throw and default catch
    2. Default throw and our catch
    3. Our throw and default catch
    4. Our throw and our catch

## 1. 📝 Default throw and default catch

```java
class SimpleExample{
    public static void main(String[] args){
        int x = 20/0;
        System.out.println("Rest of the code");
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at SimpleExample.main(SimpleExample.java:3)
*/
```

`Note:` Rest of the code is not executed **(Rest of the code)** statement is not printed.

    • JVM first checks whether the exception is handled or not.

    If an exception is not handled, JVM provides a default exception handler that performs the following tasks:

    • Prints out exception description.
    • Prints the stack trace (Hierarchy of methods where the exception occurred).
    • Causes the program to terminate.

## 2. 📝 Default throw and our catch

```java
class SimpleExample{
    public static void main(String[] args){
        try{
            int x = 20/0;
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}

/*
Exception: / by zero
Rest of the code
*/
```

    • The Throwable class provides a String variable that can be set by the subclasses to provide a detail message that provides more information of the exception occurred

    • All classes of Throwables define a oneparameter constructor that takes a string as the detail message

    • The class Throwable provides getMessage(). function to retrieve an exception

## 3. 📝 Our throw and default catch

```java
class SimpleExample{
    public static void main(String[] args){
        int balance = 100;
        int withdraw = 500;

        if(balance < withdraw){
            // Our throw
            ArithmeticException e = new ArithmeticException("Balance insufficient!");
            throw e;
        }
        System.out.println("Rest of the code");
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: Balance insufficient!
        at SimpleExample.main(SimpleExample.java:8)
*/
```

    • A program can explicitly throw an exception using the throw statement beside the implicit exception thrown.

    • Syntax: throw <throwablelnstance>;

    • The Exception reference must be of type Throwable class or one of its subclasses.

    • A detailed message can be passed to the constructor when the exception object is created.

## 4. 📝 Our throw and our catch

```java
class SimpleExample{
    public static void main(String[] args){
        int balance = 100;
        int withdraw = 500;

        try {
            if(balance < withdraw){
                // Our throw
                ArithmeticException e = new ArithmeticException("Balance insufficient!");
                throw e;
            }
        } catch (Exception e) {
            // Our catch
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}

/*
Exception: Balance insufficient!
Rest of the code
*/
```

# 🧛🏻 Self Practice: to understand the `compile-time exception handling`

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709365958/compile_time_exception_handling_f3uclh.png" alt="Compile time exception handling in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
import java.io.IOException;

class CheckedException{
    public static void main(String[] args){
        IOException e = new IOException();
        throw e;
    }
}

/*
CheckedException.java:6: error: unreported exception IOException; must be caught or declared to be thrown throw e;
*/
```

## 1. 📝 Using throws keyword to handle this error

```java
import java.io.IOException;

class CheckedException{
    public static void main(String[] args) throws IOException{
        IOException e = new IOException();
        throw e;
    }
}

/*
Exception in thread "main" java.io.IOException at CheckedException.main(CheckedExcetion.java:5)
*/
```

## 2. 📝 Using try catch block to handle this error properly

```java
import java.io.IOException;

class CheckedException{
    public static void main(String[] args){
        IOException e = new IOException();
        try {
            throw e;
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }
}

/*
null
*/
```
