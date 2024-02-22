# Java program execution process

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708275269/OWN%20IMAGES/exexution_process_of_java_towaen.png" alt="Java program execution" >
</p>


Here's a `step-by-step` breakdown of the Java program execution process in simple terms:

## Writing Code:

- Start by writing your Java code using a text editor or an Integrated Development Environment `(IDE)`.

## Compilation:

- Save your Java code in a file with a `.java` extension. This file is called the source file.
- Use the Java compiler `(javac)` to translate your source code into an intermediate form called `bytecode`.
- This **bytecode is not machine-specific**, making Java a platform-independent language.

## Bytecode Generation:

- The Java compiler generates a file with a `.class` extension containing the bytecode for each class in your program.

## Java Virtual Machine (JVM):

- The JVM is a virtual machine that executes Java bytecode.
- Run your Java program by providing the `.class` file to the `Java interpreter` **(java command)**.

## Loading:

- The JVM loads the bytecode of your program into memory.

## Bytecode Verification:

- The JVM checks the bytecode for any violations of Java's security restrictions.

## Execution:

- The JVM starts executing the bytecode line by line.
- It translates the bytecode into machine-specific instructions using `Just-In-Time` **(JIT)** compilation for better performance.

## Runtime:

- Your program runs and performs the tasks specified in your code.

## Output:

- If your program includes output statements
  `(e.g., System.out.println())`, the results are displayed in the `console`.

## Termination:

- Your program finishes its execution, and the JVM `releases` the allocated memory.
