# One-Dimensional Array in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708542422/OWN%20IMAGES/1D-Array-C_owm3ji.png" alt="One-Dimensional Array in Java" >
</p>

## 1. What is a One-Dimensional Array?

In Java, an array is a data structure that allows you to store multiple values of the same type under a single name. A one-dimensional array, also known as a 1D array, is the simplest form of an array where elements are arranged in a linear sequence.

## 2. Creation of Array

`Declaration`

- To declare an array, you specify the type of elements it will hold, followed by the array's name and square brackets.

```java
int[] myArray;
// or
int myArray[];
```

`Allocation`

- After declaring an array, you need to allocate memory for it using the `new` keyword.

```java
myArray = new int[5];
```

> This allocates memory for an array of 5 integers.

`Initialization`

- You can initialize the array elements directly during declaration or later in your code.

```java
int[] myArray = {1, 2, 3, 4, 5};
```

`Access Array's Elements`

- Accessing array elements is done using their index, starting from 0.

```java
int thirdElement = myArray[2]; // Accessing the third element (index 2)
```

`Input from User`

- To populate an array with user input, you can use a loop and the Scanner class.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

for (int i = 0; i < myArray.length; i++) {
    System.out.print("Enter element at index " + i + ": ");
    myArray[i] = scanner.nextInt();
}
```

`Use of Foreach Loop with Array`

- The foreach loop simplifies iterating through all elements of an array.

```java
for (int element : myArray) {
    System.out.println(element);
}
```

# Practice with One-D Array

## 1. Find Sum of All Values of Array

```java
int sum = 0;
for (int element : myArray) {
    sum += element;
}
System.out.println("Sum: " + sum);
```

## 2. Find Multiplication of All Values of Arrays

```java
int product = 1;
for (int element : myArray) {
    product *= element;
}
System.out.println("Product: " + product);
```

## 3. Find Maximum and Minimum Value of Array

```java
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;

for (int i = 1; i < myArray.length; i++) {
    if (myArray[i] > max) {
        max = myArray[i];
    }
    if (myArray[i] < min) {
        min = myArray[i];
    }
}

System.out.println("Maximum Value: " + max);
System.out.println("Minimum Value: " + min);
```

# To access or calculate the index of an element in a one-dimensional array in Java, you can use the formula:

**index** = **baseAddress** + (**elementIndex** X **elementSize**)

Here:

- `index` is the index of the desired element.
- `baseAddress` is the index where the array starts (usually 0 in Java).
- `elementIndex` is the position of the element in the array (starting from 0 for the first element).
- `elementSize` is the size (in bytes) of each element in the array.
