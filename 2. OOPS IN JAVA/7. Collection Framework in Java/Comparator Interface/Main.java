import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define the Student class
class Student {
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

    // Override toString for better output
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

// Main class to demonstrate sorting using Comparator
public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "RISHABH", 55));
        students.add(new Student(19, "UMESH", 60));
        students.add(new Student(20, "ARIF", 65));

        System.out.println("Before sorting:");
        System.out.println(students);

        // Sort by age using a Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge(); // Ascending order by age
            }
        });

        System.out.println("After sorting by age:");
        System.out.println(students);

        // Sort by name using a Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName()); // Alphabetical order by name
            }
        });

        System.out.println("After sorting by name:");
        System.out.println(students);

        // Sort by weight using a Comparator (using lambda for brevity)
        students.sort((s1, s2) -> s1.getWeight() - s2.getWeight()); // Ascending order by weight

        System.out.println("After sorting by weight:");
        System.out.println(students);
    }
}

/*
OUTPUT:
Before sorting:
[Student{name='RISHABH', age=22, weight=55}, Student{name='UMESH', age=19, weight=60}, Student{name='ARIF', age=20, weight=65}]
After sorting by age:
[Student{name='UMESH', age=19, weight=60}, Student{name='ARIF', age=20, weight=65}, Student{name='RISHABH', age=22, weight=55}]
After sorting by name:
[Student{name='ARIF', age=20, weight=65}, Student{name='RISHABH', age=22, weight=55}, Student{name='UMESH', age=19, weight=60}]
After sorting by weight:
[Student{name='RISHABH', age=22, weight=55}, Student{name='UMESH', age=19, weight=60}, Student{name='ARIF', age=20, weight=65}]
*/