# Conditional statement in Java

Here's a simple example of a Java program that includes all the conditional statements: `if`, `else if`, `else`, `ternary operator`, and the `switch` statement.

```java
import java.util.Scanner;

public class ConditionalStatementsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Ternary Operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result + ".");

        // Switch statement
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            case 3:
                System.out.println("The number is three.");
                break;
            default:
                System.out.println("The number is not 1, 2, or 3.");
        }

        scanner.close();
    }
}
```
