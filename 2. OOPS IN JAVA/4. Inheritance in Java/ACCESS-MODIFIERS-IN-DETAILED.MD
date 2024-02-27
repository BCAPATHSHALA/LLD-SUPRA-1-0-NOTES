# 📝Access Modifiers in Java

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1708961922/ACCESS_MODIFIERS_IN_JAVA_y8xnh6.png" alt="Access modifiers in Java" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

Inheritance involves access modifiers that `control` the visibility of members in different classes

- `📦Default (no modifier):` Accessible only within the same package.
- `🔒Private:` Accessible only within the same class.
- `🔐Protected:` Accessible within the same package and subclass in a different package.
- `🔓Public:` Accessible from any class.

# 1. 📦 Default (No Modifier):

## `Scenario 1:` Same Package, Same Class

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709056383/OWN%20IMAGES/Default_Member_-_same_package_same_class_h3w9gn.png" alt="Access modifiers: Same Package, Same Class" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

class ClassA {
    void displayA() {
        System.out.println("Default (no modifier) - Accessible only within the same package");
    }
}
```

## `Scenario 2:` Same Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709056703/OWN%20IMAGES/Default_Member_-_same_package_sub_class_suvz7u.png" alt="Access modifiers: Same Package, Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // Accessible in the subclass
    }
}
```

## `Scenario 3:` Same Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709057233/OWN%20IMAGES/Default_Member_-_same_package_Non_Subclass_bmy3h4.png" alt="Access modifiers: Same Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB {
    void displayB() {
        ClassA objA = new ClassA();
        objA.display(); // Accessible even in a non-subclass within the same package
    }
}

```

## `Scenario 4:` Different Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709058020/OWN%20IMAGES/Default_Member_-_Different_package_Sub_Subclass_nazdfd.png" alt="Access modifiers: Different Package, Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // This would result in a compilation error as default is not accessible in different package
    }
}
```

## `Scenario 5:` Different Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709058480/OWN%20IMAGES/Default_Member_-_Different_package_Non_Sub_Subclass_wqcz7k.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB {
    void displayB() {
        ClassA objA = new ClassA();
        objA.displayA(); // This would result in a compilation error as default is not accessible in different package
    }
}
```

# 2. 🔒 Private:

## `Scenario 1:` Same Package, Same Class

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709059140/OWN%20IMAGES/Private_Member_-_same_package_same_class_bmlgqw.png" alt="Access modifiers: Same Package, Same Class" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

class ClassA {
    private void displayA() {
        System.out.println("Private - Accessible only within the same class");
    }
}
```

## `Scenario 2:` Same Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709059498/OWN%20IMAGES/Private_Member_-_same_package_subclass_xqyzyo.png" alt="Access modifiers: Same Package, Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // This would result in a compilation error as private is not accessible in a subclass
    }
}
```

## `Scenario 3:` Same Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709059835/OWN%20IMAGES/Private_Member_-_same_package_non_subclass_ubfgjb.png" alt="Access modifiers: Same Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB {
    void displayB() {
        ClassA objA = new ClassA();
        objA.displayA(); // This would result in a compilation error as private is not accessible in a non-subclass
    }
}
```

## `Scenario 4:` Different Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709060254/OWN%20IMAGES/Private_Member_-_different_package_subclass_mimodk.png" alt="Access modifiers: Different Package, Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // This would result in a compilation error as private is not accessible in different package
    }
}
```

## `Scenario 5:` Different Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709060575/OWN%20IMAGES/Private_Member_-_different_package_non_subclass_lqlzpk.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB {
    void accessPrivateMethod() {
        ClassA objA = new ClassA();
        objA.displayA(); // This would result in a compilation error as private is not accessible in different package
    }
}
```

# 3. 🔐 Protected:

## `Scenario 1:` Same Package, Same Class

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062423/OWN%20IMAGES/Protected_Member_-_same_package_same_class_l8mssu.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

class ClassA {
    protected void displayA() {
        System.out.println("Protected - Accessible within the same package and subclass in a different package");
    }
}
```

## `Scenario 2:` Same Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062425/OWN%20IMAGES/Protected_Member_-_same_package_subclass_txa2eg.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // Accessible in the subclass
    }
}
```

## `Scenario 3:` Same Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062423/OWN%20IMAGES/Protected_Member_-_same_package_non_subclass_or03jy.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

class ClassB {
    void displayB() {
        ClassA objA = new ClassA();
        objA.displayA(); // Accessible even in a non-subclass within the same package
    }
}
```

## `Scenario 4:` Different Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062422/OWN%20IMAGES/Protected_Member_-_different_package_subclass_pycbrs.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // Accessible in the subclass, even in a different package
    }
}
```

## `Scenario 5:` Different Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062422/OWN%20IMAGES/Protected_Member_-_different_package_non_subclass_rzl3e3.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB {
    void displayB() {
        ClassA objA = new ClassB();
        objA.displayA(); // This would result in a compilation error as protected is not accessible in different package, non-subclass
    }
}

```

# 4. 🔓 Public:

## `Scenario 1:` Same Package, Same Class

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062430/OWN%20IMAGES/Public_Member_-_same_package_same_class_acho4s.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;

public class ClassA {
    public void displayA() {
        System.out.println("Public - Accessible from any class");
    }
}

```

## `Scenario 2:` Same Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062432/OWN%20IMAGES/Public_Member_-_same_package_subclass_fpn13p.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // Accessible in the subclass
    }
}
```

## `Scenario 3:` Same Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062429/OWN%20IMAGES/Public_Member_-_same_package_non_subclass_aczcjm.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package example;
import example.ClassA;

class ClassB {
    void displayB() {
        ClassA objA = new ClassA();
        objA.displayA(); // Accessible even in a non-subclass within the same package
    }
}
```

## `Scenario 4:` Different Package, Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062427/OWN%20IMAGES/Public_Member_-_different_package_subclass_auovjc.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB extends ClassA {
    void displayB() {
        displayA(); // Accessible in the subclass, even in a different package
    }
}
```

## `Scenario 5:` Different Package, Non-Subclass

<p align="center">
  <img src="https://res.cloudinary.com/dq3pru6ji/image/upload/v1709062426/OWN%20IMAGES/Public_Member_-_different_package_non_subclass_yqmuwb.png" alt="Access modifiers: Different Package, Non-Subclass" style="border: 10px solid #b2f2bb; border-radius: 4px;">
</p>

```java
package other;
import example.ClassA;

class ClassB{
    void displayB() {
        ClassA objA = new ClassA();
        objA.displayA(); // Accessible in a different package, non-subclass
    }
}
```
