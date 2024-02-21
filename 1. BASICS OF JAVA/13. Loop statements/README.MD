# Loop statements in Java

Here's a simple Java program that demonstrates different types of loop statements: `for`, `while`, and `do-while`.

```java
import java.util.Scanner;

public class LoopStatementsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For loop to print numbers from 1 to 5
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // While loop to calculate the factorial of a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int factorial = 1;
        int counter = 1;

        System.out.println("Using while loop:");
        while (counter <= number) {
            factorial *= counter;
            counter++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Do-while loop to print even numbers from 2 to 10
        int evenNumber = 2;
        System.out.println("Using do-while loop:");
        do {
            System.out.print(evenNumber + " ");
            evenNumber += 2;
        } while (evenNumber <= 10);

        scanner.close();
    }
}

```
