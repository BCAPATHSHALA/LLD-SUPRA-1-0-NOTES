public class Student {
    // Attributes (Variables)
    public int id;
    public String name;
    public int age;
    public int nos;

    // Parameterized constructor
    public Student(int id, String name, int age, int nos){
        System.out.println("Student parameterized CTOR is called!!");
        // Initialize the memeber variables
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    // Copy constructor
    // sourceObj: it represent the manojObj
    public Student(Student sourceObj){
        System.out.println("Student copy CTOR is called!!");
        // Initialize the member variable through manojObj
        this.id = sourceObj.id;
        this.name = sourceObj.name;
        this.age = sourceObj.age;
        this.nos = sourceObj.nos;
    }

    // Behaviours (Methods)
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }
}