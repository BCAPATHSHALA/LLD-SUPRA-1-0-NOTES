// Step 1: Element Interface
interface Animal {
    void accept(Visitor visitor);
}

// Step 2: Concrete Elements
class Dog implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}

class Cat implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // First Dispatch
    }
}

// Step 3: Visitor Interface
interface Visitor {
    void visit(Dog dog);
    void visit(Cat cat);
}

// Step 4: Concrete Visitor
class SoundVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Dog barks"); // Second Dispatch
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Cat meows"); // Second Dispatch
    }
}

// Step 5: Client Code
public class DoubleDispatch {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Visitor soundVisitor = new SoundVisitor();

        dog.accept(soundVisitor); // First dispatch (Dog -> accept()), Second dispatch (Visitor -> visit(Dog))
        cat.accept(soundVisitor); // First dispatch (Cat -> accept()), Second dispatch (Visitor -> visit(Cat))
    }
}
