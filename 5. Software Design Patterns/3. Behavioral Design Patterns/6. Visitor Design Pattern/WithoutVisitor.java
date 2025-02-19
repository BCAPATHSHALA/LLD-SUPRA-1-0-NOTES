// Base Employee class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateTax(); // Hardcoded tax logic in the class itself
}

// Full-time Employee
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateTax() {
        return salary * 0.25; // Fixed 25% tax
    }
}

// Part-time Employee
class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateTax() {
        return salary * 0.15; // Fixed 15% tax
    }
}

// Client Code
public class WithoutVisitor {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Rahul", 50000);
        Employee emp2 = new PartTimeEmployee("Amit", 50000);

        System.out.println(emp1.name + " Tax: " + emp1.calculateTax()); // Rahul Tax: 12500.0
        System.out.println(emp2.name + " Tax: " + emp2.calculateTax()); // Amit Tax: 7500.0
    }
}
