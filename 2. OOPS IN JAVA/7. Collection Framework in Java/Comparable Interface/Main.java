import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define the Student class implementing Comparable
class Student implements Comparable<Student> {
    private int age;
    private String name;
    private int weight;

    // Constructor
    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getter methods
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Override the compareTo method
    @Override
    public int compareTo(Student other) {
        // Compare based on age
        return this.age - other.age; 
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

// Main class to demonstrate sorting
public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "RISHABH", 55));
        students.add(new Student(19, "UMESH", 60));
        students.add(new Student(20, "ARIF", 65));

        System.out.println("Before sorting:");
        System.out.println(students);

        // Sort the list using Collections.sort()
        Collections.sort(students);

        System.out.println("After sorting by age:");
        System.out.println(students);
    }
}

/*
OUTPUT:
Before sorting:
[Student{name='RISHABH', age=22, weight=55}, Student{name='UMESH', age=19, weight=60}, Student{name='ARIF', age=20, weight=65}]
After sorting by age:
[Student{name='UMESH', age=19, weight=60}, Student{name='ARIF', age=20, weight=65}, Student{name='RISHABH', age=22, weight=55}]
*/