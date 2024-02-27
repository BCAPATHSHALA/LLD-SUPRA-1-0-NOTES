public class StudentTwo {
    // Attributes (Variables)
    private int id;
    private String name;
    private String gfName;

    // Behaviours (Methods)
    public void getId(){
        System.out.println("ID: "+id);
    }
    public void setId(int id){
        this.id = id;
    }
    public void getName(){
        System.out.println("Name: "+ name);
    }
    public void setName(String name){
        this.name = name;
    }
    public void getGFName(){
        System.out.println("GF Name: "+gfName);
    }
    public void setGFName(String gfName){
        this.gfName = gfName;
    }
}