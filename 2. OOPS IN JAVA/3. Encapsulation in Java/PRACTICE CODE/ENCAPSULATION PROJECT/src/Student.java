public class Student {
    // Attributes (Variables)
    public int id;
    public String name;
    public int age;
    public int nos;
    private String gfName;

    public Student(int id, String name, int age, int nos, String gfName){
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gfName = gfName;
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
    public void gfName(){
        System.out.println("I love " + gfName);
    }
}