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

/* Not Violet LSP
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

Expected Output:
Human is sleeping
Child is eating
Child is sleeping
Adult is eating
Adult is sleeping
*/


/* Violet ISP
// Large Interface: IWorker
interface IWorker{
    void work();
    void eat();
}

class Human implements IWorker{
    @Override
    public void work() {
        System.out.println("Human (Manager) can work");
    }

    @Override
    public void eat() {
        System.out.println("Human (Manager) can eat");
    }
}

class Robot implements IWorker{
    @Override
    public void work() {
        System.out.println("Robot can work");
    }
    @Override
    public void eat() {
        // Robots don't eat, so this method should not be here (Violet ISP)
        System.out.println("Robot can't eat");
    }
}

public class Example {
    public static void main(String[] args) {
        IWorker human = new Human();
        IWorker robot = new Robot();

        // Human not violet ISP
        human.work(); // Human (Manager) can work
        human.eat(); // Human (Manager) can eat

        // Robot violet ISP
        robot.work(); // Robot can work
        robot.eat(); // Robot can't eat
    }
}
*/


/* Not Violet ISP
// Small Interface: IWorkable
interface IWorkable{
    void work();
}

// Small Interface: IEatable
interface IEatable{
    void eat();
}

class Human implements IWorkable, IEatable {
    @Override
    public void work() {
        System.out.println("Human (Manager) can work");
    }

    @Override
    public void eat() {
        System.out.println("Human (Manager) can eat");
    }
}

class Robot implements IWorkable{
    @Override
    public void work() {
        System.out.println("Robot can work");
    }
}

public class Example {
    public static void main(String[] args) {
        IWorkable humanWork = new Human();
        IEatable humanEat = new Human();
        IWorkable robotWork = new Robot();

        // Human not violet ISP
        humanWork.work(); // Human (Manager) can work
        humanEat.eat(); // Human (Manager) can eat

        // Robot not violet ISP
        robotWork.work(); // Robot can work
    }
}
*/

/* Violet ISP
// Large Interface: Shape
interface Shape{
    double area();
    double volume();
}

class Square implements Shape {
    @Override
    public double area() {
        System.out.println("Square have area");
        double area = 1.2;
        return area;
    }
    @Override
    public double volume() {
        // Square don't have volume, so this method should not be here (Violet ISP)
        System.out.println("Square does not have volume");
        double volume = 2.1;
        return volume;
    }
}

class Cube implements Shape{
    @Override
    public double area() {
        System.out.println("Cube have area");
        double area = 2.5;
        return area;
    }
    @Override
    public double volume() {
        System.out.println("Cube have surface area");
        double volume = 3.5;
        return volume;
    }
}

public class Example {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape cube = new Cube();

        // Square violet ISP
        square.area(); // Square have area
        square.volume(); // Square does not have volume 

        // Cube not violet ISP
        cube.area(); // Cube have area
        cube.volume(); // Cube have surface area
    }
}

*/


/* Not Violet ISP
// Large Interface: Shape
interface Shape{
    void display(double val);
}

// Small Interface: ITwoDShape
interface ITwoDShape extends Shape{
    double area();
}

// Small Interface: IThreeDShape
interface IThreeDShape extends Shape{
    double volume();
}

class Square implements ITwoDShape {
    private double side;
    Square(double side){
        this.side = side;
    }

    @Override
    public void display(double area) {
        System.out.printf("Square have area: %f", area);        
    }

    @Override
    public double area() {
        double area = side*side;
        return area;
    }
}

class Cube implements IThreeDShape {
    private double side;
    Cube(double side){
        this.side = side;
    }

    @Override
    public void display(double volume) {
        System.out.printf("Cube has volume: %f", volume);        
    }

    @Override
    public double volume() {
        double volume = side*side*side;
        return volume;
    }
}

public class Example {
    public static void main(String[] args) {
        ITwoDShape square = new Square(2.1);
        IThreeDShape cube = new Cube(4);

        // Square violet ISP
        double area = square.area(); 
        square.display(area); // Square have area: 4.410000

        // Cube violet ISP
        double volume = cube.volume();
        cube.display(volume); // Cube has volume: 64.000000
    }
}

*/

/* Violet DIP
// Higher level module: Application
class Application {
    private FileLogger logger;

    public Application(FileLogger logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}

// Lower level module: FileLogger
class FileLogger {

    public void log(String message) {
        // Code to write the message to a file
        System.out.println("Log method called");
    }
}

// New Lower level module: ConsoleLogger
class ConsoleLogger {

    public void clog(String message) {
        // Code to write the message to a file
        System.out.println("Clog method called");
    }
}

public class Example {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger();
        ConsoleLogger clogger = new ConsoleLogger();
        // We can't pass the cloogger as params in Application(clogger) without modifying the Application, other wise program gives an compile time error.
        Application app = new Application(logger);
        app.process();
    }
}

*/


/* Not Violet the DIP
// Step 1: Define the Abstraction

// Interface : Ilogger
interface ILogger {
    void log(String message);
}

// Step 2: Implement the Abstraction

// LLM 1: ConsoleLogger
class FileLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("FileLogger: " + message);
    }
}

// LLM 2: ConsoleLogger
class ConsoleLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ConsoleLogger: " + message);
    }
}

// LLM 3: ExternalServiceLogger
class ExternalServiceLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ExternalServiceLogger: " + message);
        // Code to send the message to an external service
        // This could involve HTTP requests, dealing with authentication, etc.
    }
}

// Step 3: Higher level app now depends upon Abstraction

// HLM 1: Application
class Application {
    private ILogger logger;

    public Application(ILogger logger) {
        this.logger = logger;
    }

    public void process() {
        logger.log("Application started");
        // Additional logic here
    }
}

public class Example {
    public static void main(String[] args) {
        ILogger fileLog = new FileLogger();
        ILogger consoleLog = new ConsoleLogger();
        ILogger externalServiceLog = new ExternalServiceLogger();
        
        // Now we dont need to change for passing fileLog, consoleLog, and externalServiceLog as paramas into Application
        Application app1 = new Application(fileLog);
        Application app2 = new Application(consoleLog);
        Application app3 = new Application(externalServiceLog);
        
        app1.process(); // FileLogger: Application started
        app2.process(); //  ConsoleLogger: Application started
        app3.process(); // ExternalServiceLogger: Application started
    }
}
*/


/* Violet DIP
// Higher level module: GoToWork
class GoToWork {
    private Metro metro;
    public GoToWork(Metro metro) {
        this.metro = metro;
    }

    public void process() {
        metro.travel("Transport started");
        // Additional logic here
    }
}

// Lower level module: Metro
class Metro {
    public void travel(String message) {
        // Code to write the message to a file
    }
}

// New Lower level module: Rapido
class Rapido {
    public void travel(String message) {
        // Code to write the message to a file
    }
}

public class Example {
    public static void main(String[] args) {
        Metro metroTransport = new Metro();
        Rapido rapidoTransport = new Rapido();
        // We can't pass the rapidoTransport as params in GoToWork(rapidoTransport) without modifying the GotoWork, other wise program gives an compile time error.
        GoToWork app = new GoToWork(metroTransport);
        app.process();
    }
}
*/



// Not Violet the DIP
// Step 1: Define the Abstraction

// Interface : ITransport
interface ITransport {
    void travel(String message);
}

// Step 2: Implement the Abstraction

// LLM 1: Metro
class Metro implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Metro: " + message);
    }
}

// LLM 2: Rapido
class Rapido implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Rapido: " + message);
    }
}

// LLM 3: Uber
class Uber implements ITransport {
    @Override
    public void travel(String message) {
        System.out.println("Uber: " + message);
    }
}

// Step 3: Higher level app now depends upon Abstraction

// HLM 1: GoToWork
class GoToWork {
    private ITransport transport;

    public GoToWork(ITransport transport) {
        this.transport = transport;
    }

    public void process() {
        transport.travel("transport started");
        // Additional logic here
    }
}

public class Example {
    public static void main(String[] args) {
        ITransport metroTrav = new Metro();
        ITransport rapidoTrav = new Rapido();
        ITransport uberTrav = new Uber();
        
        // Now we don't need to change for passing metroTrav, rapidoTrav, and uberTrav as paramas into GoToWork
        GoToWork transport1 = new GoToWork(metroTrav);
        GoToWork transport2 = new GoToWork(rapidoTrav);
        GoToWork transport3 = new GoToWork(uberTrav);     


        transport1.process(); // Metro: transport started
        transport2.process(); // Rapido: transport started
        transport3.process(); // Uber: transport started
    }
}


