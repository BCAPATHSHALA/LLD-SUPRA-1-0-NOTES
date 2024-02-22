# Two-Dimensional Array in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708542421/OWN%20IMAGES/2DArray_ubjjx0.png" alt="Two-Dimensional Array in Java" >
</p>

## 1. What is a Two-Dimensional Array?

In Java, a two-dimensional array is an array of arrays. It can be visualized as a table with rows and columns, where each cell holds a specific value.

## 2. Creation of Two-Dimensional Array

`Declaration`

- To declare a 2D array, you specify the type of elements it will hold, followed by the array's name and two sets of square brackets.

```java
int[][] my2DArray;
// or
int my2DArray[][];
```

`Allocation`

- Allocate memory for a 2D array by specifying the size of each dimension.

```java
my2DArray = new int[3][4]; // 3 rows and 4 columns
```

`Initialization`

- Initialize the array elements during declaration or later in your code.

```java
int[][] my2DArray = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

`Access Array's Elements`

- Access elements using their row and column indices.

```java
int element = my2DArray[1][2]; // Accessing the element in the second row and third column
```

`Input from User`

- Populate a 2D array with user input using nested loops.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

int row = my2DArray.length;
int col = my2DArray[i].length;

for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
        System.out.print("Enter element at position [" + i + "][" + j + "]: ");
        my2DArray[i][j] = scanner.nextInt();
    }
}
```

`Use of Nested Loops with 2D Array`

- Use nested loops to traverse all elements of a 2D array.

```java
for (int i = 0; i < my2DArray.length; i++) {
    for (int j = 0; j < my2DArray[i].length; j++) {
        System.out.print(my2DArray[i][j] + " ");
    }
    System.out.println();
}
```

# Practice with Two-D Array

## 1. Find Sum of All Values of Array

```java
int sum = 0;
for (int i = 0; i < my2DArray.length; i++) {
    for (int j = 0; j < my2DArray[i].length; j++) {
        sum += my2DArray[i][j];
    }
}
System.out.println("Sum: " + sum);

```

## 2. Find Multiplication of All Values of Arrays

```java
int product = 1;
for (int[] row : my2DArray) {
    for (int element : row) {
        product *= element;
    }
}
System.out.println("Product: " + product);
```

## 3. Find Maximum and Minimum Value of Array

```java
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;

for (int i = 0; i < my2DArray.length; i++) {
    for (int j = 0; j < my2DArray[i].length; j++) {
        if (my2DArray[i][j] > max) {
            max = my2DArray[i][j];
        }
        if (my2DArray[i][j] < min) {
            min = my2DArray[i][j];
        }
    }
}

System.out.println("Maximum Value: " + max);
System.out.println("Minimum Value: " + min);

```

## Traversing a 2D array using a foreach

- Traversing a 2D array using a foreach loop in Java involves using nested loops to iterate over each row and column.

```java
public class TwoDArrayTraversal {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Using nested loops to traverse the 2D array
        System.out.println("Traversing 2D Array using foreach loop:");

        for (int[] row : my2DArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```
