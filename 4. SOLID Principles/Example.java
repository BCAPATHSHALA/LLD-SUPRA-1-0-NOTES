/* Violet LSP
// Super Class: Bird
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat() {
        System.out.println("Bird is eating");
    }

    public void walk() {
        System.out.println("Bird is walking");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}

// Subclass: Penguin
class Penguin extends Bird {
    // Exception 1: Penguins cannot fly, so we don't override the fly method
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");        
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

// Subclass: Ostrich
class Ostrich extends Bird {
    // Exception 1: Ostriches cannot fly, so we don't override the fly method
    // Exception 2: Ostriches cannot swim, so we don't override the swim method
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

// Subclass: Sparrow
class Sparrow extends Bird {
    // Exception 1: Sparrow cannot swim, so we don't override the swim method
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
    
}

// Main class
public class Example {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird ostrich = new Ostrich();
        Bird sparrow = new Sparrow();

        // Violet LSP: All subclasses can be substituted for their base class
        penguin.fly(); // Bird is flying
        penguin.eat(); // Penguin is eating
        penguin.walk(); // Penguin is walking
        penguin.swim(); // Penguin is swimming

        ostrich.fly(); // Bird is flying
        ostrich.eat(); // Ostrich is eating
        ostrich.walk(); // Ostrich is walking
        ostrich.swim(); // Bird is swimming

        sparrow.fly(); // Sparrow is flying
        sparrow.eat(); // Sparrow is eating
        sparrow.walk(); // Sparrow is walking
        sparrow.swim(); // Bird is swimming
    }
}
*/


// Not Violet LSP
// Supar Class: Bird
class Bird{
    public void fun(Bird bird){
        bird.eat();
    }
    public void eat(){
        System.out.println("Bird is eating");
    }
    public void walk(){
        System.out.println("Bird is walking");
    }
}

// Interface: IFlyable
interface IFlyable{
    void fly();
}

// Interface: ISwimmable
interface ISwimmable{
    void swim();
}

// Subclass: Sparrow
class Sparrow extends Bird implements IFlyable { 
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void walk() {
        System.out.println("Sparrow is walking");
    }
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

// Subclass: Ostrich
class Ostrich extends Bird { 
    @Override
    public void walk() {
        System.out.println("Ostrich is walking");
    }
    @Override
    public void eat() {
        System.out.println("Ostrich is eating");
    }
}

// Subclass: Penguin
class Penguin extends Bird implements ISwimmable { 
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");        
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class Example{
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();
        Bird penguin = new Penguin();

        // Meaning Of Substitution: Any derived class should be able to substitute its parent class without the consumer knowing it
        bird.fun(bird); // Bird is eating
        bird.fun(sparrow); // Sparrow is eating
        bird.fun(ostrich); // Ostrich is eating
        bird.fun(penguin); // Penguin is eating

        sparrow.eat(); // Sparrow is eating
        sparrow.walk(); // Sparrow is walking

        ostrich.eat(); // Ostrich is eating
        ostrich.walk(); // Ostrich is walking

        penguin.eat(); // Penguin is eating
        penguin.walk(); // Penguin is walking
    }
}