# Dependency Inversion Principle (DIP)

```java
// Pending picture
```

## What is DIP?

1. Never depend on everything concrete(Actual Class), only depend on Abstraction.
2. High level module should not depend on low level module. They should depend on Abstraction.
3. Able to change an implementation easily without altering the high level code.
4. By adhering to DIP, you can create systems that are resilient to change, as modifications to concrete implementations do not affect high-level modules.

## In One Statement

The Dependency Inversion Principle suggests that high-level modules should not depend on low-level modules, but both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions.

## Key Idea

1. _`High-level modules` should not depend on `low-level modules`; both should depend on `abstractions`._

2. _`Abstractions` should not depend on `details`. `Details` should depend on `abstractions`._

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711713853/DIP_1_ci4qhh.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

## Real-Time Examples

Building a LEGO tower — the bricks (high and low-level modules) connect through smaller bricks (abstractions).

# How can Dependency Inversion Principle be applied?

## 📝 Practical Coding Examples in Java #1

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711719641/DIP_ex1_uqfy78.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### Violet DIP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711719633/DIP_APPLICATION_VIOLET_u8jaxu.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Higher level module: Application
class Application {
    private FileLogger logger;

    public Application(FileLogger logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}

// Lower level module: FileLogger
class FileLogger {

    public void log(String message) {
        // Code to write the message to a file
    }
}

// New Lower level module: ConsoleLogger
class ConsoleLogger {

    public void log(String message) {
        // Code to write the message to a file
    }
}

public class Example {
    public static void main(String[] args) {
        FileLogger fileLog = new FileLogger();
        ConsoleLogger consoleLog = new ConsoleLogger();
        // We can't pass the consoleLog as params in Application(consoleLog) without modifying the Application, other wise program gives an compile time error.
        Application app = new Application(fileLog);
        app.process();
    }
}
```

### Not Violet DIP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711719637/DIP_APPLICATION_Not_VIOLET_lsefmr.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Step 1: Define the Abstraction

// Interface : Ilogger
interface ILogger {
    void log(String message);
}

// Step 2: Implement the Abstraction

// LLM 1: ConsoleLogger
class FileLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("FileLogger: " + message);
    }
}

// LLM 2: ConsoleLogger
class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}

// LLM 3: ExternalServiceLogger
class ExternalServiceLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ExternalServiceLogger: " + message);
        // Code to send the message to an external service
        // This could involve HTTP requests, dealing with authentication, etc.
    }
}

// Step 3: Higher level app now depends upon Abstraction

// HLM 1: Application
class Application {
    private ILogger logger;

    public Application(ILogger logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}

public class Example {
    public static void main(String[] args) {
        ILogger fileLog = new FileLogger();
        ILogger consoleLog = new ConsoleLogger();
        ILogger externalServiceLog = new ExternalServiceLogger();

        // Now we dont need to change for passing fileLog, consoleLog, and externalServiceLog as paramas into Application
        Application app1 = new Application(fileLog);
        Application app2 = new Application(consoleLog);
        Application app3 = new Application(externalServiceLog);

        app1.process(); // FileLogger: Application started
        app2.process(); //  ConsoleLogger: Application started
        app3.process(); // ExternalServiceLogger: Application started
    }
}
```

## 📝 Practical Coding Examples in Java #2

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711720954/DIP_ex2_rwmxad.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

### Violet DIP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711720956/DIP_ex2_violet_fvvvpb.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Higher level module: GoToWork
class GoToWork {
    private Metro metro;
    public GoToWork(Metro metro) {
        this.metro = metro;
    }

    public void process() {
        metro.travel("Transport started");
        // Additional logic here
    }
}

// Lower level module: Metro
class Metro {
    public void travel(String message) {
        // Code to write the message to a file
    }
}

// New Lower level module: Rapido
class Rapido {
    public void travel(String message) {
        // Code to write the message to a file
    }
}

public class Example {
    public static void main(String[] args) {
        Metro metroTransport = new Metro();
        Rapido rapidoTransport = new Rapido();
        // We can't pass the rapidoTransport as params in GoToWork(rapidoTransport) without modifying the GotoWork, other wise program gives an compile time error.
        GoToWork app = new GoToWork(metroTransport);
        app.process();
    }
}
```

### Not Violet DIP

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1711720959/DIP_ex2_not_violet_lgpzkv.png" alt="Interface Segregation Principle" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
// Step 1: Define the Abstraction

// Interface : ITransport
interface ITransport {
    void travel(String message);
}

// Step 2: Implement the Abstraction

// LLM 1: Metro
class Metro implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Metro: " + message);
    }
}

// LLM 2: Rapido
class Rapido implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Rapido: " + message);
    }
}

// LLM 3: Uber
class Uber implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Uber: " + message);
    }
}

// Step 3: Higher level app now depends upon Abstraction

// HLM 1: GoToWork
class GoToWork {
    private ITransport transport;

    public GoToWork(ITransport transport) {
        this.transport = transport;
    }

    public void process() {
        transport.travel("transport started");
        // Additional logic here
    }
}

public class Example {
    public static void main(String[] args) {
        ITransport metroTrav = new Metro();
        ITransport rapidoTrav = new Rapido();
        ITransport uberTrav = new Uber();

        // Now we don't need to change for passing metroTrav, rapidoTrav, and uberTrav as paramas into GoToWork
        GoToWork transport1 = new GoToWork(metroTrav);
        GoToWork transport2 = new GoToWork(rapidoTrav);
        GoToWork transport3 = new GoToWork(uberTrav);


        transport1.process(); // Metro: transport started
        transport2.process(); // Rapido: transport started
        transport3.process(); // Uber: transport started
    }
}
```
