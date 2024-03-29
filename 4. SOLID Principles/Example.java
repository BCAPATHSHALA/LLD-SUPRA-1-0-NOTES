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


/* Not Violet LSP
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
*/


/* Violet LSP
// Supar Class: Vehicle
class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle may have engine");
    }
    public void doMovement(){
        System.out.println("Vehicle can move");
    }
    public void fly(){
        System.out.println("Vehicle may fly");
    }
}

// Subclass: Car
class Car extends Vehicle { 
    @Override
    public void startEngine(){
        System.out.println("Car have engine");
    }
    @Override
    public void doMovement() {
        System.out.println("Car can move");
    }
    // Exception 1: Car cannot fly, so we don't override the fly method
}

// Subclass: Cycle
class Cycle extends Vehicle { 
    // Exception 1: Cycle does not have engine, so we don't override the startEngine method
    @Override
    public void doMovement() {
        System.out.println("Cycle can move");
    }
    // Exception 2: Cycle cannot fly, so we don't override the fly method
}

// Subclass: Airplane
class Airplane extends Vehicle { 
    @Override
    public void startEngine() {
        System.out.println("Airplane have engine");
    }
    @Override
    public void doMovement() {
        System.out.println("Airplane can move");
    }
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}

public class Example{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle cycle = new Cycle();
        Vehicle airplane = new Airplane();

        // Car violet LSP
        car.startEngine(); // Car have engine
        car.doMovement(); // Car can move
        car.fly(); // Vehicle may fly

        // Cycle violet LSP
        cycle.startEngine(); // Vehicle may have engine
        cycle.doMovement(); // Cycle can move
        cycle.fly(); // Vehicle may fly

        // Only Airplane not violet LSP
        airplane.startEngine(); // Airplane have engine
        airplane.doMovement(); // Airplane can move
        airplane.fly(); // Airplane can fly
    }
}

*/


/* Not Violet LSP

// Supar Class: Vehicle
class Vehicle{
    // Consumer Method
    public void consumerFun(Vehicle vehicle){
        vehicle.doMovement();
    }
    public void doMovement(){
        System.out.println("Vehicle can move");
    }
}


// Interface: IHaveEngine
interface IHaveEngine {
    void startEngine();
}

// Interface: IFlyable
interface IFlyable{
    void fly();
}

// Subclass: Car
class Car extends Vehicle implements IHaveEngine{ 
    @Override
    public void startEngine(){
        System.out.println("Car have engine");
    }
    @Override
    public void doMovement() {
        System.out.println("Car can move");
    }
}

// Subclass: Cycle
class Cycle extends Vehicle { 
    @Override
    public void doMovement() {
        System.out.println("Cycle can move");
    }
}

// Multiple Inheritance for Airplane
// interface IFlyable_IHaveEngine extends IHaveEngine, IFlyable{}

// Subclass: Airplane
class Airplane extends Vehicle implements IHaveEngine, IFlyable { 
    @Override
    public void startEngine() {
        System.out.println("Airplane have engine");
    }
    @Override
    public void doMovement() {
        System.out.println("Airplane can move");
    }
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}

public class Example{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle cycle = new Cycle();
        Vehicle airplane = new Airplane();

        // Meaning Of Substitution: Any derived class should be able to substitute its parent class without the consumer knowing it
        vehicle.consumerFun(vehicle); // Vehicle can move
        vehicle.consumerFun(car); // Car can move
        vehicle.consumerFun(cycle); // Cycle can move
        vehicle.consumerFun(airplane); // Airplane can move
    }
}
*/

/* Violet LSP
// Supar Class: Human
class Human{
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
    public void work(){
        System.out.println("Human can work");
    }
    public void makeDinner(){
        System.out.println("Human can make dinner");
    }
}

// Subclass: Child
class Child extends Human { 
    public void eat(){
        System.out.println("Child is eating");
    }
    public void sleep(){
        System.out.println("Child is sleeping");
    }
    // Exception 1: Child cannot work, so we don't override the work method
    // Exception 2: Child cannot make dinner, so we don't override the makeDinner method
}

// Subclass: Adult
class Adult extends Human { 
    public void eat(){
        System.out.println("Adult is eating");
    }
    public void sleep(){
        System.out.println("Adult is sleeping");
    }
    public void work(){
        System.out.println("Adult can work");
    }
    public void makeDinner(){
        System.out.println("Adult can make dinner");
    }
}

public class Example{
    public static void main(String[] args) {
        Human child = new Child();
        Human adult = new Adult();

        // Child violet LSP
        child.eat(); // Child is eating
        child.sleep(); // Child is sleeping
        child.work(); // Human can work
        child.makeDinner(); // Human can make dinner
    

        // Only adult not violet LSP
        adult.eat(); // Adult is eating
        adult.sleep(); // Adult is sleeping
        adult.work(); // Adult can work
        adult.makeDinner(); // Adult can make dinner        
    }
}
*/

// Not Violet LSP
// Supar Class: Human
class Human{
    public void consumerFun(Human human){
        human.eat();
        human.sleep();
    }
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}

// Interface: IDoWork
interface IDoWork{
    void work();
}

// Interface: IMakeDinner
interface IMakeDinner{
    void makeDinner();
}


// Subclass: Child
class Child extends Human { 
    public void eat(){
        System.out.println("Child is eating");
    }
    public void sleep(){
        System.out.println("Child is sleeping");
    }
}

// Subclass: Adult
class Adult extends Human implements IDoWork, IMakeDinner { 
    public void eat(){
        System.out.println("Adult is eating");
    }
    public void sleep(){
        System.out.println("Adult is sleeping");
    }
    public void work(){
        System.out.println("Adult can work");
    }
    public void makeDinner(){
        System.out.println("Adult can make dinner");
    }
}

public class Example{
    public static void main(String[] args) {
        Human human = new Human();
        Human child = new Child();
        Human adult = new Adult();

        human.consumerFun(human);     
        human.consumerFun(child); 
        human.consumerFun(adult);
    }
}

/*
Expected Output:
Human is sleeping
Child is eating
Child is sleeping
Adult is eating
Adult is sleeping
*/