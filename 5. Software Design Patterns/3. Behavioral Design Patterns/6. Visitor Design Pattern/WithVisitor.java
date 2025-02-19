import java.util.ArrayList;
import java.util.List;

// Step 1: Visitor Interface
interface Visitor {
    void visit(FullTimeEmployee employee);
    void visit(PartTimeEmployee employee);
}

// Step 2: Concrete Visitor for Tax Calculation
class TaxVisitor implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println(employee.name + " Tax: " + (employee.salary * 0.25));
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println(employee.name + " Tax: " + (employee.salary * 0.15));
    }
}

// Todo: New Concrete Visitor for Bonus Calculation
class BonusVisitor implements Visitor {
    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println(employee.name + " Bonus: " + (employee.salary * 0.10));
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println(employee.name + " Bonus: " + (employee.salary * 0.05));
    }
}


// Step 3: Element Interface
interface Employee {
    void accept(Visitor visitor);
}

// Step 4: Concrete Elements
class FullTimeEmployee implements Employee {
    String name;
    double salary;

    FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class PartTimeEmployee implements Employee {
    String name;
    double salary;

    PartTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Step 5: Client Code
public class WithVisitor {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Rahul", 50000)); // Rahul Tax: 12500.0
        employees.add(new PartTimeEmployee("Amit", 50000)); // Amit Tax: 7500.0

        Visitor taxVisitor = new TaxVisitor();

        for (Employee emp : employees) {
            emp.accept(taxVisitor);
        }

        // Todo: New Bonus Calculation
        System.out.println("\nCalculating Bonuses:");
        Visitor bonusVisitor = new BonusVisitor();
        for (Employee emp : employees) {
            emp.accept(bonusVisitor);
        }
    }
}

/*
Final Output:
Rahul Tax: 12500.0
Amit Tax: 7500.0

Calculating Bonuses:
Rahul Bonus: 5000.0
Amit Bonus: 2500.0
*/