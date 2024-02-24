# String in java

## 1. What is a String?

- In Java, a `String` is a sequence of characters.

- It is an object that represents a sequence of char values, where a char is a `16-bit Unicode` character.

- Strings in Java are widely used for handling textual data.

## 2. Character Array Example

```java
char[] charArray = {'H', 'e', 'l', 'l', 'o'};
String strFromArray = new String(charArray);
```

## 3. String Array Example

```java
String[] stringArray = {"Java", "is", "powerful"};
```

## 4. Creation of a String

`Way 1:` Using String Literal **( GOOD WAY )**

```java
String strLiteral = "MANOJ";
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708791581/OWN%20IMAGES/String_One_vzu7jx.png" alt="String Literal" >
</p>

`Way 2:` Using new Keyword **String Object**

```java
String strNewKeyword = new String("MANOJ");
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708791581/OWN%20IMAGES/String_Two_yk826t.png" alt="String object" >
</p>

## 5. What is String Pool?

- **Stack Memory:** The memory area where the reference to the String object is stored.

- **Heap Memory:** The actual memory space where the String object resides.

- **Constant String Pool:** A pool of unique String literals stored in the heap memory.

```java
// String literal
String str1 = "MANOJ";
String str2 = "MANOJ";
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708795046/OWN%20IMAGES/String_Three_j5gtj9.png" alt="String pool 1" >
</p>

```java
// Both string literal are updated now
str1 = "RISHABH";
str2 = "SANOJ";
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708795808/OWN%20IMAGES/String_Four_ww7sec.png" alt="String pool 2" >
</p>

```java
// String objects
String str1 = new String("MANOJ");
String str2 = new String("MANOJ");
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708796084/OWN%20IMAGES/String_FIVE_kxe1gb.png" alt="String pool 2" >
</p>

## 6. String Concatenation Example

```java
String str1 = "Manoj";
String str2 = "Kumar";
String result = str1 + " " + str2; // Result: Manoj Kumar
```

## 7. String is Immutable

- Once a String object is created, its state cannot be modified.
- Any operation on a String creates `a new String`.

```java
// String literal
String str1 = "MANOJ";
String str2 = "MANOJ";
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708795046/OWN%20IMAGES/String_Three_j5gtj9.png" alt="String pool 1" >
</p>

```java
// Both string literal are updated now
str1 = "RISHABH";
str2 = "SANOJ";
```

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708795808/OWN%20IMAGES/String_Four_ww7sec.png" alt="String pool 2" >
</p>

## 8. Compare Two Strings Example

**EXAMPLE 1**

```Java
// Example with string literals

public class StringComparisonExample {
    public static void main(String[] args) {
        // Initializing two strings
        String str1 = "MANOJ";
        String str2 = "MANOJ";

        // Using == for string comparison
        if (str1 == str2) {
            System.out.println("Using ==: str1 and str2 are the same object.");
        } else {
            System.out.println("Using ==: str1 and str2 are different objects.");
        }

        // Using equals() for string comparison
        if (str1.equals(str2)) {
            System.out.println("Using equals(): str1 and str2 have the same content.");
        } else {
            System.out.println("Using equals(): str1 and str2 do not have the same content.");
        }
    }
}

/*
Expected output:
Using ==: str1 and str2 are the same object.
Using equals(): str1 and str2 have the same content.
*/
```

**🚀Explanation:**

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708795046/OWN%20IMAGES/String_Three_j5gtj9.png" alt="String pool 1" >
</p>

- The `==` operator checks if the two string references (`str1` and `str2`) point to the `same object in memory`. In this case, they do, as both strings are string literals, and Java optimizes string literals to use the same memory location if they have the same content.

- The `equals()` method checks whether the content of the two strings is the same. In this case, the content of `str1` and `str2` is `"MANOJ"` so the `equals()` method returns `true`.

  **EXAMPLE 2**

```java
// Example with string objects

public class StringComparisonExample {
    public static void main(String[] args) {
        // Initializing two strings using new String objects
        String str1 = new String("MANOJ");
        String str2 = new String("MANOJ");

        // Using == for string comparison
        if (str1 == str2) {
            System.out.println("Using ==: str1 and str2 are the same object.");
        } else {
            System.out.println("Using ==: str1 and str2 are different objects.");
        }

        // Using equals() for string comparison
        if (str1.equals(str2)) {
            System.out.println("Using equals(): str1 and str2 have the same content.");
        } else {
            System.out.println("Using equals(): str1 and str2 do not have the same content.");
        }
    }
}

/*
Expected output:
Using ==: str1 and str2 are different objects.
Using equals(): str1 and str2 have the same content.
*/
```

**🚀Explanation:**

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708796084/OWN%20IMAGES/String_FIVE_kxe1gb.png" alt="String pool 2" >
</p>



## 9. Taking Input as a String from User

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String userInput = scanner.nextLine();
```

## 10. Important String Methods

Let's go through each method in the provided Java program and understand its purpose:

```java
// String Methods Example

import java.util.Scanner;

public class StringMethodsExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input as a string from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // 1. .length()
        int length = getLength(userInput);
        System.out.println("Length of the string: " + length);

        // 2. .charAt(int index)
        char charAtIndex = getCharAtIndex(userInput, 1);
        System.out.println("Character at index 1: " + charAtIndex);

        // 3. .substring(int beginIndex, int endIndex)
        String substringExample = getSubstring(userInput, 2, 5);
        System.out.println("Substring from index 2 to 5: " + substringExample);

        // 4. .contains(CharSequence s)
        boolean containsExample = containsSubstring(userInput, "world");
        System.out.println("Contains 'world': " + containsExample);

        // 5. .equals(Object another)
        boolean equalsExample = checkEquality(userInput, "Hello, Java!");
        System.out.println("Equals 'Hello, Java!': " + equalsExample);

        // 6. .equalsIgnoreCase(String anotherString)
        boolean equalsIgnoreCaseExample = checkEqualityIgnoreCase(userInput, "HELLO, JAVA!");
        System.out.println("EqualsIgnoreCase 'HELLO, JAVA!': " + equalsIgnoreCaseExample);

        // 7. .toUpperCase()
        String upperCaseExample = convertToUpperCase(userInput);
        System.out.println("Uppercase: " + upperCaseExample);

        // 8. .toLowerCase()
        String lowerCaseExample = convertToLowerCase(userInput);
        System.out.println("Lowercase: " + lowerCaseExample);

        // 9. .trim()
        String trimmedExample = trimString(userInput);
        System.out.println("Trimmed string: " + trimmedExample);

        // 10. .split(String regex)
        String[] splitExample = splitString(userInput, ",");
        System.out.println("Split by comma: ");
        for (String part : splitExample) {
            System.out.println(part);
        }

        // 11. .startsWith(String prefix)
        boolean startsWithExample = startsWithPrefix(userInput, "Hello");
        System.out.println("Starts with 'Hello': " + startsWithExample);

        // 12. .endsWith(String suffix)
        boolean endsWithExample = endsWithSuffix(userInput, "Java!");
        System.out.println("Ends with 'Java!': " + endsWithExample);

        // 13. .valueOf(any type)
        String valueOfExample = convertToStringValueOf(42);
        System.out.println("ValueOf for integer 42: " + valueOfExample);

        // 14. .replace(char oldChar, char newChar)
        String replacedExample = replaceChar(userInput, 'o', 'X');
        System.out.println("Replace 'o' with 'X': " + replacedExample);

        // 15. toCharArray()
        char[] charArrayExample = convertToCharArray(userInput);
        System.out.println("Char array: ");
        for (char c : charArrayExample) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 16. .isEmpty()
        boolean isEmptyExample = checkIfEmpty(userInput);
        System.out.println("Is empty: " + isEmptyExample);

        // 17. .isBlank()
        boolean isBlankExample = checkIfBlank(userInput);
        System.out.println("Is blank: " + isBlankExample);
    }

    // 1. .length()
    private static int getLength(String str) {
        return str.length();
    }

    // 2. .charAt(int index)
    private static char getCharAtIndex(String str, int index) {
        return str.charAt(index);
    }

    // 3. .substring(int beginIndex, int endIndex)
    private static String getSubstring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    // 4. .contains(CharSequence s)
    private static boolean containsSubstring(String str, CharSequence s) {
        return str.contains(s);
    }

    // 5. .equals(Object another)
    private static boolean checkEquality(String str, String another) {
        return str.equals(another);
    }

    // 6. .equalsIgnoreCase(String anotherString)
    private static boolean checkEqualityIgnoreCase(String str, String another) {
        return str.equalsIgnoreCase(another);
    }

    // 7. .toUpperCase()
    private static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    // 8. .toLowerCase()
    private static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    // 9. .trim()
    private static String trimString(String str) {
        return str.trim();
    }

    // 10. .split(String regex)
    private static String[] splitString(String str, String regex) {
        return str.split(regex);
    }

    // 11. .startsWith(String prefix)
    private static boolean startsWithPrefix(String str, String prefix) {
        return str.startsWith(prefix);
    }

    // 12. .endsWith(String suffix)
    private static boolean endsWithSuffix(String str, String suffix) {
        return str.endsWith(suffix);
    }

    // 13. .valueOf(any type)
    private static String convertToStringValueOf(int value) {
        return String.valueOf(value);
    }

    // 14. .replace(char oldChar, char newChar)
    private static String replaceChar(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    // 15. toCharArray()
    private static char[] convertToCharArray(String str) {
        return str.toCharArray();
    }

    // 16. .isEmpty()
    private static boolean checkIfEmpty(String str) {
        return str.isEmpty();
    }

    // 17. .isBlank()
    private static boolean checkIfBlank(String str) {
        return str.isBlank();
    }
}
```

`📝Method 1:` getLength(String str)

- **Description:** Returns the length of the input string.
- **Example:** `getLength("Hello")` returns `5`.

`📝Method 2:` getCharAtIndex(String str, int index)

- **Description:** Returns the character at the specified index in the input string.
- **Example:** `getCharAtIndex("Hello", 1)` returns `'e'`.

`📝Method 3:` getSubstring(String str, int beginIndex, int endIndex)

- **Description:** Returns a substring of the input string from `beginIndex` to `endIndex`.
- **Example:** `getSubstring("Hello, Java!", 2, 5)` returns `"llo"`.

`📝Method 4:` containsSubstring(String str, CharSequence s)

- **Description:** Checks if the input string contains the specified substring.
- **Example:** `containsSubstring("Hello, Java!", "world")` returns `false`.

`📝Method 5:` checkEquality(String str, String another)

- **Description:** Checks if the input string is equal to another string using the `equals` method.
- **Example:** `checkEquality("Hello, Java!", "Hello, Java!")` returns `true`.

`📝Method 6:` checkEqualityIgnoreCase(String str, String another)

- **Description:** Checks if the input string is equal to another string (case-insensitive) using the `equalsIgnoreCase` method.
- **Example:** `checkEqualityIgnoreCase("Hello, Java!", "HELLO, JAVA!")` returns `true`.

`📝Method 7:` convertToUpperCase(String str)

- **Description:** Converts the input string to uppercase.
- **Example:** `convertToUpperCase("Hello")` returns `"HELLO"`.

`📝Method 8:` convertToLowerCase(String str)

- **Description:** Converts the input string to lowercase.
- **Example:** `convertToLowerCase("Hello")` returns `"hello"`.

`📝Method 9:` trimString(String str)

- **Description:** Removes leading and trailing whitespaces from the input string.
- **Example:** `trimString(" Hello ")` returns `"Hello"`.

`📝Method 10:` splitString(String str, String regex)

- **Description:** Splits the input string into an array of substrings based on the specified regular expression.
- **Example:** `splitString("one,two,three", ",")` returns `["one", "two", "three"]`.

`📝Method 11:` startsWithPrefix(String str, String prefix)

- **Description:** Checks if the input string starts with the specified prefix.
- **Example:** `startsWithPrefix("Hello, Java!", "Hello")` returns `true`.

`📝Method 12:` endsWithSuffix(String str, String suffix)

- **Description:** Checks if the input string ends with the specified suffix.
- **Example:** `endsWithSuffix("Hello, Java!", "Java!")` returns `true`.

`📝Method 13:` convertToStringValueOf(int value)

- **Description:** Converts the input value to its string representation using `valueOf`.
- **Example:** `convertToStringValueOf(42)` returns `"42"`.

`📝Method 14:` replaceChar(String str, char oldChar, char newChar)

- **Description:** Replaces all occurrences of the specified old character with the new character in the input string.
- **Example:** `replaceChar("Hello", 'o', 'X')` returns `"HellX"`.

`📝Method 15:` convertToCharArray(String str)

- **Description:** Converts the input string to a character array.
- **Example:** `convertToCharArray("Hello")` returns `['H', 'e', 'l', 'l', 'o']`.

`📝Method 16:` checkIfEmpty(String str)

- **Description:** Checks if the input string is empty.
- **Example:** `checkIfEmpty("")` returns `true`.

`📝Method 17:` checkIfBlank(String str)

- **Description:** Checks if the input string is empty or contains only whitespace characters.
- **Example:** `checkIfBlank(" ")` returns `true`.
