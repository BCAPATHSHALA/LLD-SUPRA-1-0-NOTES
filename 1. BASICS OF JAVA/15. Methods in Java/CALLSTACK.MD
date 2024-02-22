# Function Call Stack

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708546228/OWN%20IMAGES/1_rJ2sh-q1deQGGGVG5gYyIQ_ukpz00.png" alt="Call Stack" >
</p>

A simple Java program that demonstrates the concept of the call stack.

- The program consists of a `main` method, two additional methods (`methodA` and `methodB`), and comments to explain the call stack at different points in the execution.

```java
public class CallStackExample {

    public static void main(String[] args) {
        System.out.println("Main method started.");
        methodA();
        System.out.println("Main method completed.");
    }

    public static void methodA() {
        System.out.println("Inside methodA.");
        methodB();
        System.out.println("Exiting methodA.");
    }

    public static void methodB() {
        System.out.println("Inside methodB.");
        System.out.println("MethodB is doing some work.");
        System.out.println("Exiting methodB.");
    }
}

/*
Expected output:
Main method started.
Inside methodA.
Inside methodB.
MethodB is doing some work.
Exiting methodB.
Exiting methodA.
Main method completed.
*/
```

## Explanation:

**START** `--->` `Main Method Execution` `--->` `methodA Execution` `--->` `methodB Execution ` `--->` `methodA Continuation` `--->` `Main Method Continuation` `--->` **END**

## Call Stack Visualization:

```console
main
  |
  |  methodA
  |    |
  |    |  methodB
  |    |    |
  |    |    |
  |    |  methodB
  |    |
  |  methodA
  |
main
```
